package com.sakib.dao;

import java.util.List;

import com.sakib.model.Login;
import com.sakib.model.SnapUser;

public interface SnapUserDao {
	 public void insertData(SnapUser user); 
	 public SnapUser validateuser(Login login);
	public List<SnapUser> getUserList();  
	 public String updateData(SnapUser snapuser, String id);  
	 public String deleteData(String id);  
	 public SnapUser getUser(String userId);  
}
