package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    private final List<Book> books = new ArrayList<>();

    public LibraryService() {
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        books.add(new Book("1984", "George Orwell", "9780451524935"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467"));
    }

    public List<Book> getAvailableBooks() {
        return books.stream().filter(book -> !book.isBorrowed()).collect(Collectors.toList());
    }

    // Updated to deal with duplicate books
    public void addBook(Book book) {
        if (books.stream().noneMatch(b -> b.getTitle().equalsIgnoreCase(book.getTitle()) 
                                           && b.getAuthor().equalsIgnoreCase(book.getAuthor()))) {
            books.add(book);
        }
    }
    
    // Updated to handle non-existent ids
    public Book borrowBook(Integer bookId) {
        Book book = findBookById(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book with ID " + bookId + " does not exist.");
        }
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
        }
        return book;
    }

    // Updated to handle non-existent ids
    public void returnBook(Integer bookId) {
        Book book = findBookById(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book with ID " + bookId + " does not exist.");
        }
        book.setBorrowed(false);
    }

    private Book findBookById(Integer bookId) {
        return books.stream()
                    .filter(book -> book.getId() == bookId)
                    .findFirst()
                    .orElse(null);
    }
    

    // Additional helper methods as needed
}