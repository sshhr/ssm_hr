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
	public int deleteHumanFileById(int hufId);
	public HumanFile findHumanFileByHumanId(String humanid);
	public List<HumanFile> findHumanFileByStatus(int checkStatus);
	public List<HumanFile> findLocate(Map map);
	public List<HumanFile> deleteLocate(Map map);
	public List<HumanFile> findSearch(Map map);
	public List<HumanFile> deleteSearch(Map map);
	public List<HumanFile> recoverySearch(Map map);
	public List<HumanFile> recoveryLocate(Map map);
	public List<HumanFile> findHumanFileByHumanStatus(int humanFileStatus);
}
