package com.hr.web.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.hr.pojo.ConfigFileFirstKind;
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
			humanfile.setHumanId("");
			humanfileservice.saveHumanFile(humanfile);
			//通过humanId查询出humanfile
//			humanfile = humanfileservice.findHumanFileByHumanId();
//			model.addAttribute("hufId", humanfile.getHufId();
			return "forward:/page/humanResources/register_choose_picture.jsp";
		}else {
			return "";
		}
		
	}

	//上传照片、附件
	@RequestMapping("uploadPictureFile.do")
	public String savePictureFile(HttpServletRequest request,MultipartFile picFile,MultipartFile accFile,HumanFile humanfile, Map map) throws Exception {
		String humanpicture=picFile.getOriginalFilename();
		if(humanpicture!=null && !humanpicture.equals("")){
			// 上传
			String dir = request.getSession().getServletContext().getRealPath("/page/humanResources/img");
			String filepath = dir + "/" + humanpicture;
			File file = new File(filepath);
			picFile.transferTo(file);
			humanfile.setHumanPicture(humanpicture);
			
		}
		// 获取附件名称
		String attachmentname=accFile.getOriginalFilename();
		if(humanpicture!=null && !humanpicture.equals("")){
		String iPath = request.getSession().getServletContext().getRealPath("/page/humanResources/img");
		String path = iPath + "/" + attachmentname;
		File f = new File(path);
		accFile.transferTo(f);
		humanfile.setAttachmentName(attachmentname);
		humanfileservice.changeHumanFile(map);
		}

	
			
		return "";
		
	
	
	}	

}

