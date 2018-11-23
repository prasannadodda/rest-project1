package com.cg.springwithangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springwithangular.beans.Employee;
import com.cg.springwithangular.dao.IEmployeeDAO;
@Service("empservice")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeDAO employeeDAO;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployee();
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeDAO.addEmployee(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDAO.deleteEmployee(id);

	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.searchEmployee(id);
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDAO.updateEmployee(emp);
	}

}
