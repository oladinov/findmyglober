package com.findmyglober.vo;

public class GloberVO {

	private Integer globerId;
	private String firstName;
	private String secondName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String mail;
	private String projectName;
	private String quadrant;
	private String picPath;
	
	public String getQuadrant() {
		return quadrant;
	}
	public void setQuadrant(String quadrant) {
		this.quadrant = quadrant;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
	public Integer getGloberId() {
		return globerId;
	}
	public void setGloberId(Integer globerId) {
		this.globerId = globerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}


