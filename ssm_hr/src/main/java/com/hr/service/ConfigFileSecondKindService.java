package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigFileSecondKind;

public interface ConfigFileSecondKindService {
	public List<ConfigFileSecondKind> findConfigFileSecondKindAll();
	public List<ConfigFileSecondKind> findConfigFileSecondKindByIds(List list);
	public void saveConfigFileSecondKind(ConfigFileSecondKind s);
	public void changeConfigFileSecondKind(Map map);
	public void removeConfigFileSecondKindById(String id);
}
