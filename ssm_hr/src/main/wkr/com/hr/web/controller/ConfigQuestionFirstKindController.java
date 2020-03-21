package com.hr.web.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.pojo.ConfigQuestionFirstKind;
import com.hr.pojo.ConfigQuestionSecondKind;
import com.hr.service.ConfigQuestionFirstKindService;
import com.hr.service.ConfigQuestionSecondKindService;

@Controller
@RequestMapping("/client")
public class ConfigQuestionFirstKindController {
	@Autowired
	ConfigQuestionFirstKindService configQuestionFirstKindService;
	@Autowired
	ConfigQuestionSecondKindService configQuestionSecondKindService;
	//一级题库加载
	@RequestMapping("toQuestionFirstKind.do")
	public String toQuestionFirstKind(Model model) {
		List<ConfigQuestionFirstKind> list = configQuestionFirstKindService.findConfigQuestionFirstKindAll();
		model.addAttribute("qklist", list);
		return "forward:/page/client/question_first_kind.jsp";
	}
	
	//一级题库删除
	@RequestMapping(value = "deleteQuestionFirstKind.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String deleteFirstKind(String qfkId) {
		if(qfkId!=null&&!"".equals(qfkId)) {
			int i = configQuestionFirstKindService.removeConfigQuestionFirstKindById(qfkId);
			if(i==1) {
				return "ok";
			}
		}
		return "false";
	}
	//一级题库添加或修改
	@RequestMapping("questionFirstKindAdd.do")
	@ResponseBody
	public String questionFirstKindAdd(String firstKindId,String firstKindName) {
		List<ConfigQuestionFirstKind> list = configQuestionFirstKindService.findConfigQuestionFirstKindAll();
		ConfigQuestionFirstKind s = new ConfigQuestionFirstKind();
		s.setFirstKindId(firstKindId);
		s.setFirstKindName(firstKindName);
		System.out.println(s.getFirstKindId()+","+s.getFirstKindName());
		Iterator<ConfigQuestionFirstKind>it = list.iterator();
		while (it.hasNext()) {
			ConfigQuestionFirstKind cqkf = it.next();
			System.out.println("测试："+cqkf.getFirstKindId());
			if (cqkf.getFirstKindId().equals(s.getFirstKindId())) {
				s.setQfkId(cqkf.getQfkId());
				configQuestionFirstKindService.changeConfigQuestionFirstKind(s);
				return "xiugai";
			}
			
		}
		configQuestionFirstKindService.saveConfigQuestionFirstKind(s);
		
		return "tianjia";
	}
	//二级题库加载
		@RequestMapping("toQuestionSecondKind.do")
		public String toQuestionSecondKind(Model model) {
			List<ConfigQuestionSecondKind> list = configQuestionSecondKindService.findConfigQuestionSecondKindAll();
			model.addAttribute("qklist", list);
			return "forward:/page/client/question_second_kind.jsp";
		}
		
		//二级题库删除
		@RequestMapping(value = "deleteQuestionSecondKind.do",produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String deleteSecondKind(String qskId) {
			if(qskId!=null&&!"".equals(qskId)) {
				int i = configQuestionSecondKindService.removeConfigQuestionSecondKindById(qskId);
				if(i==1) {
					return "ok";
				}
			}
			return "false";
		}
		//二级题库添加或修改
		@RequestMapping("questionSecondKindAdd.do")
		@ResponseBody
		public String questionSecondKindAdd(String firstKindId,String firstKindName,String secondKindId,String secondKindName) {
			List<ConfigQuestionSecondKind> list = configQuestionSecondKindService.findConfigQuestionSecondKindAll();
			ConfigQuestionSecondKind s = new ConfigQuestionSecondKind();
			s.setFirstKindId(firstKindId);
			s.setFirstKindName(firstKindName);
			s.setSecondKindId(secondKindId);
			s.setSecondKindName(secondKindName);
			System.out.println(s.getFirstKindId()+","+s.getFirstKindName());
			Iterator<ConfigQuestionSecondKind>it = list.iterator();
			while (it.hasNext()) {
				ConfigQuestionSecondKind cqkf = it.next();
				System.out.println("测试："+cqkf.getFirstKindId()+","+cqkf.getSecondKindId());
				if (cqkf.getFirstKindId().equals(s.getFirstKindId())&&cqkf.getSecondKindId().equals(s.getSecondKindId())) {
					s.setQskId(cqkf.getQskId());
					configQuestionSecondKindService.changeConfigQuestionSecondKind(s);
					return "xiugai";
				}
				
			}
			configQuestionSecondKindService.saveConfigQuestionSecondKind(s);
			
			return "tianjia";
		}
}
