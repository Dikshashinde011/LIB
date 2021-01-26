package com.app.library;

import java.util.Scanner;

public class Student {
	public Scanner scan=new Scanner(System.in);
	public void verifyName(String sName) {
		if (sName.equalsIgnoreCase("diksha") || sName.equalsIgnoreCase("Shiksa")) {
			System.out.println("Enter Your Password");
			int pwd = scan.nextInt();
			if(pwd==123){
				System.out.println("Welcome " + sName);
				System.out.println("Book Details");
			}
		} // if
		else{
			System.out.println(sName+" name not availble");
		}
	}

	
}
