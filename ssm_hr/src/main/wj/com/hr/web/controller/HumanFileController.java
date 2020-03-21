package com.hr.web.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hr.mapper.HumanFileStatus;
import com.hr.pojo.ConfigFileFirstKind;
import com.hr.pojo.ConfigMajor;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.HumanFile;
import com.hr.pojo.SalaryStandard;
import com.hr.service.ConfigFileFirstKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileThirdKindService;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.ConfigPublicCharServiceSjh;
import com.hr.service.HumanFileService;
import com.hr.service.SalaryStandardService;
import com.hr.util.ProjectToMapUtil;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/humanresources")
public class HumanFileController {
	
	@Autowired
	ConfigFileFirstKindService firstService;//一级机构
	@Autowired
	ConfigFileSecondKindService  secondService;//二级机构
	@Autowired
	ConfigFileThirdKindService thirdService;//三级机构
	@Autowired
	ConfigMajorKindService majorKindService;//职位种类
	@Autowired
	ConfigMajorService majorService;//职称
	@Autowired
	private HumanFileService humanfileservice;//人档案
	@Autowired
	private ConfigPublicCharServiceSjh configPublicCharServiceSjh;//公共字段
	@Autowired
	private SalaryStandardService salarystandardservice;//薪资标准
	
	@RequestMapping("humanRegist.do")
	public String human_regist(Model model) {
		List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
		List<ConfigMajorKind> zwlist = majorKindService.findConfigMajorKindAll();
		model.addAttribute("flist",list);
		model.addAttribute("zwlist",zwlist);
		List<String> zclist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("职称");
		List<String> glist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("国籍");
		List<String> mlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("民族");
		List<String> zlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("宗教信仰");
		List<String> zzlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("政治面貌");
		List<String> xlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("学历");
		List<String> jlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("教育年限");
		List<String> xlzylist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("专业");
		List<String> tlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("特长");
		List<String> alist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("爱好");
		List<SalaryStandard> xclist = salarystandardservice.findSalaryStandardAll();
//		System.out.println(xclist);
		model.addAttribute("zclist", zclist);
		model.addAttribute("glist", glist);
		model.addAttribute("mlist", mlist);
		model.addAttribute("zlist", zlist);
		model.addAttribute("zzlist", zzlist);
		model.addAttribute("xlist", xlist);
		model.addAttribute("jlist", jlist);
		model.addAttribute("xlzylist", xlzylist);
		model.addAttribute("tlist", tlist);
		model.addAttribute("alist", alist);
		model.addAttribute("xclist", xclist);
		return "forward:/page/humanResources/human_register.jsp";
	}
	//登记保存
	@RequestMapping("saveHumanRegister.do")
	public String saveHumanFile(@ModelAttribute HumanFile humanfile,Model model) {
		if (humanfile!=null&&!"".equals(humanfile)) {
			//生成唯一的ID
			long lon=System.currentTimeMillis();
			String humanId=String.valueOf(lon);
			humanfile.setHumanId(humanId);
			humanfile.setHumanFileStatus(HumanFileStatus.NO);
			humanfileservice.saveHumanFile(humanfile);
			//通过humanId查询出humanfile
			humanfile = humanfileservice.findHumanFileByHumanId(humanId);
			model.addAttribute("hufId", humanfile.getHufId());
			return "forward:/page/humanResources/success.jsp";
		}else {
			return "";
		}
		
	}
	//列出待复核的所有人资档案
	@RequestMapping("humanFileCheckList.do")
	  public String humanFileCheckList(@ModelAttribute HumanFile humanfile,Model model){
		List<HumanFile> checklist=humanfileservice.findHumanFileByStatus(HumanFileStatus.NO);
		model.addAttribute("checklist", checklist);
		model.addAttribute("count", checklist.size());
		return "forward:/page/humanResources/check_list.jsp";
		
	}
	
	
	//某个待复核的人资档案
	@RequestMapping(value="humanFileCheck.do")
	public String humanFileCheck(String humanid,Model model) {
//		System.out.println(humanid);
		if(humanid!=null&&!"".equals(humanid)){
			HumanFile human =humanfileservice.findHumanFileByHumanId(humanid);
//			System.out.println(human.getHumanId());
			List<String> zclist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("职称");
			List<String> glist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("国籍");
			List<String> mlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("民族");
			List<String> zlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("宗教信仰");
			List<String> zzlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("政治面貌");
			List<String> xlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("学历");
			List<String> jlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("教育年限");
			List<String> xlzylist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("专业");
			List<String> tlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("特长");
			List<String> alist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("爱好");
			List<SalaryStandard> xclist = salarystandardservice.findSalaryStandardAll();
			model.addAttribute("zclist", zclist);
			model.addAttribute("glist", glist);
			model.addAttribute("mlist", mlist);
			model.addAttribute("zlist", zlist);
			model.addAttribute("zzlist", zzlist);
			model.addAttribute("xlist", xlist);
			model.addAttribute("jlist", jlist);
			model.addAttribute("xlzylist", xlzylist);
			model.addAttribute("tlist", tlist);
			model.addAttribute("alist", alist);
			model.addAttribute("xclist", xclist);
			model.addAttribute("human", human);
			return "forward:/page/humanResources/human_check.jsp";
	}else {
		return "shibai";
	}
	}
	//某个待复核的人资档案通过审核
	@RequestMapping("humanFileCheckPass.do")
	public String humanFileCheckPass(@ModelAttribute HumanFile humanfile) {
		humanfile.setHumanFileStatus(HumanFileStatus.YES);
		System.out.println(humanfile.toString());
		Map<String,String> map = ProjectToMapUtil.toMap(humanfile);
		humanfileservice.changeHumanFile(map);
		return "forward:/page/humanResources/success.jsp";
	}

