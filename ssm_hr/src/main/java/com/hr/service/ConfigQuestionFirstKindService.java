package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.ConfigQuestionFirstKind;

public interface ConfigQuestionFirstKindService {
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindAll();
	public List<ConfigQuestionFirstKind> findConfigQuestionFirstKindByIds(List list);
	public void saveConfigQuestionFirstKind(ConfigQuestionFirstKind s);
	public void changeConfigQuestionFirstKind(Map map);
	public void removeConfigQuestionFirstKindById(String id);
}
