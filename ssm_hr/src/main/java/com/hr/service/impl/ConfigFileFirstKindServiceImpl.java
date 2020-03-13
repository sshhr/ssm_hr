package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigFileFirstKindMapper;
import com.hr.pojo.ConfigFileFirstKind;
import com.hr.service.ConfigFileFirstKindService;

@Service
public class ConfigFileFirstKindServiceImpl implements ConfigFileFirstKindService {
	@Autowired
	ConfigFileFirstKindMapper configFileFirstKindMapper;

	@Override
	public List<ConfigFileFirstKind> findConfigFileFirstKindAll() {
		// TODO Auto-generated method stub
		return configFileFirstKindMapper.findConfigFileFirstKindAll();
	}

	@Override
	public List<ConfigFileFirstKind> findConfigFileFirstKindByIds(List list) {
		// TODO Auto-generated method stub
		return configFileFirstKindMapper.findConfigFileFirstKindByIds(list);
	}

	@Override
	public void saveConfigFileFirstKind(ConfigFileFirstKind s) {
		configFileFirstKindMapper.insertConfigFileFirstKind(s);
	}

	@Override
	public void changeConfigFileFirstKind(Map map) {
		configFileFirstKindMapper.updateConfigFileFirstKind(map);
	}

	@Override
	public void removeConfigFileFirstKindById(String id) {
		configFileFirstKindMapper.deleteConfigFileFirstKindById(id);
	}
	
	

}
