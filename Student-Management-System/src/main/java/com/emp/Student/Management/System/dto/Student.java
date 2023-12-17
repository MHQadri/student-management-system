package com.emp.Student.Management.System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	
	@Id
    private int rollno;
    private String name;
    private String fname;
    private String mname;
    private long phone;
    private String gender;
    private String dob;
    private String address;
   
    
  
    
}
