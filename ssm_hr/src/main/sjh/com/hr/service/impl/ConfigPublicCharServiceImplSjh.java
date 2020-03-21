package com.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.ConfigPublicCharMapperSjh;
import com.hr.service.ConfigPublicCharServiceSjh;

@Service
public class ConfigPublicCharServiceImplSjh implements ConfigPublicCharServiceSjh{
	@Autowired
	ConfigPublicCharMapperSjh configPublicCharMapper;
	@Override
	public List<String> findConfigPublicCharByAttributeKind(String name) {
		return configPublicCharMapper.findConfigPublicCharByAttributeKind(name);
	}

}
