package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigMajorMapper;
import com.hr.pojo.ConfigMajor;
import com.hr.service.ConfigMajorService;

@Service
public class ConfigMajorServiceImpl implements ConfigMajorService {
	@Autowired
	ConfigMajorMapper ConfigMajorMapper;

	@Override
	public List<ConfigMajor> findConfigMajorAll() {
		// TODO Auto-generated method stub
		return ConfigMajorMapper.findConfigMajorAll();
	}

	@Override
	public List<ConfigMajor> findConfigMajorByIds(List list) {
		// TODO Auto-generated method stub
		return ConfigMajorMapper.findConfigMajorByIds(list);
	}

	@Override
	public void saveConfigMajor(ConfigMajor s) {
		ConfigMajorMapper.insertConfigMajor(s);
	}

	@Override
	public void changeConfigMajor(Map map) {
		ConfigMajorMapper.updateConfigMajor(map);
	}

	@Override
	public void removeConfigMajorById(String id) {
		ConfigMajorMapper.deleteConfigMajorById(id);
	}
	
	

}