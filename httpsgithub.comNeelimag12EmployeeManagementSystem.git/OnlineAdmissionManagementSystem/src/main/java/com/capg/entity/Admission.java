package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	


}
