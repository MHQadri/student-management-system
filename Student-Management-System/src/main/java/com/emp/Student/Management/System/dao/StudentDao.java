package com.emp.Student.Management.System.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emp.Student.Management.System.dto.Student;
import com.emp.Student.Management.System.repository.StudentRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class StudentDao {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private EntityManager entityManager;


	public void saveStudent(Student student) {

		studentRepository.save(student);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public void deleteStudent(int rollno) {
		studentRepository.deleteById(rollno);
	}

	public Student getStudentById(int rollno) {

		return studentRepository.findById(rollno).get();

	}

	 public List<Object[]> getDataForStudent(int studentId) {
	        List<Object[]> resultList = new ArrayList<>();

	        // Example: Selecting all data based on user-provided Student ID for Student and ReportCard entity classes
	        String nativeQuery = "SELECT s.*, r.* " +
	                             "FROM student s " +
	                             "JOIN report_card r ON s.rollno = r.rollno " +
	                             "WHERE s.rollno = :studentId";

	        Query query = entityManager.createNativeQuery(nativeQuery);
	        query.setParameter("studentId", studentId);

	        resultList = query.getResultList();

	        return resultList;
	    }

}
