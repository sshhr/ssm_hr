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
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.pojo.ConfigMajor;
import com.hr.pojo.ConfigPrimaryKey;
import com.hr.pojo.ConfigQuestionFirstKind;
import com.hr.pojo.ConfigQuestionSecondKind;
import com.hr.pojo.EngageResume;
import com.hr.pojo.EngageSubjects;
import com.hr.service.ConfigPrimaryKeyService;
import com.hr.service.ConfigQuestionFirstKindService;
import com.hr.service.ConfigQuestionSecondKindService;
import com.hr.service.EngageSubjectsService;
import com.hr.util.PrimaryKeyToDBfieldUtil;
import com.hr.util.ProjectToMapUtil;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	ConfigQuestionFirstKindService configQuestionFirstKindService;
	@Autowired
	ConfigQuestionSecondKindService configQuestionSecondKindService;
	@Autowired
	EngageSubjectsService engageSubjectsService;
	@Autowired
	ConfigPrimaryKeyService configPrimaryKeyService;
	
	
	@RequestMapping("/toSubjectRegister.do")
	public String toSubjectRegister(Model model){
		List<ConfigQuestionFirstKind> list = configQuestionFirstKindService.findConfigQuestionFirstKindAll();
		model.addAttribute("cqlist", list);
		return "forward:/page/recruit/subject/subject_register.jsp";
	}
	
	// 职位的联动
	@RequestMapping(value="findscondkind.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String findscondkind(String mid){
		if(mid!=null&&!"".equals(mid)){
			List<ConfigQuestionSecondKind> list = configQuestionSecondKindService.findConfigQuestionSecondKindByFirstKindId(mid);
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return "";
		}
	}
	
	@RequestMapping("/subjectRegisterSubmit.do")
	public String subjectRegisterSubmit(@ModelAttribute EngageSubjects subject,Model model){
		if(subject.getContent()!=null){
			subject.setContent(subject.getContent().trim());
		}
		if(subject.getKeyA()!=null){
			subject.setKeyA(subject.getKeyA().trim());
		}
		if(subject.getKeyB()!=null){
			subject.setKeyB(subject.getKeyB().trim());
		}
		if(subject.getKeyC()!=null){
			subject.setKeyC(subject.getKeyC().trim());
		}
		if(subject.getKeyD()!=null){
			subject.setKeyD(subject.getKeyD().trim());
		}
		if(subject.getKeyE()!=null){
			subject.setKeyE(subject.getKeyE().trim());
		}
		engageSubjectsService.saveEngageSubjects(subject);
		return "redirect:/subject/subjectSelect.do";
	}
	//去查询页面
	@RequestMapping("/subjectSelect.do")
	public String subjectSelect(Model model){
		List<ConfigQuestionFirstKind> list = configQuestionFirstKindService.findConfigQuestionFirstKindAll();
		model.addAttribute("qlist", list);
		return "forward:/page/recruit/subject/subject_search.jsp";
	}
	//查询
	@RequestMapping("/subjectSelectstart.do")
	public String subjectSelectstart(String firstKindName,String secondKindName,String primarkey,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(firstKindName!=null&&!"".equals(firstKindName)){
			map.put("firstKindName", firstKindName);
		}
		if(secondKindName!=null&&!"".equals(secondKindName)){
			map.put("secondKindName", secondKindName);
		}
		if(primarkey!=null&&!"".equals(primarkey)){
			map.put("primarkey", primarkey);
			List<String> list = new ArrayList<>();
			List<ConfigPrimaryKey> ConfigPrimaryKeys = configPrimaryKeyService.findConfigPrimaryKeyByPrimaryKeyTable("EngageSubjects");
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
		List<EngageSubjects> engageSubjectslist = engageSubjectsService.findchooseQuery(map);
		model.addAttribute("slist", engageSubjectslist);
		return "forward:/page/recruit/subject/subject_list.jsp";
	}
	
	//去查询页面
	@RequestMapping("/subjectbg.do")
	public String subjectbg(Model model){
		List<ConfigQuestionFirstKind> list = configQuestionFirstKindService.findConfigQuestionFirstKindAll();
		model.addAttribute("qlist", list);
		return "forward:/page/recruit/subject/subject_bg.jsp";
	}
	//查询
	@RequestMapping("/subjectlstart.do")
	public String subjectlstart(String firstKindName,String secondKindName,String primarkey,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(firstKindName!=null&&!"".equals(firstKindName)){
			map.put("firstKindName", firstKindName);
		}
		if(secondKindName!=null&&!"".equals(secondKindName)){
			map.put("secondKindName", secondKindName);
		}
		if(primarkey!=null&&!"".equals(primarkey)){
			map.put("primarkey", primarkey);
			List<String> list = new ArrayList<>();
			List<ConfigPrimaryKey> ConfigPrimaryKeys = configPrimaryKeyService.findConfigPrimaryKeyByPrimaryKeyTable("EngageSubjects");
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
		List<EngageSubjects> engageSubjectslist = engageSubjectsService.findchooseQuery(map);
		model.addAttribute("slist", engageSubjectslist);
		return "forward:/page/recruit/subject/subject_l.jsp";
	}
	
	//去跟新页面
	@RequestMapping("/subjectUpdate.do")
	public String subjectUpdate(String subId,Model model){
		List<String> list = new ArrayList<>();
		list.add(subId);
		List<EngageSubjects> ll = engageSubjectsService.findEngageSubjectsByIds(list);
		model.addAttribute("s", ll.get(0));
		return "forward:/page/recruit/subject/subject_bgs.jsp";
	}
	
	//更新
	@RequestMapping("/subjectupdateSubmit.do")
	public String subjectupdateSubmit(@ModelAttribute EngageSubjects subject,Model model){
		System.out.println(subject);
		Map<String,Object> map = new HashMap<>();
		map = ProjectToMapUtil.toMap(subject);
		engageSubjectsService.changeEngageSubjects(map);
		return "redirect:/subject/subjectbg.do";
	}
}
