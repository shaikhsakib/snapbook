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

	public void deleteData(String id) {
		  snapuserdao.deleteData(id);  
	}

	public SnapUser getUser(String id) {
		  return snapuserdao.getUser(id);  
	}

	public void updateData(SnapUser snapuser) {
		  snapuserdao.updateData(snapuser);  
	}

	public SnapUser validateuser(Login login) {
		return snapuserdao.validateuser(login);
	}


}
