package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigMajorKindMapper;
import com.hr.pojo.ConfigMajorKind;
import com.hr.service.ConfigMajorKindService;

@Service
public class ConfigMajorKindServiceImpl implements ConfigMajorKindService {
	@Autowired
	ConfigMajorKindMapper ConfigMajorKindMapper;

	@Override
	public List<ConfigMajorKind> findConfigMajorKindAll() {
		// TODO Auto-generated method stub
		return ConfigMajorKindMapper.findConfigMajorKindAll();
	}

	@Override
	public List<ConfigMajorKind> findConfigMajorKindByIds(List list) {
		// TODO Auto-generated method stub
		return ConfigMajorKindMapper.findConfigMajorKindByIds(list);
	}

	@Override
	public void saveConfigMajorKind(ConfigMajorKind s) {
		ConfigMajorKindMapper.insertConfigMajorKind(s);
	}

	@Override
	public void changeConfigMajorKind(ConfigMajorKind s) {
		ConfigMajorKindMapper.updateConfigMajorKind(s);
	}

	@Override
	public int removeConfigMajorKindById(String id) {
		return ConfigMajorKindMapper.deleteConfigMajorKindById(id);
	}
	
	

}
