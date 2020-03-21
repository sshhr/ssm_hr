package com.hr.web.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hr.pojo.ConfigMajor;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.ConfigPrimaryKey;
import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageMajorRelease;
import com.hr.pojo.EngageResume;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.ConfigPrimaryKeyService;
import com.hr.service.ConfigPublicCharServiceSjh;
import com.hr.service.EngageMajorReleaseService;
import com.hr.service.EngageResumeService;
import com.hr.service.ResumeService;
import com.hr.util.PrimaryKeyToDBfieldUtil;
import com.hr.util.ProjectToMapUtil;
import com.hr.util.ResumeState;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/resume")
public class ResumeController {
	@Autowired
	EngageMajorReleaseService majorReleaseService;
	@Autowired
	ConfigPublicCharServiceSjh configPublicCharServiceSjh;
	@Autowired
	EngageResumeService engageResumeService;
	@Autowired
	ConfigMajorKindService majorKindService;
	@Autowired
	ConfigMajorService majorService;
	@Autowired
	ConfigPrimaryKeyService  configPrimaryKeyService;
	
	//从职位发布管理模块跳过来
	@RequestMapping("register.do")
	public String resumeRegister(String mid,Model model){
		if(mid!=null&&!"".equals(mid)){
			List<String> mids = new ArrayList<String>();
			mids.add(mid);
			List<EngageMajorRelease> list = majorReleaseService.findEngageMajorReleaseByIds(mids);
			if(list.size()==1){
				model.addAttribute("mr", list.get(0));
				List<String> glist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("国籍");
				List<String> mlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("民族");
				List<String> zlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("宗教信仰");
				List<String> zzlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("政治面貌");
				List<String> xlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("学历");
				List<String> jlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("教育年限");
				List<String> xlzylist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("专业");
				List<String> tlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("特长");
				List<String> alist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("爱好");
				model.addAttribute("glist", glist);
				model.addAttribute("mlist", mlist);
				model.addAttribute("zlist", zlist);
				model.addAttribute("zzlist", zzlist);
				model.addAttribute("xlist", xlist);
				model.addAttribute("jlist", jlist);
				model.addAttribute("xlzylist", xlzylist);
				model.addAttribute("tlist", tlist);
				model.addAttribute("alist", alist);
				return "forward:/page/recruit/resume/register.jsp";
			}else{
				return "";
			}
		}else{
			return "";
		}
	}
	
