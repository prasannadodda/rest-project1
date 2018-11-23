package com.cg.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.entities.AccountBean;

public class Accountdb {
	
private static List<AccountBean> list=new ArrayList<AccountBean>();
	
	static{
		
		list.add(new AccountBean(101,"rani","gollakoti",1000.00));
		list.add(new AccountBean(102,"prasanna","dodda",2000.00));
		list.add(new AccountBean(103,"sowji","nayana",2500.00));
		list.add(new AccountBean(104,"rohini","thunuguntla",6500.00));
		list.add(new AccountBean(105,"vinitha","naraveneni",1000.00));
	}

	public static List<AccountBean> getlist() {
		
		return list;
	}

	public static void setCountryList(List<AccountBean> list) {
		
		Accountdb.list = list;
	}
}
