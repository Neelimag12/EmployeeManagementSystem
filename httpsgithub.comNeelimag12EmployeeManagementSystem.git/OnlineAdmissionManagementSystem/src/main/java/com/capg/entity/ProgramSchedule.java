package com.capg.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class ProgramSchedule {
	private int scheduledId;
	private Branch branch;
	@OneToOne
	@JoinColumn(name="courseId")
	private Course course;
	private Program program;
	
	private University university;
	private LocalDate startDate;
	private LocalDate endDate;
	@ManyToOne
	@JoinColumn(name="collegeRegId")
	private College college;
	
	@PrePersist
	public void startDate() {
		startDate=LocalDate.now();
	}
	@PrePersist
	public void endDate() {
		endDate=LocalDate.now();
	}
	public ProgramSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProgramSchedule(int scheduledId, Branch branch, Course course, Program program, College college,
			University university, LocalDate startDate, LocalDate endDate) {
		super();
		this.scheduledId = scheduledId;
		this.branch = branch;
		this.course = course;
		this.program = program;
		this.college = college;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
