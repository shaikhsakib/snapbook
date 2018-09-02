package com.sakib.dao;

import java.util.List;

import com.sakib.model.Login;
import com.sakib.model.SnapUser;

public interface SnapUserDao {
	 public void insertData(SnapUser user); 
	 public SnapUser validateuser(Login login);
	public List<SnapUser> getUserList();  
	 public void updateData(SnapUser user);  
	 public void deleteData(String id);  
	 public SnapUser getUser(String id);  
}
