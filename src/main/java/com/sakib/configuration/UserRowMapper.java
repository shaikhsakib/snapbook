package com.sakib.configuration;

import java.sql.ResultSet;
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;

import com.sakib.model.SnapUser;

public class UserRowMapper implements RowMapper<SnapUser> {  
  
 public SnapUser mapRow(ResultSet resultSet, int line) throws SQLException {  
  UserExtractor userExtractor = new UserExtractor();  
  return userExtractor.extractData(resultSet);  
 }  
  
}  