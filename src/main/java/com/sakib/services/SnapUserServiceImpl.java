package com.sakib.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakib.dao.SnapUserDao;
import com.sakib.model.Login;
import com.sakib.model.SnapUser;

@Service//productServiceImpl=new ProductServiceImpl
@Transactional
public class SnapUserServiceImpl implements SnapUserService{

	@Autowired  
	 SnapUserDao snapuserdao;
	
	
	public void insertData(SnapUser snapuser) {
		  snapuserdao.insertData(snapuser);  
		
	}

	public List<SnapUser> getUserList() {
		  return snapuserdao.getUserList();  
	}

	public String deleteData(String id) {
		  
		return snapuserdao.deleteData(id);  
	}

	public SnapUser getUser(String userId) {
		  return snapuserdao.getUser(userId);  
	}

	public String updateData(SnapUser snapuser, String id) {
		   return snapuserdao.updateData(snapuser, id);  
	}

	public SnapUser validateuser(Login login) {
		return snapuserdao.validateuser(login);
	}


}
