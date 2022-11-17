package com.enroll.Enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enroll.Enrollment.entity.*;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
