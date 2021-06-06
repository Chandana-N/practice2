package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;
import com.example.demo.serviceinterface.StudentInterface;

@Service
public class StudentServiceimpl implements StudentInterface  {
    
	@Autowired
	private StudentRepository studentRepo;
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		// it returns a list so casting is needed
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// to delete student
		studentRepo.deleteById(id);
		
	}
	

}
