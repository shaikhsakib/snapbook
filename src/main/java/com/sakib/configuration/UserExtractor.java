package com.sakib.configuration;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.dao.DataAccessException;

import com.sakib.model.SnapUser;

public class UserExtractor implements ResultSetExtractor<SnapUser> {  
	  
	 public SnapUser extractData(ResultSet resultSet) throws SQLException,  
	   DataAccessException {  
	    
	  SnapUser user = new SnapUser(); 
	  user.setUserId(resultSet.getInt(1));  
	  user.setFirstName(resultSet.getString(2));  
	  user.setLastName(resultSet.getString(3));  
	  user.setEmail(resultSet.getString(4));
	  user.setMobile(resultSet.getString(5));
	  user.setPassword(resultSet.getString(6));
	    
	  return user;  
	 }  
	  
	}  