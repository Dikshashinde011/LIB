package com.app.book;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;

import com.app.library.BookData;


//abstract methods
public interface SearchABook {
	// public List<Book> searchByName(String name);
	public List<BookData> findBooksByCategory(String cond);
}

class BookStoreImpl implements SearchABook {

	@Override
	public List<BookData> findBooksByCategory(String cond) {
		List<BookData> listBO=null;
		   BookData bookDataobj=null;
		return null;
	}
	

}