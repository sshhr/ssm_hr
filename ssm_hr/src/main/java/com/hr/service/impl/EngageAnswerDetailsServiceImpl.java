package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageAnswerDetailsMapper;
import com.hr.pojo.EngageAnswerDetails;
import com.hr.service.EngageAnswerDetailsService;

@Service
public class EngageAnswerDetailsServiceImpl implements EngageAnswerDetailsService {
	@Autowired
	EngageAnswerDetailsMapper EngageAnswerDetailsMapper;

	@Override
	public List<EngageAnswerDetails> findEngageAnswerDetailsAll() {
		// TODO Auto-generated method stub
		return EngageAnswerDetailsMapper.findEngageAnswerDetailsAll();
	}

	@Override
	public List<EngageAnswerDetails> findEngageAnswerDetailsByIds(List list) {
		// TODO Auto-generated method stub
		return EngageAnswerDetailsMapper.findEngageAnswerDetailsByIds(list);
	}

	@Override
	public void saveEngageAnswerDetails(EngageAnswerDetails s) {
		EngageAnswerDetailsMapper.insertEngageAnswerDetails(s);
	}

	@Override
	public void changeEngageAnswerDetails(Map map) {
		EngageAnswerDetailsMapper.updateEngageAnswerDetails(map);
	}

	@Override
	public void removeEngageAnswerDetailsById(String id) {
		EngageAnswerDetailsMapper.deleteEngageAnswerDetailsById(id);
	}
	
	

}
