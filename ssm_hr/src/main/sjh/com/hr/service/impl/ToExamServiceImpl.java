package com.hr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageAnswerMapper;
import com.hr.mapper.EngageExamMapper;
import com.hr.pojo.EngageAnswer;
import com.hr.pojo.EngageExam;
import com.hr.service.ToExamService;
import com.hr.util.Get16UUID;
import com.hr.util.RandomOfInt;

@Service
public class ToExamServiceImpl implements ToExamService {
	@Autowired
	EngageAnswerMapper engageAnswerMapper;
	@Autowired
	EngageExamMapper engageExamMapper;
	@Override
	public Map<String, Object> toExam(String humanName, String humanIdcard, String humanMajorKindName,
			String humanMajorName) {
		Map map = new HashMap<String,String>();
		map.put("humanName", humanName);
		map.put("humanIdcard", humanIdcard);
		map.put("humanMajorKindName", humanMajorKindName);
		map.put("humanMajorName", humanMajorName);
		EngageAnswer ea = engageAnswerMapper.findEngageAnswerByEngageInterviewAndEngageResume(map);
		String answerNumber = Get16UUID.getUUID().trim();
		ea.setAnswerNumber(answerNumber);
		List<EngageExam> eelist = engageExamMapper.findEngageExamBymajorkindnameAndmajorname(map);
		ea.setExamNumber(eelist.get(RandomOfInt.rand(eelist.size())).getExamNumber());
		System.out.println(ea);
		return null;
	}

}