	//查询
	@RequestMapping("queryHumanFile.do")
	public String queryHumanFile() {
		return "forward:/page/humanResources/query_locate.jsp";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//上传照片、附件
//	@RequestMapping("uploadPictureFile.do")
//	public String savePictureFile(HttpServletRequest request,MultipartFile picFile,MultipartFile accFile,@ModelAttribute HumanFile humanfile) throws Exception {
//		String humanpicture=picFile.getOriginalFilename();
//		BufferedOutputStream os = null;
//		if(humanpicture!=null && !humanpicture.equals("")){
//			// 上传
//			String filepath = request.getContextPath()+"/page/humanResources/img/" + humanpicture;
//			String dir = request.getSession().getServletContext().getRealPath("/page/humanResources/img/")+ humanpicture;
//			System.out.println(filepath);
//			File file = new File(dir);
//			if(!file.exists()){
//				file.createNewFile();
//			}
//			os = new BufferedOutputStream(new FileOutputStream(file));
//			os.write(picFile.getBytes());
//			os.flush();
//			humanfile.setHumanPicture(filepath);
//			System.out.println(humanfile.getHumanPicture());
//			
//		}
//		// 获取附件名称
//		String attachmentname=accFile.getOriginalFilename();
//		if(attachmentname!=null && !attachmentname.equals("")){
//			// 上传
//			String filepath1 = request.getContextPath()+"/page/humanResources/img/" + attachmentname;
//			String dir1 = request.getSession().getServletContext().getRealPath("/page/humanResources/img/")+ attachmentname;
//			System.out.println(filepath1);
//			File file = new File(dir1);
//			if(!file.exists()){
//				file.createNewFile();
//			}
//			os = new BufferedOutputStream(new FileOutputStream(file));
//			os.write(accFile.getBytes());
//			os.flush();
//		    humanfile.setAttachmentName(filepath1);
//		}
//		Map<String,String> map = ProjectToMapUtil.toMap(humanfile);
//		humanfileservice.changeHumanFile(map);
//		try {
//			if(os!=null){
//				os.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return "";
//	}	

}

