package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Admission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String emailId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String applicationId;
	private String admissionStatus;
	@OneToOne
	@JoinColumn(name="collegeRegId")
	private College college;
	private Program program;
	@OneToOne
	@JoinColumn(name="courseId")
	private Course course;
	private String year;
	public Admission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admission(String emailId, String applicationId, String admissionStatus, College college, Program program,
			Course course, String year) {
		super();
		this.emailId = emailId;
		this.applicationId = applicationId;
		this.admissionStatus = admissionStatus;
		this.college = college;
		this.program = program;
		this.course = course;
		this.year = year;
	}
	
}
