package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageAnswerMapper;
import com.hr.pojo.EngageAnswer;
import com.hr.service.EngageAnswerService;

@Service
public class EngageAnswerServiceImpl implements EngageAnswerService {
	@Autowired
	EngageAnswerMapper EngageAnswerMapper;

	@Override
	public List<EngageAnswer> findEngageAnswerAll() {
		// TODO Auto-generated method stub
		return EngageAnswerMapper.findEngageAnswerAll();
	}

	@Override
	public List<EngageAnswer> findEngageAnswerByIds(List list) {
		// TODO Auto-generated method stub
		return EngageAnswerMapper.findEngageAnswerByIds(list);
	}

	@Override
	public void saveEngageAnswer(EngageAnswer s) {
		EngageAnswerMapper.insertEngageAnswer(s);
	}

	@Override
	public void changeEngageAnswer(Map map) {
		EngageAnswerMapper.updateEngageAnswer(map);
	}

	@Override
	public void removeEngageAnswerById(String id) {
		EngageAnswerMapper.deleteEngageAnswerById(id);
	}
	
	

}
