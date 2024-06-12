package com.biblioteca;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static ArrayList<String> array = new ArrayList<>();

    private static void createLibrary() {
        try {
            FileWriter paper = new FileWriter("Date_of_books.txt", true);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    private static void fillLibrary() {
        int arrayPosition = 0;
        try {
            PrintWriter writer = new PrintWriter("Date_of_books.txt");
            while (array.size() > arrayPosition) {
                writer.println(array.get(arrayPosition));
                arrayPosition++;
            }
            writer.close();
        } catch(Exception error){
            error.printStackTrace();
        }
    }

    private static void fillArray() {
        array.clear();
        try {
            FileReader read = new FileReader("Date_of_books.txt");
            Scanner arrayAdd = new Scanner(read);
            while (arrayAdd.hasNextLine()) {
                array.add(arrayAdd.nextLine());
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

    public static void callCreateLibrary() {
        createLibrary();
    }

    public static void callFillLibrary() {
        fillLibrary();
    }

    public static void callFillArray() {
        fillArray();
    }

    public static void callClearLibrary() {
        clearLibrary();
    }
}
