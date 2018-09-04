package com.sakib.services;

import java.util.List;

import com.sakib.model.Login;
import com.sakib.model.SnapUser;

public interface SnapUserService {
	public void insertData(SnapUser snapuser);
	public SnapUser validateuser(Login login);
	 public List<SnapUser> getUserList();  
	 public void deleteData(String id);  
	 public SnapUser getUser(String mobile);  
	 public void updateData(SnapUser snapuser); 
}
