package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.Bonus;

@Repository
public interface BonusMapper {
	public List<Bonus> findBonusAll();
	public List<Bonus> findBonusByIds(List list);
	public void insertBonus(Bonus s);
	public void updateBonus(Map map);
	public void deleteBonusById(String bonId);
	
}
