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
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.hr.pojo.EngageMajorRelease;
import com.hr.pojo.EngageResume;
import com.hr.service.ConfigPublicCharServiceSjh;
import com.hr.service.EngageMajorReleaseService;
import com.hr.service.EngageResumeService;

@Controller
@RequestMapping("/resume")
public class ResumeController {
	@Autowired
	EngageMajorReleaseService majorReleaseService;
	@Autowired
	ConfigPublicCharServiceSjh configPublicCharServiceSjh;
	@Autowired
	EngageResumeService engageResumeService;
	
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
				String iPath = request.getSession().getServletContext().getRealPath("/")+"page/recruit/resume/img/"+System.currentTimeMillis()+file.getOriginalFilename();
				File f = new File(iPath);
				if(!f.exists()){
					f.createNewFile();
				}
				os = new BufferedOutputStream(new FileOutputStream(f));
				os.write(file.getBytes());
				os.flush();
				engageResume.setHumanPicture(iPath);
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
}
