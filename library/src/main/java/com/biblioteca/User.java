package com.biblioteca;

import java.util.Scanner;

public class User {
    private static void menu() {
        System.out.print("Menu ");
        System.out.print("Buscar ");
        System.out.print("Devolver ");
        System.out.print("Renovar ");
        System.out.print("Salir ");
        String opcion = scanner.nextLine();
    }

    private static void search() {
        Library.initialize();
        System.out.println("Ingrese el titulo y autor del libro");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Library.arrayLibrary.add(5,"Libro1");
        Library.saveChanges();

    }

    public static void exit() {
        menu();
        search();
        seeAllBooks();
        seeAllAutors();

    }

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

    }

}


