package com.biblioteca;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static ArrayList<String> arrayLibrary = new ArrayList<>();

    private static boolean isExistsLibrary() {
        File libraryFile = new File("Date_of_books.txt");
        return libraryFile.exists();
    }

    private static void createLibrary() {
        try {
            FileWriter paper = new FileWriter("Date_of_books.txt");
            paper.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    private static void addArray() {
        arrayLibrary.clear();
        try {
            FileReader read = new FileReader("Date_of_books.txt");
            Scanner arrayAdd = new Scanner(read);
            while (arrayAdd.hasNextLine()) {
                arrayLibrary.add(arrayAdd.nextLine());
            }
        } catch (FileNotFoundException Exception) {
            Exception.printStackTrace();
        }
    }

    private static void clearLibrary() {
        try {
            PrintWriter writer = new PrintWriter("Date_of_books.txt");
            writer.print("");
            writer.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    private static void addLibrary() {
        int arrayPosition = 0;
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("Date_of_books.txt", true));
            while (arrayLibrary.size() > arrayPosition) {
                writer.println(arrayLibrary.get(arrayPosition));
                arrayPosition++;
            }
            writer.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
    }


    public static void initialize() {
        if (!isExistsLibrary()) {
            createLibrary();
        }
        addArray();
    }

    public static void saveChanges() {
        clearLibrary();
        addLibrary();
    }
}
