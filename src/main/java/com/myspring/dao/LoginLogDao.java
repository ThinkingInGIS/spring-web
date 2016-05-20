package com.myspring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myspring.domain.LoginLog;

@Repository
public class LoginLogDao {
	@Autowired
	private JdbcTemplate jdbcTemplate; //使用spring jdbc方式对数据库进行操作
	
	public void insertLoginLog(LoginLog loginLog){
		String sqlStr = "INSERT INTO t_login_log(user_id, ip, login_datetime) " + "VALUES(?,?,?)";
		Object[] args = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate()};
		jdbcTemplate.update(sqlStr, args);
	}
}
