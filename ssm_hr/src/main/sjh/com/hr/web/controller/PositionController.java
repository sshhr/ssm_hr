package com.hr.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.mapper.ConfigFileFirstKindMapper;
import com.hr.mapper.ConfigFileSecondKindMapper;
import com.hr.mapper.ConfigFileThirdKindMapper;
import com.hr.pojo.ConfigFileFirstKind;
import com.hr.pojo.ConfigFileSecondKind;
import com.hr.pojo.ConfigFileThirdKind;
import com.hr.pojo.ConfigMajor;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.EngageMajorRelease;
import com.hr.service.ConfigFileFirstKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileThirdKindService;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.EngageMajorReleaseService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/position")
public class PositionController {
	@Autowired
	ConfigFileFirstKindService firstService;
	@Autowired
	ConfigFileSecondKindService  secondService;
	@Autowired
	ConfigFileThirdKindService thirdService;
	@Autowired
	ConfigMajorKindService majorKindService;
	@Autowired
	ConfigMajorService majorService;
	@Autowired
	EngageMajorReleaseService majorReleaseService;
	
	//第一次进职位登记 获取信息
	@RequestMapping("first.do")
	public String positionRegisterFirst(Model model){
		List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
		List<ConfigMajorKind> mlist = majorKindService.findConfigMajorKindAll();
		model.addAttribute("flist",list);
		model.addAttribute("mlist",mlist);
		return "forward:/page/recruit/position/position_register.jsp";
	}
	
	@RequestMapping(value="second.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String positionRegisterSecond(String fid){
		List<ConfigFileSecondKind> list = secondService.findConfigFileSecondKindByFirstId(fid);
		JSONArray jsonarr = JSONArray.fromObject(list);
		return jsonarr.toString();
	}
	
	@RequestMapping(value="third.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String positionRegisterThird(String fid,String sid){
		Map<String, String> map = new HashMap<String, String>();
		map.put("fid", fid);
		map.put("sid", sid);
		List<ConfigFileThirdKind> list = thirdService.findConfigFileThirdKindByFirstIdAndSecondId(map);
		JSONArray jsonarr = JSONArray.fromObject(list);
		return jsonarr.toString();
	}
	
	@RequestMapping(value="ByIdQueryMajor.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String byIdQueryMajor(String mid){
		List<ConfigMajor> list = majorService.findConfigMajorByMajorKindId(mid);
		JSONArray jsonarr = JSONArray.fromObject(list);
		return jsonarr.toString();
	}
	
	
	@RequestMapping("savepositionRegister.do")
	public String savepositionRegister(@ModelAttribute EngageMajorRelease majorRelease){
		System.out.println(majorRelease);
		majorReleaseService.saveEngageMajorRelease(majorRelease);
		return "redirect:position_register.jsp";
	}
}
