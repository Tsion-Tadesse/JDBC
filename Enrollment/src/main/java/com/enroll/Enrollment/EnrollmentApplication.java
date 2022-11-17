package com.enroll.Enrollment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrollmentApplication.class, args);
		
		/*if the controller layer isn't @RestController
		ApplicationCOntext ctx = SpringApplication.run(EnrollmentApplication.class, args);
		StudentController studentController = xtx.getBean(StudentController.class);
		studentController.getAllStudents();
		*/
		System.out.println("Test");
	}

}
