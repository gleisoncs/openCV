package com.gtech.onepage.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.gtech.onepage.dao.WishDao;
import com.gtech.onepage.model.GenericResult;

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