package com.myspring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.myspring.domain.AddUser;

@Repository
public class AddUserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void updateUser(String addUserName, String addPassword, String addReallName){
		String sql = "UPDATE adduser SET addPassword=? , addRealName=? where addUserName=?";
		jdbcTemplate.update(sql, addPassword, addReallName, addUserName);
	}
	
	public void addUser(AddUser addUser){
		String sql = "INSERT INTO adduser VALUES(null, ?, ?, ?)";
		jdbcTemplate.update(sql, new Object[]{addUser.getAddUserName(), addUser.getAddPassword(), addUser.getAddReallName()});
	}
	
	public List<AddUser> getAddUserList(){
		return this.jdbcTemplate.query("select * from adduser", new RowMapper<AddUser>(){

			public AddUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				AddUser adduser = new AddUser();
				adduser.setId(rs.getInt("id"));
				adduser.setAddUserName(rs.getString("addUserName"));
				adduser.setAddPassword(rs.getString("addPassword"));
				adduser.setAddReallName(rs.getString("addRealName"));
				return adduser;
			}
			
		});
	}
	
	public List<AddUser> queryAddUserList(String QaddUserName, String QaddRealName){
		String sql = "select * from adduser where addUserName like '%" + QaddUserName + "%' and addRealName like '%" + QaddRealName + "%'";
		return this.jdbcTemplate.query(sql, new RowMapper<AddUser>(){

			public AddUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				AddUser adduser = new AddUser();
				adduser.setId(rs.getInt("id"));
				adduser.setAddUserName(rs.getString("addUserName"));
				adduser.setAddPassword(rs.getString("addPassword"));
				adduser.setAddReallName(rs.getString("addRealName"));
				return adduser;
			}
			
		});
	}
	
	public int count(){
		return this.jdbcTemplate.queryForObject("select count(*) from adduser", Integer.class);
	}
	
}
