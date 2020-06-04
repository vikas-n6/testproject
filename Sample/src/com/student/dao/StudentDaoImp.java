package com.student.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.student.dto.Student;

public class StudentDaoImp implements StudentDao {

	List<Student> slist=new ArrayList<Student>();
	Map<Integer,Student> smap=new HashMap<Integer,Student>();
	
	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		smap.put(s.getId(), s);

	}

	@Override	
	public List<Student> viewStudents() {
		// TODO Auto-generated method stub
		for(Integer i:smap.keySet()){
			slist.add(smap.get(i));
		}
		
		return slist;
	}

}
