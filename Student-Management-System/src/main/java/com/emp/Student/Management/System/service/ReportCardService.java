package com.emp.Student.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Student.Management.System.dao.ReportCardDao;
import com.emp.Student.Management.System.dto.ReportCard;

@Service
public class ReportCardService {

	@Autowired
	private ReportCardDao cardDao;

	public ReportCard saveStudentReportCard(ReportCard reportCard) {

		if (reportCard != null) {
			return cardDao.saveStudentReportCard(reportCard);
		} else {
			System.out.println("Null pointer exception here");
			return null;
		}

	}

	public List<ReportCard> getAllReport() {

		return cardDao.getAllReport();
	}

}
