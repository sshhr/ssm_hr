package com.hr.service;

import com.hr.pojo.EngageExam;
import com.hr.pojo.EngageExamDetails;

public interface SetExamService {
	public boolean saveExam(EngageExam ee,EngageExamDetails[] dList);
}
