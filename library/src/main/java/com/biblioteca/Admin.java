package com.biblioteca;

import java.util.Scanner;

public class Admin {
    private static void addBook() {
        Library.initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name of book");
        String input = scanner.nextLine();
        Library.arrayLibrary.add(input);
        System.out.println("Write your autor");
        input = scanner.nextLine();
        Library.arrayLibrary.add(input);
        Library.saveChanges();
    }
    public static void callAddBook() {
        addBook();
    }

    private static void delete() {
        Library.initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write what book do you want to delete ");
        String input = scanner.nextLine();
        int inputInt = Integer.parseInt(input);
        Library.arrayLibrary.remove(inputInt -1);
        Library.arrayLibrary.remove(inputInt -1);
        Library.saveChanges();
    }
    public static void callDelete() {
        delete();
    }
}
