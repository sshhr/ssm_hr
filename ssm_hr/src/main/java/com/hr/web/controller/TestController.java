package com.hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.hr.pojo.ConfigMajor;
import com.hr.service.ConfigMajorService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	ConfigMajorService impl;
	
	@RequestMapping(value="add.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String add(){
		System.out.println("add");
		List<ConfigMajor> list = impl.findConfigMajorAll();
		for (ConfigMajor Bonus : list) {
			System.out.println(Bonus.getMajorName());
		}
		
		JSONArray ja = JSONArray.fromObject(list);
		
		System.out.println(ja.toString());
		return ja.toString();
	}	
}
