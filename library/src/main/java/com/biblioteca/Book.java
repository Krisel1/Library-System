package com.biblioteca;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String toString() {
        return title + " by " + author;
    }

}
