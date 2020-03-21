package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigQuestionSecondKindMapper;
import com.hr.pojo.ConfigQuestionSecondKind;
import com.hr.service.ConfigQuestionSecondKindService;

@Service
public class ConfigQuestionSecondKindServiceImpl implements ConfigQuestionSecondKindService {
	@Autowired
	ConfigQuestionSecondKindMapper ConfigQuestionSecondKindMapper;

	@Override
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindAll() {
		// TODO Auto-generated method stub
		return ConfigQuestionSecondKindMapper.findConfigQuestionSecondKindAll();
	}

	@Override
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindByIds(List list) {
		// TODO Auto-generated method stub
		return ConfigQuestionSecondKindMapper.findConfigQuestionSecondKindByIds(list);
	}

	@Override
	public void saveConfigQuestionSecondKind(ConfigQuestionSecondKind s) {
		ConfigQuestionSecondKindMapper.insertConfigQuestionSecondKind(s);
	}

	@Override
	public void changeConfigQuestionSecondKind(Map map) {
		ConfigQuestionSecondKindMapper.updateConfigQuestionSecondKind(map);
	}

	@Override
	public void removeConfigQuestionSecondKindById(String id) {
		ConfigQuestionSecondKindMapper.deleteConfigQuestionSecondKindById(id);
	}

	@Override
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindByFirstKindId(String firstKindId) {
		return ConfigQuestionSecondKindMapper.findConfigQuestionSecondKindByFirstKindId(firstKindId);
	}
	
	

}
