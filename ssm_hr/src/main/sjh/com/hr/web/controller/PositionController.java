package com.hr.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import com.hr.service.ConfigFileFirstKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileThirdKindService;

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
	
	@RequestMapping("first.do")
	public String positionRegisterFirst(Model model){
		List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
		model.addAttribute("flist",list);
		return "forward:/page/recruit/position/position_register.jsp";
	}
	
	@RequestMapping(value="second.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String positionRegisterSecond(String fid){
		System.out.println(fid);
		List<ConfigFileSecondKind> list = secondService.findConfigFileSecondKindByFirstId(fid);
		JSONArray jsonarr = JSONArray.fromObject(list);
		return jsonarr.toString();
	}
	
	@RequestMapping(value="third.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String positionRegisterThird(String fid,String sid){
		System.out.println(fid+"===="+sid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("fid", fid);
		map.put("sid", sid);
		List<ConfigFileThirdKind> list = thirdService.findConfigFileThirdKindByFirstIdAndSecondId(map);
		JSONArray jsonarr = JSONArray.fromObject(list);
		return jsonarr.toString();
	}
	
}
