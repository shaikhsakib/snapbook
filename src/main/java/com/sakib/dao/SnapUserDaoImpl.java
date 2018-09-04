package com.sakib.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sakib.configuration.UserRowMapper;
import com.sakib.model.Login;
import com.sakib.model.SnapUser;

public class SnapUserDaoImpl implements SnapUserDao{

	 @Autowired  
	 DataSource dataSource;  
	 JdbcTemplate jdbcTemplate;
	
	public void insertData(SnapUser user) {
		String sql = "INSERT INTO snapuser "  
			    + "(firstname,lastname, email, mobile, password) VALUES (?, ?, ?,?, ?)";  
			  
			  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
			  
			  jdbcTemplate.update(  
			    sql,  
			    new Object[] { user.getFirstName(), user.getLastName(),  
			      user.getEmail(), user.getMobile(), user.getPassword() }); 
	}
	public List<SnapUser> getUserList() {
		List userList = new ArrayList();  
		  
		  String sql = "select * from snapuser";  
		  
		   jdbcTemplate = new JdbcTemplate(dataSource);  
		  userList = jdbcTemplate.query(sql, new UserRowMapper());  
		  return userList;  
	}

	public void updateData(SnapUser user) {

		  String sql = "UPDATE snapuser set firstname = ?,lastname = ?, email = ?, mobile = ?, password = ?, where mobile=?";  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  
		  jdbcTemplate.update(  
		    sql,  
		    new Object[] { user.getFirstName(), user.getLastName(),  
		      user.getEmail(), user.getMobile(), user.getPassword() });
	
		
	}

	public void deleteData(String id) {
		// TODO Auto-generated method stub
}

	public SnapUser getUser(String mobile) {
		List<SnapUser> userList = new ArrayList<SnapUser>();  
		  String sql = "select * from snapuser where mobile='"+mobile+"';";  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  userList = jdbcTemplate.query(sql, new UserRowMapper()); 
		  if(userList.isEmpty()) {
			  return null;
		  }
		  return userList.get(0); 
	}
	
	public SnapUser validateuser(Login login) {
	    String sql = "select * from snapuser where email='" + login.getEmail() + "' and password='" + login.getPassword()
	    + "'";
	    jdbcTemplate = new JdbcTemplate(dataSource);
	    List<SnapUser> snapusers = jdbcTemplate.query(sql, new UserRowMapper());
	    return snapusers.size() > 0 ? snapusers.get(0) : null;
	    }
	  }

	


