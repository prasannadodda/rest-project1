package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.dao.IAccountDAO;

@Service("accountservice")
public class AccountServiceImpl implements IAccountService {

	@Autowired
	IAccountDAO dao;
	
	public double withDraw(int accountId, double rupees) {
	
		return dao.withDraw(accountId, rupees);
	}

	


}
