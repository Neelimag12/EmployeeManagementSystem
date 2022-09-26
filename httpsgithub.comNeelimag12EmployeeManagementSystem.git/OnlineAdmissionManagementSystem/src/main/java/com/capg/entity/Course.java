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
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getEligiblity() {
		return eligiblity;
	}
	public void setEligiblity(String eligiblity) {
		this.eligiblity = eligiblity;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public ArrayList<Branch> getBranches() {
		return branches;
	}
	public void setBranches(ArrayList<Branch> branches) {
		this.branches = branches;
	}
	
	

}
