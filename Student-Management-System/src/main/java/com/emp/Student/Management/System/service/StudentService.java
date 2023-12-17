package com.emp.Student.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Student.Management.System.dao.StudentDao;
import com.emp.Student.Management.System.dto.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public void saveStudent(Student student) {

		studentDao.saveStudent(student);

	}

	public List<Student> getAllStudents() {

		return studentDao.getAllStudents();

	}

	public void deleteStudent(int rollno) {

		studentDao.deleteStudent(rollno);
	}

	  public Student getStudentById(int rollno) {
		  
		  return studentDao.getStudentById(rollno);
		  
	  }
	  
	  public List<Object[]> getDataForStudent(int studentId) {
		  
		  return studentDao.getDataForStudent(studentId);
	  }


}