	//简历的提交
	@RequestMapping("saveResumeRegister.do")
	public String saveResumeRegister(HttpServletRequest request,MultipartFile file,@ModelAttribute EngageResume engageResume,String humanBirthday,Model model){
		if(engageResume!=null&&!"".equals(engageResume)){
			BufferedOutputStream os = null;
			try {
				if(!"".equals(file.getOriginalFilename())){
					String pp = request.getContextPath()+"/page/recruit/resume/img/"+System.currentTimeMillis()+file.getOriginalFilename();
					String iPath = request.getSession().getServletContext().getRealPath("/")+"page/recruit/resume/img/"+System.currentTimeMillis()+file.getOriginalFilename();
					File f = new File(iPath);
					if(!f.exists()){
						f.createNewFile();
					}
					os = new BufferedOutputStream(new FileOutputStream(f));
					os.write(file.getBytes());
					os.flush();
					engageResume.setHumanPicture(pp);
				}
				engageResumeService.saveEngageResume(engageResume);
				return "";
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					if(os!=null){
						os.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	
	//简历的筛选
	@RequestMapping("resumeChoose.do")
	public String resumeChoose(Model model){
		List<ConfigMajorKind> list = majorKindService.findConfigMajorKindAll();
		model.addAttribute("mklist", list);
		return "forward:/page/recruit/resume/resume-choose.jsp";
	}
	
	//简历的筛选 职位的联动
	@RequestMapping(value="ByIdQueryMajor.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String byIdQueryMajor(String mid){
		if(mid!=null&&!"".equals(mid)){
			List<ConfigMajor> list = majorService.findConfigMajorByMajorKindId(mid);
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return "";
		}
	}
	
	
	//简历的筛选
	@RequestMapping("chooseQuery.do")
	public String chooseQuery(String humanmajorkindname,String checkstatus,String humanmajorname,String primarkey,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(humanmajorkindname!=null&&!"".equals(humanmajorkindname)){
			map.put("humanmajorkindname", humanmajorkindname);
		}
		if(checkstatus!=null&&!"".equals(checkstatus)){
			map.put("checkstatus", checkstatus);
		}
		if(humanmajorname!=null&&!"".equals(humanmajorname)){
			map.put("humanmajorname", humanmajorname);
		}
		if(primarkey!=null&&!"".equals(primarkey)){
			map.put("primarkey", primarkey);
			List<String> list = new ArrayList<>();
			List<ConfigPrimaryKey> ConfigPrimaryKeys = configPrimaryKeyService.findConfigPrimaryKeyByPrimaryKeyTable("EngageResume");
			for (ConfigPrimaryKey configPrimaryKey : ConfigPrimaryKeys) {
				list.add(PrimaryKeyToDBfieldUtil.ToDBfield(configPrimaryKey.getPrimaryKey()));
			}
			map.put("primarkeys", list);
		}
		if(startdate!=null&&!"".equals(startdate)){
			map.put("startdate", startdate);
		}
		if(enddate!=null&&!"".equals(enddate)){
			map.put("enddate", enddate);
		}
		List<EngageResume> engageResumelist = engageResumeService.findchooseQuery(map);
		model.addAttribute("resultList", engageResumelist);
		return "forward:/page/recruit/resume/resume-list.jsp";
	}
	
	//简历的筛选 后复核
	@RequestMapping("findValidResumeById.do")
	public String findValidResumeById(String resid,Model model){
		System.out.println(resid);
		if(resid!=null&&!"".equals(resid)){
			List<String> list = new ArrayList<>();
			list.add(resid);
			List<EngageResume> er = engageResumeService.findEngageResumeByIds(list);
			model.addAttribute("re", er.get(0));
			return "forward:/page/recruit/resume/resume-details.jsp";
		}
		
		return "";
	}
	
	@Autowired
	ResumeService resumeService;
	//简历的筛选 后推荐
	@RequestMapping("updateResume.do")
	public String updateResume(@ModelAttribute EngageResume engageResume,@ModelAttribute EngageInterview engageInterview,Model model){
		if(engageResume!=null&&!"".equals(engageResume)){
			engageResume.setCheckStatus(ResumeState.RECOMMEND_INTERVIEW);
			resumeService.updateResumeAndSaveEngageInterview(engageResume, engageInterview);
			return "forward:/resume/validResume.do";
		}
		return "";
	}
	
	//有效简历查询
	@RequestMapping("validResume.do")
	public String validResume(Model model){
		List<ConfigMajorKind> list = majorKindService.findConfigMajorKindAll();
		model.addAttribute("mklist", list);
		return "forward:/page/recruit/resume/valid-resume.jsp";
	}
	
	//简历的筛选
	@RequestMapping("validQuery.do")
	public String validQuery(String humanmajorkindname,String checkstatus,String humanmajorname,String primarkey,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(humanmajorkindname!=null&&!"".equals(humanmajorkindname)){
			map.put("humanmajorkindname", humanmajorkindname);
		}
		if(checkstatus!=null&&!"".equals(checkstatus)){
			map.put("checkstatus", checkstatus);
		}
		if(humanmajorname!=null&&!"".equals(humanmajorname)){
			map.put("humanmajorname", humanmajorname);
		}
		if(primarkey!=null&&!"".equals(primarkey)){
			map.put("primarkey", primarkey);
			List<String> list = new ArrayList<>();
			List<ConfigPrimaryKey> ConfigPrimaryKeys = configPrimaryKeyService.findConfigPrimaryKeyByPrimaryKeyTable("EngageResume");
			for (ConfigPrimaryKey configPrimaryKey : ConfigPrimaryKeys) {
				list.add(PrimaryKeyToDBfieldUtil.ToDBfield(configPrimaryKey.getPrimaryKey()));
			}
			map.put("primarkeys", list);
		}
		if(startdate!=null&&!"".equals(startdate)){
			map.put("startdate", startdate);
		}
		if(enddate!=null&&!"".equals(enddate)){
			map.put("enddate", enddate);
		}
		List<EngageResume> engageResumelist = engageResumeService.findchooseQuery(map);
		model.addAttribute("resultList", engageResumelist);
		return "forward:/page/recruit/resume/valid-list.jsp";
	}
	
}
