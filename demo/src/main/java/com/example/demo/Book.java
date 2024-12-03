package com.example.demo;

public class Book {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private Integer id;
    private String title;
    private String author;
    private String isbn;
    private boolean borrowed;

    public Book() {
        this.id = count.incrementAndGet();
    }

    // Getters and setter
    public Integer getId() {
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
}