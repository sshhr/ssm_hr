package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigFileSecondKindMapper;
import com.hr.pojo.ConfigFileSecondKind;
import com.hr.service.ConfigFileSecondKindService;

@Service
public class ConfigFileSecondKindServiceImpl implements ConfigFileSecondKindService {
	@Autowired
	ConfigFileSecondKindMapper configFileSecondKindMapper;

	@Override
	public List<ConfigFileSecondKind> findConfigFileSecondKindAll() {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.findConfigFileSecondKindAll();
	}

	@Override
	public List<ConfigFileSecondKind> findConfigFileSecondKindByIds(List list) {
		// TODO Auto-generated method stub
		return configFileSecondKindMapper.findConfigFileSecondKindByIds(list);
	}

	@Override
	public void saveConfigFileSecondKind(ConfigFileSecondKind s) {
		configFileSecondKindMapper.insertConfigFileSecondKind(s);
	}

	@Override
	public void changeConfigFileSecondKind(Map map) {
		configFileSecondKindMapper.updateConfigFileSecondKind(map);
	}

	@Override
	public void removeConfigFileSecondKindById(String id) {
		configFileSecondKindMapper.deleteConfigFileSecondKindById(id);
	}

	@Override
	public List<ConfigFileSecondKind> findConfigFileSecondKindByFirstId(String fid) {
		return configFileSecondKindMapper.findConfigFileSecondKindByFirstId(fid);
	}
	
	

}
