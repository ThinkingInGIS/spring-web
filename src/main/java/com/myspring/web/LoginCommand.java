package com.myspring.web;

/*
 * 该类的属性与jsp页面中form中input 的name属性 必须保持一致 该类属于POJO类
 */
public class LoginCommand {
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
