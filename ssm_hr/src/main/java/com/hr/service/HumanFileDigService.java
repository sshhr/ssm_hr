package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.HumanFileDig;

public interface HumanFileDigService {
	public List<HumanFileDig> findHumanFileDigAll();
	public List<HumanFileDig> findHumanFileDigByIds(List list);
	public void saveHumanFileDig(HumanFileDig s);
	public void changeHumanFileDig(Map map);
	public void removeHumanFileDigById(String id);
}
