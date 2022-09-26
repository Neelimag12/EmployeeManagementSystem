package com.capg.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capg.dto.ApplicationDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Applicatin_tbl")

public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="application_id")
	private Integer app_Id;

	
	@Column(name="applicant_Fullname")
	private String appfullName;
	
	

	@Column(name="date_Of_Birth")
	private LocalDate dob;
	

	@Column(name="highest_Qualification")
	private String highQualification;
	
	@Column(name="finalyear_Percentage")
	private double finYrPercentage;
	
	@Column(name="Goals")
	private String goals;
	
	@Column(name="email_Id")
	private String email_Id;
	
	
	@Column(name="schedule")
	private ProgramScheduled schedule;

	@Column(name="application_Status")
	private String appStatus;
	
	@Column(name="date of_Interview")
	private LocalDate dateOfInterview;
	
	@Column(name="Applicant_interviewer_feedback")
	private String feedback;
	

	


}
