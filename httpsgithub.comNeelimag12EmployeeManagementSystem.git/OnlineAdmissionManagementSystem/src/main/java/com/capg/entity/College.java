package com.capg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collegeRegId;
	private String collegeName;
	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;
	@OneToMany(mappedBy="college")
	private ArrayList<Program> programList;
	@OneToMany(mappedBy="college")
	private ArrayList<Course> courseList;
	@OneToMany(mappedBy="college")
	private ArrayList<Branch> branchList;
	@OneToOne
	@JoinColumn(name="universityId")
	private University university;
	
	@OneToOne(mappedBy="college")
	private Admission admission;
	
	@OneToMany(mappedBy="college")
	private ProgramSchedule programScheduled;
	
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int collegeRegId, String collegeName, Address address, ArrayList<Program> programList,
			ArrayList<Course> courseList, ArrayList<Branch> branchList, University university) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
		this.address = address;
		this.programList = programList;
		this.courseList = courseList;
		this.branchList = branchList;
		this.university = university;
	}
	public int getCollegeRegId() {
		return collegeRegId;
	}
	public void setCollegeRegId(int collegeRegId) {
		this.collegeRegId = collegeRegId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Program> getProgramList() {
		return programList;
	}
	public void setProgramList(ArrayList<Program> programList) {
		this.programList = programList;
	}
	public ArrayList<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	public ArrayList<Branch> getBranchList() {
		return branchList;
	}
	public void setBranchList(ArrayList<Branch> branchList) {
		this.branchList = branchList;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	

}
