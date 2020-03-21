package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigQuestionSecondKind;

public interface ConfigQuestionSecondKindService {
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindAll();
	public List<ConfigQuestionSecondKind> findConfigQuestionSecondKindByIds(List list);
	public void saveConfigQuestionSecondKind(ConfigQuestionSecondKind s);
	public void changeConfigQuestionSecondKind(ConfigQuestionSecondKind s);
	public int removeConfigQuestionSecondKindById(String id);
}
