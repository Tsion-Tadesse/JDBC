package com.enroll.Enrollment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enroll.Enrollment.entity.Student;
@Service
public interface StudentService {

	
	public void addStudent(Student student);
	public List<Student> getStudent();
	public Student getStudentById(int id);
	public String deleteStudentById(int id);
	public void updateBookById(int id, Student student);
	
}
