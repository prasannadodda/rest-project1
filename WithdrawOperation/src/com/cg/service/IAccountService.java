package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.entities.CustomerBean;

@Service
public interface IAccountService {
	public double withDraw(int accountId,double rupees);
}
