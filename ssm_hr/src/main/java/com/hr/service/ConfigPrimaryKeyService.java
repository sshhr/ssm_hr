package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigPrimaryKey;

public interface ConfigPrimaryKeyService {
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAll();
	public List<ConfigPrimaryKey> findConfigPrimaryKeyByIds(List list);
	public void saveConfigPrimaryKey(ConfigPrimaryKey s);
	public void changeConfigPrimaryKey(Map map);
	public void removeConfigPrimaryKeyById(String id);
	public List<ConfigPrimaryKey> findConfigPrimaryKeyByPrimaryKeyTable(String tableName);
}
