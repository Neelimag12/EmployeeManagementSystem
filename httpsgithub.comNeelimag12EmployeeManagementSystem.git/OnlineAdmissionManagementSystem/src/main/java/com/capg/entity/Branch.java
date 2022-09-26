
	package com.capg.entity;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table
	public class Branch {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int branchId;
		private String branchName;
		private String branchDescription;
		
		@ManyToOne
		@JoinColumn(name="courseId")
		private Course course;
		
	    @ManyToOne
	    @JoinColumn(name="collegeRegId")
	    private College college;
	    
		public Branch() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Branch(int branchId, String branchName, String branchDescription) {
			super();
			this.branchId = branchId;
			this.branchName = branchName;
			this.branchDescription = branchDescription;
		}
		public int getBranchId() {
			return branchId;
		}
		public void setBranchId(int branchId) {
			this.branchId = branchId;
		}
		public String getBranchName() {
			return branchName;
		}
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		public String getBranchDescription() {
			return branchDescription;
		}
		public void setBranchDescription(String branchDescription) {
			this.branchDescription = branchDescription;
		}
		

	}



