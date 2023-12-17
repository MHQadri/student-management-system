package com.emp.Student.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.Student.Management.System.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
