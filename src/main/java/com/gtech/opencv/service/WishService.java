package com.gtech.opencv.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.gtech.opencv.dao.WishDao;
import com.gtech.opencv.model.GenericResult;

@Named
public class WishService {

	@Inject
	WishDao wishDao;

	public List<GenericResult> getAccount(String cpf) {
		return wishDao.getAccount(cpf);
	}
	
	public boolean save(String wish) {
		return wishDao.save(wish);
	}
}