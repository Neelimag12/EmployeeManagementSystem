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
	private int applicationId;
	private String applicantFullName;
	private LocalDate dateOfBirth;
	private String highestQualification;
	private double finalYearPercentage;
	private String goals;
	private String emailId;
	private ProgramSchedule schedule;
	private String applicationStatus;
	private LocalDate dateOfinterview;
	private String applicantInterviewFeedback;
	@OneToOne
	@JoinColumn(name="paymentId")
	private Payment payment;
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application(int applicationId, String applicantFullName, LocalDate dateOfBirth, String highestQualification,
			double finalYearPercentage, String goals, String emailId, ProgramSchedule schedule,
			String applicationStatus, LocalDate dateOfinterview, String applicantInterviewFeedback) {
		super();
		this.applicationId = applicationId;
		this.applicantFullName = applicantFullName;
		this.dateOfBirth = dateOfBirth;
		this.highestQualification = highestQualification;
		this.finalYearPercentage = finalYearPercentage;
		this.goals = goals;
		this.emailId = emailId;
		this.schedule = schedule;
		this.applicationStatus = applicationStatus;
		this.dateOfinterview = dateOfinterview;
		this.applicantInterviewFeedback = applicantInterviewFeedback;
	}
	
}
