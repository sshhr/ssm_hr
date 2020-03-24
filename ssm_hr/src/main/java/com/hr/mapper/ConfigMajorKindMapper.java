package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigMajorKind;

@Repository
public interface ConfigMajorKindMapper {
	public List<ConfigMajorKind> findConfigMajorKindAll();
	public List<ConfigMajorKind> findConfigMajorKindByIds(List list);
	public void insertConfigMajorKind(ConfigMajorKind s);
	public void updateConfigMajorKind(ConfigMajorKind s);
	public int deleteConfigMajorKindById(String mfkId);
	
}
