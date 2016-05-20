package com.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.dao.AddUserDao;
import com.myspring.domain.AddUser;

@Service
public class ShowAddUserService {
	@Autowired
	private AddUserDao addUserDao;
	
	public List<AddUser> showAllAddUser(){
		return addUserDao.getAddUserList();
	}
	
	public int count(){
		return addUserDao.count();
	}
	
	public List<AddUser> getQueryAddUserList(String QaddUserName, String QaddRealName){
		return addUserDao.queryAddUserList(QaddUserName, QaddRealName);
	}
}
