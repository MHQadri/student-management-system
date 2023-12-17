package com.emp.Student.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.emp.Student.Management.System.dto.ReportCard;
import com.emp.Student.Management.System.service.ReportCardService;

@Controller
public class ReportCardController {
	
	@Autowired
	private ReportCardService service;
	
	@GetMapping("/addStudentResult")
	public String reportCard() {
		
		return "add-report-card";
	}
	
	@PostMapping("/addReportCard")
	public String saveStudentReportCard(@ModelAttribute ReportCard reportCard) {
		
		 service.saveStudentReportCard(reportCard);
		 
		 return "index";
	}
	
	@GetMapping("/allStudentResult")
	public String getAllReport(Model model) {
		
		List<ReportCard> list=service.getAllReport();
		model.addAttribute("report",list);
		
		return "result-list";
		
	}

}
