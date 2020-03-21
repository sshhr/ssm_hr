package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.HumanFile;
import com.hr.pojo.HumanFileDig;

@Repository
public interface HumanFileDigMapper {
	public List<HumanFileDig> findHumanFileDigAll();
	public List<HumanFileDig> findHumanFileDigByIds(List list);
	public void insertHumanFileDig(HumanFileDig s);
	public void updateHumanFileDig(Map map);
	public void deleteHumanFileDigById(String hfdId);
//	public HumanFile findHumanFileByHumanId(String id);
	
}
