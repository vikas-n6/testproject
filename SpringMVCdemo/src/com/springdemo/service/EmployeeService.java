package com.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springdemo.entity.Employee;


public interface EmployeeService {

	public List<Employee> getEmployees();
}
