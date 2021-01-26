package com.app.library;

import java.util.Scanner;

import com.app.student.Student;

public class HomePage {
	public static void main(String[] args) {
		System.out.println("...Welcome to Library...");
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("You want to \n1.login \n 2.signUp :");
			int choice1 = scan.nextInt();
			switch (choice1) {
			
			case 1:
				System.out.println("Login as \n1. Student \n 2. Librarian");
				int choice2=scan.nextInt();
				if(choice2==1) {
				Student student1 = new Student();
				System.out.println("Enter Your Email");
				String sEmail = scan.next();
				student1.verifyName(sEmail);
				}//if
				else {
					Librarian lb=new Librarian();
					lb.validate();
				}
				break;
			case 2:
				Student student2 = new Student();
				student2.registerStudent();
				break;
			default:
				System.out.println("Not Available");

			}// switch

		} // try
	}// main
}
