package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigMajor;

public interface ConfigMajorService {
	public List<ConfigMajor> findConfigMajorAll();
	public List<ConfigMajor> findConfigMajorByIds(List list);
	public void saveConfigMajor(ConfigMajor s);
	public void changeConfigMajor(Map map);
	public void removeConfigMajorById(String id);
}
