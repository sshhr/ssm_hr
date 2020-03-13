package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.UsersMapper;
import com.hr.pojo.Users;
import com.hr.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersMapper UsersMapper;

	@Override
	public List<Users> findUsersAll() {
		// TODO Auto-generated method stub
		return UsersMapper.findUsersAll();
	}

	@Override
	public List<Users> findUsersByIds(List list) {
		// TODO Auto-generated method stub
		return UsersMapper.findUsersByIds(list);
	}

	@Override
	public void saveUsers(Users s) {
		UsersMapper.insertUsers(s);
	}

	@Override
	public void changeUsers(Map map) {
		UsersMapper.updateUsers(map);
	}

	@Override
	public void removeUsersById(String id) {
		UsersMapper.deleteUsersById(id);
	}
	
	

}
