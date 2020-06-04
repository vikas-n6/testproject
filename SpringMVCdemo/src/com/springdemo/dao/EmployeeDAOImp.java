package com.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springdemo.entity.Employee;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query<Employee> theQuery=session.createQuery("from Employee", Employee.class);
		List<Employee> theEmployees=theQuery.getResultList();
		
		return theEmployees;
	}

}
