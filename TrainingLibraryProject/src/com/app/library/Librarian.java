package com.app.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Librarian implements LibrarianDao{
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<BookData> a1 = null;

	public void validate() {
		try {
			System.out.println("Enter Mail");
			String lMail = scan.next();
			if (lMail.equalsIgnoreCase("admin")) {
				System.out.println("Enter Password");
				int pw = scan.nextInt();
				if (pw == 123) {
					System.out.println("Welcome admin");
					System.out.println("What operation You want to perform : ");
					System.out.println("1. Add Books \n 2.View Books");
					int choice = scan.nextInt();
					switch (choice) {
					case 1:
						addBook();
						break;
						
					case 2:
						showAllBooks();
						break;
					default:
						System.out.println("Not a valid choice");
					}// switch

				} else {
					System.out.println("Incorrect Password");
				}
			} else {
				System.out.println("Cannot Login with name" + lMail);
			}
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
	}// validate

//Method to a book by librarian

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
	
	//view all Books Method
	@Override
	public List<BookData> showAllBooks() {
		BookData bd2=new BookData("Cisco","Networking","Charles",450,200);
		a1.add(bd2);
		System.out.println(a1);
		return a1;
	}
}
