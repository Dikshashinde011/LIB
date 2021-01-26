package com.app.student;

/**
 * @author Lenovo
 *
 */
//Encapsulated student class for sign up
public class StudentSignup {
	private String sName, sBranch, sEmail, sPassword;
	private double sMobile;
	private int sYear;

	public StudentSignup(String sName, String sBranch, String sEmail, String sPassword, double sMobile, int sYear) {
		super();
		this.sName = sName;
		this.sBranch = sBranch;
		this.sEmail = sEmail;
		this.sPassword = sPassword;
		this.sMobile = sMobile;
		this.sYear = sYear;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsBranch() {
		return sBranch;
	}

	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public double getsMobile() {
		return sMobile;
	}

	public void setsMobile(double sMobile) {
		this.sMobile = sMobile;
	}

	public int getsYear() {
		return sYear;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}

	@Override
	public String toString() {
		return "Student Details [Name=" + sName + ", Branch=" + sBranch + "," + " Email Id=" + sEmail + ","
				+ ", Mobile=" + sMobile + ", Year=" + sYear + "]";
	}

}
