package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigQuestionFirstKind;

@Repository
public interface ConfigQuestionFirstKindMapper {
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindAll();
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindByIds(List list);
	public void insertConfigQuestionFirstKind(ConfigQuestionFirstKind s);
	public void updateConfigQuestionFirstKind(Map map);
	public void deleteConfigQuestionFirstKindById(String qfkId);
	
}
