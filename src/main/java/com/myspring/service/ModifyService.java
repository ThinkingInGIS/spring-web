package com.myspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.dao.AddUserDao;

@Service
public class ModifyService {
	@Autowired
	private AddUserDao addUserDao;
	
	public void updateAddUser(String addUserName, String addPassword, String addReallName){
		addUserDao.updateUser(addUserName, addPassword, addReallName);
	}
}
