package com.emp.Student.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emp.Student.Management.System.dto.Student;
import com.emp.Student.Management.System.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@GetMapping("/studentList")
	public String listStudents(Model model) {

		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "student_list";
	}

	@GetMapping("/addStudent")
	public String form() {

		return "student-form";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "student-form";

	}

	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("rollno") int rollno) {
		studentService.deleteStudent(rollno);

		return "redirect:/studentList";
	}

	@RequestMapping("/update/{rollno}")
	public String updateStudent(@PathVariable("rollno") int rollno, Model model) {

		Student student = studentService.getStudentById(rollno);
		model.addAttribute("std", student);

		return "student-edit";

	}

	@GetMapping("/reportCardSearch")
	public String searchStudent() {
		
		return "report-card";
				
	}
	
	@PostMapping("/getStudentReport")
	public String getDataForStudent(Model model,@RequestParam("rollno") int rollno) {

		List<Object[]> list = studentService.getDataForStudent(rollno);

		model.addAttribute("stdcardlist", list);

		return "student-report-card";

	}
	// Other mapping methods...
}