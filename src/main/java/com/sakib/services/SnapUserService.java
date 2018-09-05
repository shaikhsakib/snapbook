package com.sakib.services;

import java.util.List;

import com.sakib.model.Login;
import com.sakib.model.SnapUser;

public interface SnapUserService {
	public void insertData(SnapUser snapuser);
	public SnapUser validateuser(Login login);
	 public List<SnapUser> getUserList();  
	 public String deleteData(String id);  
	 public SnapUser getUser(String userId);  
	 public String updateData(SnapUser snapuser, String id); 
}
