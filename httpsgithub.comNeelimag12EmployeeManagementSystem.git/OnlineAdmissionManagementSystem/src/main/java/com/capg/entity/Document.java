package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Document {
	private int documentId;
	private String documentName;
	private String documentUrl;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationId;
	private String emailId;
	private String documentStatus;
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(int documentId, String documentName, String documentUrl, int applicationId, String emailId,
			String documentStatus) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentUrl = documentUrl;
		this.applicationId = applicationId;
		this.emailId = emailId;
		this.documentStatus = documentStatus;
	}
	
}
