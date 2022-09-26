
	package com.capg.entity;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor

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
		
	}



