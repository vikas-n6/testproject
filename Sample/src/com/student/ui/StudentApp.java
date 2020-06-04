package com.student.ui;

import java.util.List;
import java.util.Scanner;

import com.student.dto.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImp;

public class StudentApp {

	private static Scanner sc=new Scanner(System.in);
	private static StudentService stud=new StudentServiceImp();
	
	public static void main(String[] args){
		boolean isExit=true;
		do{
			displayMenu();
			System.out.println("Enter from above choice");
			int choice=sc.nextInt();
			if(choice==1){
				saveStudent();
			}
			else if(choice==2){
				viewStudents();
			}
			else{
				isExit=false;
			}
		}while(isExit);
	}
	
	private static void displayMenu(){
		System.out.println("1.Save Student info.");
		System.out.println("2.View Student info.");
		System.out.println("3.Exit");
	}
	
	private static void saveStudent(){
		Student studentobj=new Student(0,"",0);
		System.out.println("Enter Student id: ");
		int id=sc.nextInt();
		System.out.println("Enter student name: ");
		String name=sc.next();
		System.out.println("Enter student marks:  ");
		int marks=sc.nextInt();
		studentobj.setId(id);
		studentobj.setName(name);
		studentobj.setMarks(marks);
		stud.saveStudent(studentobj);
	}
	
	private static void viewStudents(){
		List<Student> studentList=stud.viewStudents();
		for(Student s:studentList){
			System.out.println(s);
		}
	}
}
