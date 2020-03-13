package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.Users;

@Repository
public interface UsersMapper {
	public List<Users> findUsersAll();
	public List<Users> findUsersByIds(List list);
	public void insertUsers(Users s);
	public void updateUsers(Map map);
	public void deleteUsersById(String uId);
	
}
