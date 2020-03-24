package com.hr.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.dto.ResumeAndInterview;
import com.hr.dto.ResumeAndInterviewDetails;
import com.hr.mapper.CheckStatus;
import com.hr.mapper.HumanFileStatus;
import com.hr.pojo.EngageResume;
import com.hr.pojo.HumanFile;
import com.hr.service.EngageResumeService;
import com.hr.service.ResumeAndInterviewService;
import com.hr.service.ResumeService;
import com.hr.util.ResumeState;

@Controller
@RequestMapping("/employ")
public class EmployController {
	@Autowired
	ResumeAndInterviewService resumeAndInterviewService;
	@Autowired
	EngageResumeService engageResumeService;
	@Autowired
	ResumeService resumeService;
	//建议录用列表
	@RequestMapping("registerList.do")
	public String employRegisterList(Model model){
		List<ResumeAndInterview> resumeAndInterviews = resumeAndInterviewService.findResumeAndInterviewByCheckStatus(ResumeState.RECOMMEND_HIRING+"");
		model.addAttribute("vlist", resumeAndInterviews);
		return "forward:/page/recruit/employ/register_list.jsp";
	}
	//申请审核
	@RequestMapping("toEmployRegister.do")
	public String toEmployRegister(String einId,Model model){
		ResumeAndInterviewDetails resumeAndInterviewDetails = resumeAndInterviewService.findResumeAndInterviewByEinId(einId);
		model.addAttribute("vi", resumeAndInterviewDetails);
		return "forward:/page/recruit/employ/register.jsp";
	}
	
	@RequestMapping("registerOk.do")
	public String registerOk(String result,String resId,String passchecker,String passchecktime,String passCheckcomment,Model model){
		System.out.println(result+"="+resId+"="+passchecker+"="+passchecktime+"="+passCheckcomment);
		Map<String,String> map = new HashMap<String, String>();
		map.put("resId", resId);
		map.put("passChecker", passchecker);
		map.put("passCheckTime", passchecktime);
		map.put("passCheckcomment", passCheckcomment);
		switch (result) {
			case "释放简历":
				map.put("checkStatus", ResumeState.RECOMMEND_RELEASE+"");
				break;
			case "申请录用":
				map.put("checkStatus", ResumeState.RECOMMEND_APPLY+"");
				break;
		}
		engageResumeService.changeEngageResume(map);
		return "redirect:/employ/registerList.do";
	}
	
	
	//录用审批List
	@RequestMapping("toCheckList.do")
	public String toCheckList(Model model){
		List<EngageResume> engageResumelist = engageResumeService.findEngageResumeByCheckStatus(ResumeState.RECOMMEND_APPLY+"");
		model.addAttribute("vlist", engageResumelist);
		return "forward:/page/recruit/employ/check_list.jsp";
	}
	
	//审批
	@RequestMapping("toEmployCheck.do")
	public String toEmployCheck(String resId,Model model){
		ResumeAndInterviewDetails resumeAndInterviewDetails = resumeAndInterviewService.findResumeAndInterviewByresId(resId);
		model.addAttribute("vi", resumeAndInterviewDetails);
		return "forward:/page/recruit/employ/check.jsp";
	}
	
	//录用审核 还要连接人力资源
	@RequestMapping("returnCheckList.do")
	public String returnCheckList(String result,String resId,String passPasscomment,@ModelAttribute EngageResume resume,@ModelAttribute HumanFile humanFile,Model model){
		System.out.println(result+"="+resId+"="+passPasscomment);
		Map<String,String> map = new HashMap<String, String>();
		map.put("resId", resId);
		map.put("passPasscomment", passPasscomment);
		switch (result) {
			case "通过":
				map.put("checkStatus", ResumeState.RECOMMEND_PASS+"");
				long lon = System.currentTimeMillis();
				String humanId = String.valueOf(lon);
				humanFile.setHumanId(humanId);
				humanFile.setCheckStatus(CheckStatus.NO);
				humanFile.setHumanFileStatus(HumanFileStatus.INIT);
				System.out.println(resume);
				humanFile.setHunmaMajorName(resume.getHumanMajorName());
				resumeService.updateResumeAndSaveHumanFile(map, humanFile);
				break;
			case "不通过":
				map.put("checkStatus", ResumeState.RECOMMEND_NOPASS+"");
				engageResumeService.changeEngageResume(map);
				break;
		}
		return "redirect:/employ/toCheckList.do";
	}
	
	//录用查询List
	@RequestMapping("toFindList.do")
	public String toFindList(Model model){
		List<EngageResume> engageResumelist1 = engageResumeService.findEngageResumeByCheckStatus(ResumeState.RECOMMEND_PASS+"");
		model.addAttribute("vlist", engageResumelist1);
		return "forward:/page/recruit/employ/list.jsp";
	}
	//查询详情
	@RequestMapping("toCheck.do")
	public String toCheck(String resId,Model model){
		ResumeAndInterviewDetails resumeAndInterviewDetails = resumeAndInterviewService.findResumeAndInterviewByresId(resId);
		model.addAttribute("vi", resumeAndInterviewDetails);
		return "forward:/page/recruit/employ/details.jsp";
	}
}
