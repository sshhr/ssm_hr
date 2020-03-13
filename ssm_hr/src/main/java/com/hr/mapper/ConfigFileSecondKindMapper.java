package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigFileSecondKind;

@Repository
public interface ConfigFileSecondKindMapper {
	public List<ConfigFileSecondKind> findConfigFileSecondKindAll();
	public List<ConfigFileSecondKind> findConfigFileSecondKindByIds(List list);
	public void insertConfigFileSecondKind(ConfigFileSecondKind s);
	public void updateConfigFileSecondKind(Map map);
	public void deleteConfigFileSecondKindById(String fskId);
	
}
