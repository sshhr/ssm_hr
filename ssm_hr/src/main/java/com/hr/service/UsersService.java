package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.Users;

public interface UsersService {
	public List<Users> findUsersAll();
	public List<Users> findUsersByIds(List list);
	public void saveUsers(Users s);
	public void changeUsers(Map map);
	public void removeUsersById(String id);
}
