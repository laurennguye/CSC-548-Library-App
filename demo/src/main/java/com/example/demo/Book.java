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

    // Getters and setters
}