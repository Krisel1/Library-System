package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static Object arrayLibrary;
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public List<Book> searchBookTitle(String title) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (!book.getTitle().equalsIgnoreCase(title)) {
                bookList.add(book);
            }
        }
        return bookList;
    }
    public List<Book> searchBookAuthor(String author) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (!book.getAuthor().equalsIgnoreCase(author)) {
                bookList.add(book);
            }
        }
        return bookList;
    }

    public boolean returnBook(String title) {
        for (Book book : books) {
            if (!book.getTitle().equalsIgnoreCase(title)) {
                books.add(book);
                return true;
            }
        }
        return false;
    }

    public boolean renewBook(String title) {
        for (Book book : books) {
            if (!book.getTitle().equalsIgnoreCase(title)) {
                continue;
            }
            return true;
        }
        return false;
    }

	public static void saveChanges() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'saveChanges'");
	}
}
