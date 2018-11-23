package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entities.AccountBean;
import com.cg.staticdb.Accountdb;


@Repository("dao")
public class AccountDaoImpl implements IAccountDAO {
	

	@Override
	public double withDraw(int accountId, double rupees) {
		List<AccountBean> myList=Accountdb.getlist();
		double balance=0;
		for (AccountBean accountBean : myList) {
			if(accountBean.getAccountId() == accountId){
				if(accountBean.getBalance() > rupees){
					
				  balance = accountBean.getBalance() - rupees;
				  accountBean.setBalance(balance);
					
				}
			}
	
	}		
		return balance;	
}	
}


	





