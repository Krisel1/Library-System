package com.biblioteca;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
    Admin.callAddBook();
    Admin.callAllAutors();
    Admin.callDelete();
    
    }
}
