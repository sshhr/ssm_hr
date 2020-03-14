package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigFileThirdKind;

public interface ConfigFileThirdKindService {
	public List<ConfigFileThirdKind> findConfigFileThirdKindAll();
	public List<ConfigFileThirdKind> findConfigFileThirdKindByIds(List list);
	public void saveConfigFileThirdKind(ConfigFileThirdKind s);
	public void changeConfigFileThirdKind(Map map);
	public void removeConfigFileThirdKindById(String id);
	public List<ConfigFileThirdKind> findConfigFileThirdKindByFirstIdAndSecondId(Map map);
}
