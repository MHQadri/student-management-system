package com.emp.Student.Management.System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReportCard {
	
	@Id
	private int rollno;
	private int english;
	private int hindi;
	private int maths;
	private int physics;
	private int chemistry; 

}
