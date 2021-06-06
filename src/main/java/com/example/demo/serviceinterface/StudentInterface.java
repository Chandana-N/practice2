package com.example.demo.serviceinterface;

import java.util.List;


import com.example.demo.model.Student;

public interface StudentInterface {
	//to save new student
	public Student saveStudent(Student student);
	
	//to update student
	public Student updateStudent(Student student);

	//to fetch all student from database
	public List<Student> findAllStudents();
	
	//to delete student
	public void deleteStudent(int id);
	
	
}
