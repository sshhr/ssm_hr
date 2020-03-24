package com.hr.web.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.dto.EExam;
import com.hr.dto.EngageExamAndDetails;
import com.hr.dto.EngageSubjectsAndAmount;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.ConfigPrimaryKey;
import com.hr.pojo.ConfigQuestionFirstKind;
import com.hr.pojo.ConfigQuestionSecondKind;
import com.hr.pojo.EngageAnswer;
import com.hr.pojo.EngageExam;
import com.hr.pojo.EngageExamDetails;
import com.hr.pojo.EngageResume;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.ConfigQuestionFirstKindService;
import com.hr.service.ConfigQuestionSecondKindService;
import com.hr.service.EngageAnswerService;
import com.hr.service.EngageExamService;
import com.hr.service.EngageInterviewService;
import com.hr.service.EngageResumeService;
import com.hr.service.EngageSubjectsService;
import com.hr.service.SetExamService;
import com.hr.service.ToExamService;
import com.hr.util.Get16UUID;
import com.hr.util.PrimaryKeyToDBfieldUtil;
import com.hr.util.ProjectToMapUtil;
import com.hr.util.RandomOfInt;
import com.hr.util.ResumeState;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	EngageExamService engageExamService;
	@Autowired
	ConfigMajorKindService majorKindService;
	@Autowired
	ConfigMajorService majorService;
	@Autowired
	EngageSubjectsService engageSubjectsService;
	@Autowired
	ConfigQuestionFirstKindService configQuestionFirstKindService;
	@Autowired
	ConfigQuestionSecondKindService configQuestionSecondKindService;
	@Autowired
	SetExamService setExamService;
	@Autowired
	EngageAnswerService engageAnswerService;
	@Autowired
	EngageInterviewService engageInterviewService;
	@Autowired
	EngageResumeService engageResumeService;
	@RequestMapping("queryExamList.do")
	public String queryExamList(Model model){
		List<EExam> list = engageExamService.findEngageExamAllCategoryamount();
		model.addAttribute("elist", list);
		return "forward:/page/recruit/exam/problem_set_list.jsp";
	}
	
	@RequestMapping("setExamList.do")
	public String setExamList(Model model){
		List<ConfigMajorKind> list = majorKindService.findConfigMajorKindAll();
		model.addAttribute("mklist", list);
		List<ConfigQuestionFirstKind> qfklist = configQuestionFirstKindService.findConfigQuestionFirstKindAll();
		model.addAttribute("qfklist", qfklist);
		List<ConfigQuestionSecondKind> qsklist = configQuestionSecondKindService.findConfigQuestionSecondKindAll();
		List<EngageSubjectsAndAmount> esaList = engageSubjectsService.findEngageSubjectsAndAmount();
		for (ConfigQuestionSecondKind configQuestionSecondKind : qsklist) {
			if(util(esaList,configQuestionSecondKind)){
				EngageSubjectsAndAmount es = new EngageSubjectsAndAmount();
				es.setAmount(0);
				es.setFirstKindId(configQuestionSecondKind.getFirstKindId());
				es.setFirstKindName(configQuestionSecondKind.getFirstKindName());
				es.setSecondKindId(configQuestionSecondKind.getSecondKindId());
				es.setSecondKindName(configQuestionSecondKind.getSecondKindName());
				esaList.add(es);
			}
		}
		model.addAttribute("esaalist", esaList);
		return "forward:/page/recruit/exam/set_problem.jsp";
	}
	public boolean util(List<EngageSubjectsAndAmount> esaList,ConfigQuestionSecondKind qsk){
		boolean flag = true;
		for (EngageSubjectsAndAmount engageSubjectsAndAmount : esaList) {
			if(engageSubjectsAndAmount.getFirstKindId().equals(qsk.getFirstKindId())&&engageSubjectsAndAmount.getSecondKindId().equals(qsk.getSecondKindId())){
				flag = false;
			}
		}
		return flag;
	}
	
	//保存套题
	@RequestMapping("saveExam.do")
	@ResponseBody
	public String saveExam(@RequestBody EngageExamAndDetails engageExamAndDetails){
		String uuid = Get16UUID.getUUID().trim();
		EngageExam ee = new EngageExam();
		ee.setExamNumber(uuid);
		ee.setLimiteTime(engageExamAndDetails.getLimiteTime());
		ee.setMajorId(engageExamAndDetails.getMajorId());
		ee.setMajorKindId(engageExamAndDetails.getMajorKindId());
		ee.setMajorKindName(engageExamAndDetails.getMajorKindName());
		ee.setMajorName(engageExamAndDetails.getMajorName());
		ee.setRegister(engageExamAndDetails.getRegister());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			ee.setRegistTime(new Timestamp(sdf.parse(engageExamAndDetails.getRegistTime()).getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (EngageExamDetails eed : engageExamAndDetails.getdList()) {
			eed.setExamNumber(uuid);
		}
		setExamService.saveExam(ee, engageExamAndDetails.getdList());
		JSONObject json = new JSONObject();
		json.put("flag", true);
		return json.toString();
	}
	
	@RequestMapping("toExam.do")
	public String setExam(Model model){
		List<ConfigMajorKind> list = majorKindService.findConfigMajorKindAll();
		model.addAttribute("mklist", list);
		return "forward:/page/recruit/exam/answer_exam.jsp";
	}
	
	@Autowired
	ToExamService toExamService;
	@RequestMapping("toexam.do")
	public String toexam(String humanName,String humanIdcard,String humanMajorKindName,String humanMajorName,Model model,HttpServletRequest requset){
		System.out.println(humanName+"="+humanIdcard+"="+humanMajorKindName+"="+humanMajorName);
		Map map = toExamService.changetoExam(humanName, humanIdcard, humanMajorKindName, humanMajorName);
		System.out.println(map.get("return").toString());
		switch (map.get("return").toString()) {
			case "1":
			case "2":
				model.addAttribute("ee", map.get("ee"));
				model.addAttribute("humanName", map.get("humanName"));
				model.addAttribute("humanIdcard", map.get("humanIdcard"));
				model.addAttribute("shu", map.get("shu"));
				model.addAttribute("subjects", map.get("subjects"));
				model.addAttribute("answerNumber", map.get("answerNumber"));
				requset.getSession().setAttribute("subjectslist", map.get("subjects"));
				return "forward:/page/recruit/exam/my_exam.jsp";
			default:
				return "forward:/page/recruit/exam/myExam_err.jsp";
		}
	}
	
	//阅卷
	@RequestMapping("examResult.do")
	public String examResult(String humanName,String humanIdcard,String examNumber,String answerNumber,String testTime,Model model,HttpServletRequest requset){
//		System.out.println(humanName+"="+humanIdcard+"="+examNumber+"="+testTime);
		toExamService.changeexamResult(humanName,humanIdcard,examNumber,answerNumber,testTime,model,requset);
		return "forward:/page/recruit/exam/myExam_true.jsp";
	}
	
	//查询
	@RequestMapping("examSearch.do")
	public String examSearch(String humanIdcard,String primarkey,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(humanIdcard!=null&&!"".equals(humanIdcard)){
			map.put("humanIdcard", humanIdcard);
		}
		map.put("checkstatus", ResumeState.RECOMMEND_TESTED);
		if(primarkey!=null&&!"".equals(primarkey)){
			map.put("primarkey", primarkey);
		}
		if(startdate!=null&&!"".equals(startdate)){
			map.put("startdate", startdate);
		}
		if(enddate!=null&&!"".equals(enddate)){
			map.put("enddate", enddate);
		}
		List<EngageResume> engageResumelist = engageResumeService.findchooseQueryexamfenshu(map);
		model.addAttribute("resultList", engageResumelist);
		return "forward:/page/recruit/exam/exam-list.jsp";
	}
	
	@RequestMapping("examxq.do")
	public String examxq(String resId,Model model){
		Map<String, Object> map = toExamService.findExam(resId);
		model.addAttribute("er", map.get("er"));
		model.addAttribute("ea", map.get("ea"));
		model.addAttribute("ee", map.get("ee"));
		model.addAttribute("shu", map.get("shu"));
		model.addAttribute("eadaes", map.get("eadaes"));
		return "forward:/page/recruit/exam/exam_answer_details.jsp";
	}
	
	
	@RequestMapping("examSift.do")
	public String examSift(String resId,Model model){
		System.out.println(resId);
		List<String> list = new ArrayList<>();
		list.add(resId);
		List<EngageResume> ll = engageResumeService.findEngageResumeByIds(list);
		model.addAttribute("resume", ll.get(0));
		return "forward:/page/recruit/exam/exam-sift.jsp";
	}
	
	
	@RequestMapping("examResultSiftSubmit.do")
	public String examResultSiftSubmit(String result,@ModelAttribute EngageResume resume,Model model){
		System.out.println(result);
		System.out.println(resume);
		switch (result) {
			case "建议笔试":
				resume.setCheckStatus(ResumeState.RECOMMEND_TEST);
				break;
			case "建议录用":
				resume.setCheckStatus(ResumeState.RECOMMEND_APPLY);
				break;
			case "删除简历":
				resume.setCheckStatus(ResumeState.RECOMMEND_REMOVE);
				break;
		}
		engageResumeService.changeEngageResume(ProjectToMapUtil.toMap(resume));
		model.addAttribute("result", result);
		return "forward:/page/recruit/exam/examsiftRE.jsp";
	}
}
