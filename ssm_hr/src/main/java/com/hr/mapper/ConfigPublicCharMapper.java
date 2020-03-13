package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigPublicChar;

@Repository
public interface ConfigPublicCharMapper {
	public List<ConfigPublicChar> findConfigPublicCharAll();
	public List<ConfigPublicChar> findConfigPublicCharByIds(List list);
	public void insertConfigPublicChar(ConfigPublicChar s);
	public void updateConfigPublicChar(Map map);
	public void deleteConfigPublicCharById(String pbcId);
	
}
