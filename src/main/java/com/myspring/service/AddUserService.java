package com.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.dao.AddUserDao;
import com.myspring.domain.AddUser;

@Service
public class AddUserService {
	@Autowired
	private AddUserDao addUserDao;
	
	public void createAddUser(AddUser addUser){
		addUserDao.addUser(addUser);
	}
	
	public List<AddUser> showAllAddUser(){
		return addUserDao.getAddUserList();
	}
}
