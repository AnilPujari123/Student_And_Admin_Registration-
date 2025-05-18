package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminid;
	private String adminemailid;
	private String adminpassword;
	private String  adminrole;
	
	public AdminDetails() {
		// TODO Auto-generated constructor stub
	}

	public AdminDetails(int adminid, String adminemailid, String adminpassword, String adminrole) {
		super();
		this.adminid = adminid;
		this.adminemailid = adminemailid;
		this.adminpassword = adminpassword;
		this.adminrole = adminrole;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminemailid() {
		return adminemailid;
	}

	public void setAdminemailid(String adminemailid) {
		this.adminemailid = adminemailid;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public String getAdminrole() {
		return adminrole;
	}

	public void setAdminrole(String adminrole) {
		this.adminrole = adminrole;
	}

	@Override
	public String toString() {
		return "AdminDetails [adminid=" + adminid + ", adminemailid=" + adminemailid + ", adminpassword="
				+ adminpassword + ", adminrole=" + adminrole + "]";
	}
	
	
}
