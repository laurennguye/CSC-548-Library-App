package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int id;
    private String title;
    private String author;
    private String isbn;
    private boolean borrowed;

    public Book() {
        this.id = count.incrementAndGet();
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    // Setters
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book ID: " + id +
               ", Title: " + title +
               ", Author: " + author +
               ", ISBN: " + isbn +
               ", Borrowed: " + (borrowed ? "Yes" : "No");
    }
}