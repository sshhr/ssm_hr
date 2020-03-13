package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigFileThirdKindMapper;
import com.hr.pojo.ConfigFileThirdKind;
import com.hr.service.ConfigFileThirdKindService;

@Service
public class ConfigFileThirdKindServiceImpl implements ConfigFileThirdKindService {
	@Autowired
	ConfigFileThirdKindMapper configFileThirdKindMapper;

	@Override
	public List<ConfigFileThirdKind> findConfigFileThirdKindAll() {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.findConfigFileThirdKindAll();
	}

	@Override
	public List<ConfigFileThirdKind> findConfigFileThirdKindByIds(List list) {
		// TODO Auto-generated method stub
		return configFileThirdKindMapper.findConfigFileThirdKindByIds(list);
	}

	@Override
	public void saveConfigFileThirdKind(ConfigFileThirdKind s) {
		configFileThirdKindMapper.insertConfigFileThirdKind(s);
	}

	@Override
	public void changeConfigFileThirdKind(Map map) {
		configFileThirdKindMapper.updateConfigFileThirdKind(map);
	}

	@Override
	public void removeConfigFileThirdKindById(String id) {
		configFileThirdKindMapper.deleteConfigFileThirdKindById(id);
	}
	
	

}
