package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Program {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int programId;
	private String progranName;
	private String eligibilty;
	private String duration;
	private String degreedOffered;
	@ManyToOne
	@JoinColumn(name="collegeRegId")
    private College college;
	public Program() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Program(int programId, String progranName, String eligibilty, String duration, String degreedOffered) {
		super();
		this.programId = programId;
		this.progranName = progranName;
		this.eligibilty = eligibilty;
		this.duration = duration;
		this.degreedOffered = degreedOffered;
	}
	public int getProgramId() {
		return programId;
	}
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	public String getProgranName() {
		return progranName;
	}
	public void setProgranName(String progranName) {
		this.progranName = progranName;
	}
	public String getEligibilty() {
		return eligibilty;
	}
	public void setEligibilty(String eligibilty) {
		this.eligibilty = eligibilty;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDegreedOffered() {
		return degreedOffered;
	}
	public void setDegreedOffered(String degreedOffered) {
		this.degreedOffered = degreedOffered;
	}
	

}
