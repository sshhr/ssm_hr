package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigMajor;

@Repository
public interface ConfigMajorMapper {
	public List<ConfigMajor> findConfigMajorAll();
	public List<ConfigMajor> findConfigMajorByIds(List list);
	public void insertConfigMajor(ConfigMajor s);
	public void updateConfigMajor(Map map);
	public void deleteConfigMajorById(String makId);
	public List<ConfigMajor> findConfigMajorByMajorKindId(String mkid);
}
