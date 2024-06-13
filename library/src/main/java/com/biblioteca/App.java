package com.biblioteca;


import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
    User.callAddBook();
    User.callSeeAllBooks();
    User.callAllAutors();
    User.callDelete();
    }
}
