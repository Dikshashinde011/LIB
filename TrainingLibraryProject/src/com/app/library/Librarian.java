package com.app.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Librarian {
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<BookData> a1 = null;

	public void validate() {
		try {
			System.out.println("Enter Name");
			String nm = scan.next();
			if (nm.equalsIgnoreCase("admin")) {
				System.out.println("Enter Password");
				int pw = scan.nextInt();
				if (pw == 123) {
					System.out.println("Welcome admin");
					System.out.println("What operation You want to perform : ");
					addBook();
				} else {
					System.out.println("Incorrect Password");
				}
			} else {
				System.out.println("Cannot Login with name" + nm);
			}
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
	}// validate

	public void addBook() {
		System.out.println("How many Books you want to add: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			a1 = new ArrayList<BookData>(n);
			System.out.println("Enter " + i + " Book Name");
			String bName = scan.next();
			System.out.println("Enter " + i + " Book Subject");
			String bSubject = scan.next();
			System.out.println("Enter " + i + "  Book Author");
			String bAuthor = scan.next();
			System.out.println("Enter  " + i + " Book Price");
			float bPrice = scan.nextFloat();
			System.out.println("Enter " + i + "  Book Pages");
			int pageNo = scan.nextInt();
			BookData bd1 = new BookData(bName, bSubject, bAuthor, bPrice, pageNo);
			a1.add(bd1);
			System.out.println("Successfully  Book Added " + i);

		} // for

	}// addbook

	public void showAllBook() {
		for (int i = 1; i <= a1.size(); i++) {
			System.out.println(a1.get(i));
		} // for
	}// show AllBook*/
}
