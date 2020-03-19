package com.hr.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.ConfigPrimaryKey;
import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageResume;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigPrimaryKeyService;
import com.hr.service.EngageInterviewService;
import com.hr.service.EngageResumeService;
import com.hr.service.InterviewAndResmeService;
import com.hr.service.InterviewService;
import com.hr.util.PrimaryKeyToDBfieldUtil;

@Controller
@RequestMapping("/interview")
public class InterviewController {
	
	@Autowired
	ConfigMajorKindService majorKindService;
	@Autowired
	ConfigPrimaryKeyService configPrimaryKeyService;
	@Autowired
	EngageResumeService engageResumeService;
	@Autowired
	EngageInterviewService engageInterviewService;
	//面试简历查询
	@RequestMapping("interviewResumeQuery.do")
	public String interviewResumeQuery(Model model){
		List<ConfigMajorKind> list = majorKindService.findConfigMajorKindAll();
		model.addAttribute("mklist", list);
		return "forward:/page/recruit/interview/interview-resume.jsp";
	}
	
	//面试简历登记列表
	@RequestMapping("queryInterview.do")
	public String queryInterview(String humanmajorkindname,String checkstatus,String humanmajorname,String primarkey,String startdate,String enddate,Model model){
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
		return "forward:/page/recruit/interview/interview-list.jsp";
	}
	
	//面试简历查询 
	@RequestMapping("byIdQueryInterview.do")
	public String byIdQueryInterview(String resId,Model model){
		if(resId!=null&&!"".equals(resId)){
			List<String> list = new ArrayList<>();
			list.add(resId);
			List<EngageResume> engageResumes = engageResumeService.findEngageResumeByIds(list);
			model.addAttribute("re", engageResumes.get(0));
			EngageInterview e = engageInterviewService.findEngageInterviewByResumeId(engageResumes.get(0).getResId().toString());
			model.addAttribute("mscs", e.getInterviewAmount());
			return "forward:/page/recruit/interview/interview-register.jsp";
		}
		return "";
	}
	
	@Autowired
	InterviewService interviewService;
	//面试登记
	@RequestMapping("addInterviewOne.do")
	public String addInterviewOne(@ModelAttribute EngageResume engageResume,@ModelAttribute EngageInterview engageInterview,Model model){
		interviewService.changeInterviewDengji(engageResume, engageInterview);
		return "redirect:/interview/siftInterview.do";
	}
	
	//面试筛选
	@RequestMapping("siftInterview.do")
	public String siftInterview(Model model){
		List<EngageInterview> list = engageInterviewService.findEngageInterviewByInterviewStatus("2");
		model.addAttribute("vlist", list);
		return "forward:/page/recruit/interview/sift-list.jsp";
	}
	@Autowired
	InterviewAndResmeService interviewAndResmeService;
	//面试筛选2
	@RequestMapping("byIdQuerySift.do")
	public String byIdQuerySift(String resumeId,Model model){
		Map<String, Object> map = interviewAndResmeService.findInterviewAndResme(resumeId);
		EngageInterview inte = (EngageInterview) map.get("interview");
		EngageResume res = (EngageResume) map.get("resume");
		model.addAttribute("vi", inte);
		model.addAttribute("re", res);
		return "forward:/page/recruit/interview/interview-sift.jsp";
	}
	
	//面试筛选2 	操作
	@RequestMapping("updateSift.do")
	public String updateSift(String result,@ModelAttribute EngageResume engageResume,@ModelAttribute EngageInterview engageInterview,Model model){
		interviewService.changeInterviewShaixuan(result, engageResume, engageInterview);
		return "redirect:/interview/siftInterview.do";
	}
}
