package com.capg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private String eligiblity;
	@ManyToOne
	@JoinColumn(name="collegeRegId")
	private College college;
	@OneToMany(mappedBy="course")
	private ArrayList<Branch> branches;
	@OneToOne(mappedBy="course")
	private ProgramSchedule programSchedule;
	@OneToOne(mappedBy="course")
	private Admission admission;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, String eligiblity, College college, ArrayList<Branch> branches) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.eligiblity = eligiblity;
		this.college = college;
		this.branches = branches;
	}
	
}
