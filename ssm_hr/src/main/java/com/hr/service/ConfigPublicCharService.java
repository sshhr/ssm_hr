package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigPublicChar;

public interface ConfigPublicCharService {
	public List<ConfigPublicChar> findConfigPublicCharAll();
	public List<ConfigPublicChar> findConfigPublicCharByIds(List list);
	public void saveConfigPublicChar(ConfigPublicChar s);
	public void changeConfigPublicChar(Map map);
	public void removeConfigPublicCharById(String id);
}
