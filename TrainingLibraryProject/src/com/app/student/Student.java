package com.app.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public ArrayList<StudentSignup> a2 = null;
	public Scanner scan = new Scanner(System.in);

//sign up student
	public void registerStudent() {
		a2 = new ArrayList<StudentSignup>();
		System.out.println("Fill In Your Details ");
		System.out.println("Enter Your Name");
		String sName = scan.next();
		System.out.println("Enter Your Branch");
		String sBranch = scan.next();
		System.out.println("Enter Your Email Id");
		String sMail = scan.next();
		System.out.println("Enter Your Password");
		String sPassword = scan.next();
		System.out.println("Enter Your Mobile Number");
		double sMobile = scan.nextDouble();
		System.out.println("In which Year do you study");
		int sYear = scan.nextInt();
		StudentSignup register = new StudentSignup(sName, sBranch, sMail, sPassword, sMobile, sYear);
		a2.add(register);
		System.out.println("Successfully Registered");
	}// register a student

	// login using email,password
	@SuppressWarnings("unlikely-arg-type")
	public void verifyName(String sEmail) {
		if (a2.contains(sEmail)) {
			System.out.println("Enter Your Password");
			int sPassword = scan.nextInt();
			if (a2.contains(sPassword)) {
				System.out.println("Welcome " + sEmail);
			} else {
				System.out.println("Incorrect Password");
			}
		} // if
		else {
			System.out.println(sEmail + "Email Id is not registered with us");
		} // else
	}// method

}// close class
