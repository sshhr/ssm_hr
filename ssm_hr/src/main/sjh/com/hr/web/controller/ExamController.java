package com.hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.dto.EExam;
import com.hr.pojo.EngageExam;
import com.hr.service.EngageExamService;

@Controller
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	EngageExamService engageExamService;
	
	@RequestMapping("queryExamList.do")
	public String queryExamList(Model model){
		List<EExam> list = engageExamService.findEngageExamAllCategoryamount();
		model.addAttribute("elist", list);
		return "forward:/page/recruit/exam/problem_set_list.jsp";
	}
	
}
