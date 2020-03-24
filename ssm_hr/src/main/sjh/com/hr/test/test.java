package com.hr.test;

import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hr.dto.ResumeAndInterview;
import com.hr.service.ResumeAndInterviewService;

public class test {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
//		ResumeAndInterviewService r = (ResumeAndInterviewService) context.getBean("resumeAndInterviewServiceImpl");
//		List<ResumeAndInterview> rr = r.findResumeAndInterviewByCheckStatus("3");
//		for (ResumeAndInterview resumeAndInterview : rr) {
//			System.out.println(resumeAndInterview);
//		}
		
		System.out.println(rand(2)+1);
	}
	public static int rand(int i){
		Random r = new Random();
		return r.nextInt(i);
	}
}
