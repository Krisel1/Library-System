package com.biblioteca;

import java.util.Scanner;

public class User {
    private static void seeAllBooks() {
        Library.initialize();
        System.out.println("Here all books");
        int countText =1;
        for (int arrayPosition = 0; arrayPosition < Library.arrayLibrary.size(); arrayPosition +=2) {
            System.out.println(countText + ") " + Library.arrayLibrary.get(arrayPosition));
            countText++;
        }
    }
    public static void callSeeAllBooks() {
        seeAllBooks();
    }

    private static void seeAllAutors() {
        Library.initialize();
        System.out.println("Here all autors");
        int countText =1;
        for (int arrayPosition = 1; arrayPosition < Library.arrayLibrary.size(); arrayPosition +=2) {
            System.out.println(countText + ") " + Library.arrayLibrary.get(arrayPosition));
            countText++;
        }
    }
    public static void callAllAutors() {
        seeAllAutors();
    }

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
