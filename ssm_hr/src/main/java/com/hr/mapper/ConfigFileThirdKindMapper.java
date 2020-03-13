package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigFileThirdKind;

@Repository
public interface ConfigFileThirdKindMapper {
	public List<ConfigFileThirdKind> findConfigFileThirdKindAll();
	public List<ConfigFileThirdKind> findConfigFileThirdKindByIds(List list);
	public void insertConfigFileThirdKind(ConfigFileThirdKind s);
	public void updateConfigFileThirdKind(Map map);
	public void deleteConfigFileThirdKindById(String ftkId);
	
}
