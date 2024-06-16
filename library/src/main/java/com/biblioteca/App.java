package com.biblioteca;


public class App {
    public static void main(String[] args) {
        Library mylibrary = new Library();
        User user = new User(mylibrary);

        user.searchBookTitle();
        user.searchBookAuthor();
        user.returnBook();
        user.renewBook();
        user.exit();
    }
}





