package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigMajorKind;

public interface ConfigMajorKindService {
	public List<ConfigMajorKind> findConfigMajorKindAll();
	public List<ConfigMajorKind> findConfigMajorKindByIds(List list);
	public void saveConfigMajorKind(ConfigMajorKind s);
	public void changeConfigMajorKind(ConfigMajorKind s);
	public int removeConfigMajorKindById(String id);
}
