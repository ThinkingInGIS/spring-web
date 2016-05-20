package com.myspring.domain;

public class AddUser {
	private int id;
	private String addUserName;
	private String addPassword;
	private String addReallName;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getAddUserName() {
		return addUserName;
	}
	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}
	public String getAddPassword() {
		return addPassword;
	}
	public void setAddPassword(String addPassword) {
		this.addPassword = addPassword;
	}
	public String getAddReallName() {
		return addReallName;
	}
	public void setAddReallName(String addReallName) {
		this.addReallName = addReallName;
	}

	
}
