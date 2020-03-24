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

import com.hr.pojo.ConfigMajor;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.ConfigQuestionFirstKind;
import com.hr.pojo.ConfigQuestionSecondKind;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.ConfigQuestionFirstKindService;
import com.hr.service.ConfigQuestionSecondKindService;

@Controller
@RequestMapping("/client")
public class ConfigQuestionFirstKindController {
	//1级题库分类的service
	@Autowired
	ConfigQuestionFirstKindService configQuestionFirstKindService;
	//2级题库分类的service
	@Autowired
	ConfigQuestionSecondKindService configQuestionSecondKindService;
	//职位分类设置的service
	@Autowired
	ConfigMajorKindService configMajorKindService;
	//职位设置的service
	@Autowired
	ConfigMajorService configMajorService;
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
		
		//职位分类设置加载
		@RequestMapping("toMajorKind.do")
		public String toMajorKind(Model model) {
			List<ConfigMajorKind> list = configMajorKindService.findConfigMajorKindAll();
			model.addAttribute("mlist", list);
			return "forward:/page/client/major_kind.jsp";
		}
		//职位分类设置删除
		@RequestMapping(value = "deleteMajorKind.do",produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String deleteMajorKind(String mfkId) {
			if(mfkId!=null&&!"".equals(mfkId)) {
				int i = configMajorKindService.removeConfigMajorKindById(mfkId);
				if(i==1) {
					return "ok";
				}
			}
			return "false";
		}
		//职位分类设置添加或修改
		@RequestMapping("majorKindAdd.do")
		@ResponseBody
		public String majorKindAdd(String majorKindId,String majorKindName) {
			List<ConfigMajorKind> list = configMajorKindService.findConfigMajorKindAll();
			ConfigMajorKind s = new ConfigMajorKind();
			s.setMajorKindId(majorKindId);
			s.setMajorKindName(majorKindName);
			System.out.println(s.getMajorKindId()+","+s.getMajorKindName());
			Iterator<ConfigMajorKind>it = list.iterator();
			while (it.hasNext()) {
				ConfigMajorKind cqkf = it.next();
				System.out.println("测试："+cqkf.getMajorKindId());
				if (cqkf.getMajorKindId().equals(s.getMajorKindId())) {
					s.setMfkId(cqkf.getMfkId());
					configMajorKindService.changeConfigMajorKind(s);
					return "xiugai";
				}
				
			}
			configMajorKindService.saveConfigMajorKind(s);
			
			return "tianjia";
		}
		//职位设置加载
				@RequestMapping("toMajor.do")
				public String toMajor(Model model) {
					List<ConfigMajor> list = configMajorService.findConfigMajorAll();
					model.addAttribute("jlist", list);
					return "forward:/page/client/major.jsp";
				}
				
				//职位设置删除
				@RequestMapping(value = "deleteMajor.do",produces = "text/html;charset=UTF-8")
				@ResponseBody
				public String deleteMajor(String makId) {
					if(makId!=null&&!"".equals(makId)) {
						int i = configMajorService.removeConfigMajorById(makId);
						if(i==1) {
							return "ok";
						}
					}
					return "false";
				}
				//职位设置添加或修改
				@RequestMapping("majorAdd.do")
				@ResponseBody
				public String majorAdd(String majorKindId,String majorKindName,String majorId,String majorName) {
					List<ConfigMajor> list = configMajorService.findConfigMajorAll();
					ConfigMajor s = new ConfigMajor();
					s.setMajorKindId(majorKindId);
					s.setMajorKindName(majorKindName);
					s.setMajorId(majorId);
					s.setMajorName(majorName);
					System.out.println(s.getMajorKindId()+","+s.getMajorKindName());
					Iterator<ConfigMajor>it = list.iterator();
					while (it.hasNext()) {
						ConfigMajor cqkf = it.next();
						System.out.println("测试："+cqkf.getMajorKindId()+","+cqkf.getMajorId());
						if (cqkf.getMajorKindId().equals(s.getMajorKindId())&&cqkf.getMajorId().equals(s.getMajorId())) {
							s.setMakId(cqkf.getMakId());
							configMajorService.changeConfigMajor(s);
							return "xiugai";
						}
						
					}
					configMajorService.saveConfigMajor(s);
					
					return "tianjia";
				}
				//职称设置加载
				@RequestMapping("toProfessionDesign.do")
				public String toProfessionDesign(Model model) {
					List<ConfigMajor> list = configMajorService.findConfigMajorAll();
					model.addAttribute("zlist", list);
					return "forward:/page/client/profession_design.jsp";
				}
				//职称设置删除
				@RequestMapping(value = "deleteProfessionDesign.do",produces = "text/html;charset=UTF-8")
				@ResponseBody
				public String deleteProfessionDesign(String makId) {
					if(makId!=null&&!"".equals(makId)) {
						int i = configMajorService.removeConfigMajorById(makId);
						if(i==1) {
							return "ok";
						}
					}
					return "false";
				}
}
