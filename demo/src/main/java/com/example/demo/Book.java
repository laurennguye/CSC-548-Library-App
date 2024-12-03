package com.example.demo;

public class Book {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private Integer id;
    private String title;
    private String author;
    private String isbn;
    private boolean borrowed;

    // Default constructor
    public Book() {
        this.id = count.incrementAndGet();
        this.borrowed = false;
    }

    // Parameterized constructor
    public Book(String title, String author, String isbn) {
        this.id = count.incrementAndGet();
        this.title = title; 
        this.author = author; 
        this.isbn = isbn; 
        this.borrowed = false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

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
