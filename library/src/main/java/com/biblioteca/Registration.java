package com.biblioteca;

import java.util.Scanner;

public class Registration {
    String user;
    String password;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the user");
    user = scanner.nextLine();

        System.out.println("Enter the password");
    password = scanner.nextLine();

        if (user != null && !user.isEmpty()) {
        System.out.println("Registered user");
    } else {
        System.out.println("You cannot create a user without a username");
    }

        if (password != null && !password.isEmpty()) {
        System.out.println("Correct password");
    } else {
        System.out.println("You cannot create a user without a password");
    }
}

