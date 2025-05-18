package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String sname;
	private String semailid;
	private long smobile;
	private String sgender;
	private String stream;
	private double spercentage;
	private String spassword;
	
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDetails(String sname, String semailid, long smobile, String sgender, String stream,
			double spercentage, String spassword) {
		
		this.sname = sname;
		this.semailid = semailid;
		this.smobile = smobile;
		this.sgender = sgender;
		this.stream = stream;
		this.spercentage = spercentage;
		this.spassword = spassword;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemailid() {
		return semailid;
	}

	public void setSemailid(String semailid) {
		this.semailid = semailid;
	}

	public long getSmobile() {
		return smobile;
	}

	public void setSmobile(long smobile) {
		this.smobile = smobile;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public double getSpercentage() {
		return spercentage;
	}

	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	@Override
	public String toString() {
		return "StudentDetails [sname=" + sname + ", semailid=" + semailid + ", smobile=" + smobile + ", sgender="
				+ sgender + ", stream=" + stream + ", spercentage=" + spercentage + ", spassword=" + spassword + "]";
	}
	
	
	
	
}
