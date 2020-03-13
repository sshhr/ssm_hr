package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigQuestionFirstKindMapper;
import com.hr.pojo.ConfigQuestionFirstKind;
import com.hr.service.ConfigQuestionFirstKindService;

@Service
public class ConfigQuestionFirstKindServiceImpl implements ConfigQuestionFirstKindService {
	@Autowired
	ConfigQuestionFirstKindMapper ConfigQuestionFirstKindMapper;

	@Override
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindAll() {
		// TODO Auto-generated method stub
		return ConfigQuestionFirstKindMapper.findConfigQuestionFirstKindAll();
	}

	@Override
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindByIds(List list) {
		// TODO Auto-generated method stub
		return ConfigQuestionFirstKindMapper.findConfigQuestionFirstKindByIds(list);
	}

	@Override
	public void saveConfigQuestionFirstKind(ConfigQuestionFirstKind s) {
		ConfigQuestionFirstKindMapper.insertConfigQuestionFirstKind(s);
	}

	@Override
	public void changeConfigQuestionFirstKind(Map map) {
		ConfigQuestionFirstKindMapper.updateConfigQuestionFirstKind(map);
	}

	@Override
	public void removeConfigQuestionFirstKindById(String id) {
		ConfigQuestionFirstKindMapper.deleteConfigQuestionFirstKindById(id);
	}
	
	

}
