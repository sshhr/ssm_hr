package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageExamDetailsMapper;
import com.hr.pojo.EngageExamDetails;
import com.hr.service.EngageExamDetailsService;

@Service
public class EngageExamDetailsServiceImpl implements EngageExamDetailsService {
	@Autowired
	EngageExamDetailsMapper EngageExamDetailsMapper;

	@Override
	public List<EngageExamDetails> findEngageExamDetailsAll() {
		// TODO Auto-generated method stub
		return EngageExamDetailsMapper.findEngageExamDetailsAll();
	}

	@Override
	public List<EngageExamDetails> findEngageExamDetailsByIds(List list) {
		// TODO Auto-generated method stub
		return EngageExamDetailsMapper.findEngageExamDetailsByIds(list);
	}

	@Override
	public void saveEngageExamDetails(EngageExamDetails s) {
		EngageExamDetailsMapper.insertEngageExamDetails(s);
	}

	@Override
	public void changeEngageExamDetails(Map map) {
		EngageExamDetailsMapper.updateEngageExamDetails(map);
	}

	@Override
	public void removeEngageExamDetailsById(String id) {
		EngageExamDetailsMapper.deleteEngageExamDetailsById(id);
	}

	@Override
	public List<EngageExamDetails> findEngageExamDetailsByExamNumber(String examNumber) {
		// TODO Auto-generated method stub
		return EngageExamDetailsMapper.findEngageExamDetailsByExamNumber(examNumber);
	}
	
	

}
