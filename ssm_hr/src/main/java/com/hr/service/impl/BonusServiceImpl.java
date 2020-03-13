package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.BonusMapper;
import com.hr.pojo.Bonus;
import com.hr.service.BonusService;

@Service
public class BonusServiceImpl implements BonusService {
	@Autowired
	BonusMapper bonusMapper;

	@Override
	public List<Bonus> findBonusAll() {
		// TODO Auto-generated method stub
		return bonusMapper.findBonusAll();
	}

	@Override
	public List<Bonus> findBonusByIds(List list) {
		// TODO Auto-generated method stub
		return bonusMapper.findBonusByIds(list);
	}

	@Override
	public void saveBonus(Bonus s) {
		bonusMapper.insertBonus(s);
	}

	@Override
	public void changeBonus(Map map) {
		bonusMapper.updateBonus(map);
	}

	@Override
	public void removeBonusById(String id) {
		bonusMapper.deleteBonusById(id);
	}
	
	

}
