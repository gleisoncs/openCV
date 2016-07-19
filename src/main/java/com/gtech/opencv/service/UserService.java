package com.gtech.opencv.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.gtech.opencv.dao.UserDao;
import com.gtech.opencv.model.GenericResult;

@Named
public class UserService {

	@Inject
	UserDao userDao;

	public List<GenericResult> getAccount(String cpf) {
		return userDao.getAccount(cpf);
	}
	
	public boolean save(String email, String password, String language) {
		return userDao.save(email, password, language);
	}

}