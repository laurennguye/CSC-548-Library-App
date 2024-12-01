package com.example.demo;

@Service
public class LibraryService {
    private final List<Book> books = new ArrayList<>();

    public List<Book> getAvailableBooks() {
        return books.stream().filter(book -> !book.isBorrowed()).collect(Collectors.toList());
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book borrowBook(Integer bookId) {
        Book book = findBookById(bookId);
        if (book != null && !book.isBorrowed()) {
            book.setBorrowed(true);
        }
        return book;
    }

    public void returnBook(Integer bookId) {
        Book book = findBookById(bookId);
        if (book != null) {
            book.setBorrowed(false);
        }
    }

    private Book findBookById(Integer bookId) {
        return books.stream().filter(book -> book.getId().equals(bookId)).findFirst().orElse(null);
    }

    // Additional helper methods as needed
}