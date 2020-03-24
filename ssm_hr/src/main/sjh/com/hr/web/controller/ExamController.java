package com.hr.web.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.dto.EExam;
import com.hr.dto.EngageExamAndDetails;
import com.hr.dto.EngageSubjectsAndAmount;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.ConfigQuestionFirstKind;
import com.hr.pojo.ConfigQuestionSecondKind;
import com.hr.pojo.EngageAnswer;
import com.hr.pojo.EngageExam;
import com.hr.pojo.EngageExamDetails;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.ConfigQuestionFirstKindService;
import com.hr.service.ConfigQuestionSecondKindService;
import com.hr.service.EngageAnswerService;
import com.hr.service.EngageExamService;
import com.hr.service.EngageSubjectsService;
import com.hr.service.SetExamService;
import com.hr.util.Get16UUID;

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
	
	
	@RequestMapping("toexam.do")
	public String toexam(String humanName,String humanIdcard,String humanMajorKindName,String humanMajorName,Model model){
		System.out.println(humanName+"="+humanIdcard+"="+humanMajorKindName+"="+humanMajorName);
		Map map = new HashMap<>();
		map.put("humanName", humanName);
		map.put("humanIdcard", humanIdcard);
		map.put("humanMajorKindName", humanMajorKindName);
		map.put("humanMajorName", humanMajorName);
		EngageAnswer ea = engageAnswerService.findEngageAnswerByEngageInterviewAndEngageResume(map);
		ea.setAnswerNumber(Get16UUID.getUUID());
		System.out.println(ea);
		return "forward:/page/recruit/exam/answer_exam.jsp";
	}
	
}
