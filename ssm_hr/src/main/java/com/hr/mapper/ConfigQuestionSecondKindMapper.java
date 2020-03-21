package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.ConfigQuestionSecondKind;

@Repository
public interface ConfigQuestionSecondKindMapper {
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindAll();
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindByIds(List list);
	public void insertConfigQuestionSecondKind(ConfigQuestionSecondKind s);
	public void updateConfigQuestionSecondKind(Map map);
	public void deleteConfigQuestionSecondKindById(String qskId);
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindByFirstKindId(String firstKindId);
}
