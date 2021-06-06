package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceimplementation.StudentServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
//we are using postman to do operation for that we need to add cross origin annotation
@CrossOrigin("*")

public class HomeController {
	//to create bean of implementation class
	@Autowired
	private StudentServiceimpl studentServiceImpl;
	
	//to call save method or to save new student
	@PostMapping(value="saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		
		System.out.println("student save works properly");
		studentServiceImpl.saveStudent(student);
		return student;

}
	//find all student from db
	@GetMapping(value="getAllStudent")
	public List<Student> findAllStudent(){
		return studentServiceImpl.findAllStudents();
		
	}
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
		
	}
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		studentServiceImpl.deleteStudent(id);
		return "Student Deleted";
	}
}