package com.hr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageExamMapper;
import com.hr.mapper.EngageExamDetailsMapper;
import com.hr.pojo.EngageExam;
import com.hr.pojo.EngageExamDetails;
import com.hr.service.SetExamService;

@Service
public class SetExamServiceImpl implements SetExamService {
	@Autowired
	EngageExamMapper engageExamMapper;
	@Autowired
	EngageExamDetailsMapper engageExamDetailsMapper;
	
	@Override
	public boolean saveExam(EngageExam ee, EngageExamDetails[] dList) {
		engageExamMapper.insertEngageExam(ee);
		for (EngageExamDetails engageExamDetails : dList) {
			if(engageExamDetails.getQuestionAmount()!=null&&engageExamDetails.getQuestionAmount()!=0){
				engageExamDetailsMapper.insertEngageExamDetails(engageExamDetails);
			}
		}
		return true;
	}

}
