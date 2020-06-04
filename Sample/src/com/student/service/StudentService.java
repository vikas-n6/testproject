package com.student.service;

import java.util.List;

import com.student.dto.Student;

public interface StudentService {

	void saveStudent(Student s);
	List<Student> viewStudents();
}
