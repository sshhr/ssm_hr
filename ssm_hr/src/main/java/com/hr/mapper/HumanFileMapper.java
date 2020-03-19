package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.HumanFile;

@Repository
public interface HumanFileMapper {
	public List<HumanFile> findHumanFileAll();
	public List<HumanFile> findHumanFileByIds(List list);
	public void insertHumanFile(HumanFile s);
	public void updateHumanFile(Map map);
	public void deleteHumanFileById(String hufId);
	public HumanFile findHumanFileByHumanId(String humanid);
	public List<HumanFile> findHumanFileByStatus(int humanFileStatus);
	
}
