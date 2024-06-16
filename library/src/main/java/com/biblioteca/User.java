package com.biblioteca;

import java.util.List;
import java.util.Scanner;

public class User {
    private Library mylibrary;
    private Scanner entrance;

    public User(Library mylibrary) {
        this.entrance = new Scanner(System.in);
        this.mylibrary = mylibrary;
    }

    public void searchBookTitle() {
        System.out.print("Enter the title of the book: ");
        String title = entrance.nextLine();
        List<Book> bookList = mylibrary.searchBookTitle(title);
        if (bookList.isEmpty()) {
            System.out.println("The book does not exist.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    public void searchBookAuthor() {
        System.out.print("Enter the author of the book: ");
        String author = entrance.nextLine();
        List<Book> booksfound = mylibrary.searchBookAuthor(author);
        if (booksfound.isEmpty()) {
            System.out.println("The book does not exist.");
        } else {
            for (Book book : booksfound) {
                System.out.println(book);
            }
        }
    }

    public void returnBook() {
        System.out.println("Enter the title of the book to be returned: ");
        String title = entrance.nextLine();
        if (mylibrary.returnBook(title)) {
            System.out.println("Book Successfully Returned");
        } else {
            System.out.println("The book could not be returned");
        }
    }

    public void renewBook() {
        System.out.println("Enter the title of the book to be renewed: ");
        String title = entrance.nextLine();
        if (mylibrary.renewBook(title)) {
            System.out.println("Successfully renovated book");
        } else {
            System.out.println("The book could not be renewed");
        }
    }

    public void exit() {
        System.out.println("Exit the system. ¡See you later!");
        entrance.close();
    }
}