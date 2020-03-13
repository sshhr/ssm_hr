package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.MajorChange;

public interface MajorChangeService {
	public List<MajorChange> findMajorChangeAll();
	public List<MajorChange> findMajorChangeByIds(List list);
	public void saveMajorChange(MajorChange s);
	public void changeMajorChange(Map map);
	public void removeMajorChangeById(String id);
}
