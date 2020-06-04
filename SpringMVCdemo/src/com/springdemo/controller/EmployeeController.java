package com.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.entity.Employee;
import com.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public String listEmployees(Model theModel){
		
		List<Employee> theEmployees = employeeService.getEmployees();
		
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
	
	
	
}
