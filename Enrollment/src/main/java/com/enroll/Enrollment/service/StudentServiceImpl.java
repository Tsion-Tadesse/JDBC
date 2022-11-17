package com.enroll.Enrollment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enroll.Enrollment.entity.Student;
import com.enroll.Enrollment.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public void addStudent(Student student) {
		
		studentRepo.save(student);
	}

	@Override
	public List<Student> getStudent() {
		
		return studentRepo.findAll();
	}


	@Override
	public Student getStudentById(int id) {
		
		return studentRepo.findById(id).get();
	}

	@Override
	public String deleteStudentById(int id) {
		try {
			 studentRepo.deleteById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Deleted";
		
	}

	@Override
	public void updateBookById(int id, Student student) {
		
		
	}

}
