package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.Bonus;

public interface BonusService {
	public List<Bonus> findBonusAll();
	public List<Bonus> findBonusByIds(List list);
	public void saveBonus(Bonus s);
	public void changeBonus(Map map);
	public void removeBonusById(String id);
}
