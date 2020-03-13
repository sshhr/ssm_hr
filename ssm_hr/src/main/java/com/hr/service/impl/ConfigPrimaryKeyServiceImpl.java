package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigPrimaryKeyMapper;
import com.hr.pojo.ConfigPrimaryKey;
import com.hr.service.ConfigPrimaryKeyService;

@Service
public class ConfigPrimaryKeyServiceImpl implements ConfigPrimaryKeyService {
	@Autowired
	ConfigPrimaryKeyMapper ConfigPrimaryKeyMapper;

	@Override
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAll() {
		// TODO Auto-generated method stub
		return ConfigPrimaryKeyMapper.findConfigPrimaryKeyAll();
	}

	@Override
	public List<ConfigPrimaryKey> findConfigPrimaryKeyByIds(List list) {
		// TODO Auto-generated method stub
		return ConfigPrimaryKeyMapper.findConfigPrimaryKeyByIds(list);
	}

	@Override
	public void saveConfigPrimaryKey(ConfigPrimaryKey s) {
		ConfigPrimaryKeyMapper.insertConfigPrimaryKey(s);
	}

	@Override
	public void changeConfigPrimaryKey(Map map) {
		ConfigPrimaryKeyMapper.updateConfigPrimaryKey(map);
	}

	@Override
	public void removeConfigPrimaryKeyById(String id) {
		ConfigPrimaryKeyMapper.deleteConfigPrimaryKeyById(id);
	}
	
	

}
