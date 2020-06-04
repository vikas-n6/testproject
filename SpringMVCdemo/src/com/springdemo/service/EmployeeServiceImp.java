package com.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.dao.EmployeeDAO;
import com.springdemo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployees();
	}

}
