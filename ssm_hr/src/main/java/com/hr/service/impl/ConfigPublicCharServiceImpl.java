package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigPublicCharMapper;
import com.hr.pojo.ConfigPublicChar;
import com.hr.service.ConfigPublicCharService;

@Service
public class ConfigPublicCharServiceImpl implements ConfigPublicCharService {
	@Autowired
	ConfigPublicCharMapper ConfigPublicCharMapper;

	@Override
	public List<ConfigPublicChar> findConfigPublicCharAll() {
		// TODO Auto-generated method stub
		return ConfigPublicCharMapper.findConfigPublicCharAll();
	}

	@Override
	public List<ConfigPublicChar> findConfigPublicCharByIds(List list) {
		// TODO Auto-generated method stub
		return ConfigPublicCharMapper.findConfigPublicCharByIds(list);
	}

	@Override
	public void saveConfigPublicChar(ConfigPublicChar s) {
		ConfigPublicCharMapper.insertConfigPublicChar(s);
	}

	@Override
	public void changeConfigPublicChar(Map map) {
		ConfigPublicCharMapper.updateConfigPublicChar(map);
	}

	@Override
	public void removeConfigPublicCharById(String id) {
		ConfigPublicCharMapper.deleteConfigPublicCharById(id);
	}
	
	

}
