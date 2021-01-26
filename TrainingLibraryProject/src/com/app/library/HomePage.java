package com.app.library;

import java.util.Scanner;

public class HomePage {
	public static void main(String[] args) {
		System.out.println("...Welcome to New Vision Library...");
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("You want to login as :");
			System.out.println("1.Librarian\n 2.Student");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				Librarian lb = new Librarian();
				lb.validate();
				break;
			case 2:
				Student sd = new Student();
				System.out.println("Enter Your Name");
				String sName=scan.next();
				sd.verifyName(sName);
				break;
			default:
				System.out.println("Not Available");
			}// switch
		} // try
	}// main
}
