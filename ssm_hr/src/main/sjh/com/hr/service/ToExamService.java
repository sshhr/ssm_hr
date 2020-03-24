package com.hr.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface ToExamService {
	public Map<String,Object> changetoExam(String humanName,String humanIdcard,String humanMajorKindName,String humanMajorName);
	public boolean changeexamResult(String humanName,String humanIdcard,String examNumber,String answerNumber,String testTime,Model model,HttpServletRequest requset);
	public Map<String, Object> findExam(String resId);
}
