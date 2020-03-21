package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigQuestionSecondKind;

public interface ConfigQuestionSecondKindService {
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindAll();
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindByIds(List list);
	public void saveConfigQuestionSecondKind(ConfigQuestionSecondKind s);
	public void changeConfigQuestionSecondKind(Map map);
	public void removeConfigQuestionSecondKindById(String id);
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindByFirstKindId(String firstKindId);
}
