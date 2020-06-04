package com.student.dao;

import java.util.List;

import com.student.dto.Student;

public interface StudentDao {
	void saveStudent(Student s);
	
	List<Student> viewStudents();

}
