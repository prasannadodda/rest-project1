package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.IAccountService;

@CrossOrigin(origins="http://localhost:8086") 
@RestController
public class MyController {

	@Autowired
	IAccountService accountservice;

	@RequestMapping(value = "/withdraw/accountId/balance", headers ="Accept=application/json", method =RequestMethod.GET)
	public double withdraw(@PathVariable("accountId") int id,
			@PathVariable("balance") double amount) {
        System.out.println("hi");
		return accountservice.withDraw(id, amount);

	}

}
