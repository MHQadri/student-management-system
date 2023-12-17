package com.emp.Student.Management.System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emp.Student.Management.System.dto.ReportCard;
import com.emp.Student.Management.System.repository.ReportCardRepository;

@Repository
public class ReportCardDao {

	@Autowired
	private ReportCardRepository reportCardRepository;

	public ReportCard saveStudentReportCard(ReportCard reportCard) {

		return reportCardRepository.save(reportCard);

	}

	public List<ReportCard> getAllReport() {
		
		return reportCardRepository.findAll();
	}

}
