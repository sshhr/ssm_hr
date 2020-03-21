package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigPrimaryKey;

@Repository
public interface ConfigPrimaryKeyMapper {
	public List<ConfigPrimaryKey> findConfigPrimaryKeyAll();
	public List<ConfigPrimaryKey> findConfigPrimaryKeyByIds(List list);
	public void insertConfigPrimaryKey(ConfigPrimaryKey s);
	public void updateConfigPrimaryKey(Map map);
	public void deleteConfigPrimaryKeyById(String prkId);
	public List<ConfigPrimaryKey> findConfigPrimaryKeyByPrimaryKeyTable(String tableName);
}
