package com.student.service;

import java.util.List;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImp;
import com.student.dto.Student;

public class StudentServiceImp implements StudentService {

	private StudentDao dao=new StudentDaoImp();
	
	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		dao.saveStudent(s);
	}

	@Override
	public List<Student> viewStudents() {
		// TODO Auto-generated method stub
		return dao.viewStudents();
	}

}
