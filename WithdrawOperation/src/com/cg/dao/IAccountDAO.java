package com.cg.dao;

import java.util.List;

import com.cg.entities.CustomerBean;


public interface IAccountDAO {

	public double withDraw(int accountId,double rupees);
}
