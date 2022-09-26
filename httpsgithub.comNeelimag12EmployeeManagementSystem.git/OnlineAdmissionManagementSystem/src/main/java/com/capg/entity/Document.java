package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	public int getDocumentId() {
		return documentId;
	}
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentUrl() {
		return documentUrl;
	}
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDocumentStatus() {
		return documentStatus;
	}
	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}
	

}
