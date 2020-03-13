package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigFileFirstKind;

public interface ConfigFileFirstKindService {
	public List<ConfigFileFirstKind> findConfigFileFirstKindAll();
	public List<ConfigFileFirstKind> findConfigFileFirstKindByIds(List list);
	public void saveConfigFileFirstKind(ConfigFileFirstKind s);
	public void changeConfigFileFirstKind(Map map);
	public void removeConfigFileFirstKindById(String id);
}
