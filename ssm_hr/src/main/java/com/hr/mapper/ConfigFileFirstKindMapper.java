package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigFileFirstKind;

@Repository
public interface ConfigFileFirstKindMapper {
	public List<ConfigFileFirstKind> findConfigFileFirstKindAll();
	public List<ConfigFileFirstKind> findConfigFileFirstKindByIds(List list);
	public void insertConfigFileFirstKind(ConfigFileFirstKind s);
	public void updateConfigFileFirstKind(Map map);
	public void deleteConfigFileFirstKindById(String ffkId);
	
}
