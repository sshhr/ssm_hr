package com.hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.pojo.ConfigMajor;
import com.hr.service.ConfigMajorService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	ConfigMajorService impl;
	
	@RequestMapping("add.do")
	public String add(){
		System.out.println("add");
List<ConfigMajor> list = impl.findConfigMajorAll();
		
		for (ConfigMajor Bonus : list) {
			System.out.println(Bonus.getMajorName());
		}
		return "forward:/jsp/main.jsp";
	}	
}
