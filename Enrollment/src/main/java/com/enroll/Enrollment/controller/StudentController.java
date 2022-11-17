package com.enroll.Enrollment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import com.enroll.Enrollment.entity.Student;
import com.enroll.Enrollment.repository.StudentRepo;
import com.enroll.Enrollment.service.*;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("/addstudent")
	public void register(@RequestBody Student student) {
		studentServiceImpl.addStudent(student);
	}
	@GetMapping("/getstudents")
	public List<Student> getAllStudents(){
		return studentServiceImpl.getStudent();
	}
	
	@GetMapping("/getstudent/{id}")
	public Student studentById(@PathVariable("id") int id){
		return studentServiceImpl.getStudentById(id);
	}
	@DeleteMapping("deletestudent/{id}")
	public String deleteStudent(@PathVariable("id") int id){
		return studentServiceImpl.deleteStudentById(id);
	}
	
	@PutMapping("/updatestudent/{id}")
	ResponseEntity<Student> updateStudentById(@PathVariable("id") int id, @RequestBody Student student){
		Student updateStudent = studentRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Student with id " + id +  " doesn't not exist" ));
				updateStudent.setName(student.getName());
				updateStudent.setAge(student.getAge());
				updateStudent.setSchoolYear(student.getSchoolYear());
				
				studentRepo.save(updateStudent);
		
		return ResponseEntity.ok(updateStudent);
	}
}
