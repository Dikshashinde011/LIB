package com.app.library;

public class BookData {
	public String bName, bSubject, bAuthor;
	public float bPrice;
	public int pageNo;

	// Constructor
	public BookData(String bName, String bSubject, String bAuthor, float bPrice, int pageNo) {
		super();
		this.bName = bName;
		this.bSubject = bSubject;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
		this.pageNo = pageNo;
	}

	@Override
	public String toString() {
		return "Book Name =" + bName + ", Subject =" + bSubject + ",  Author=" + bAuthor + ", Price="
				+ bPrice + ", Pages=" + pageNo + " ";
	}


}
