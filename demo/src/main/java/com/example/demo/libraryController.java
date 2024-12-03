package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/library")
public class libraryController {

    private final LibraryService libraryService;

    @Autowired
    public libraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", libraryService.getAvailableBooks());
        model.addAttribute("newBook", new Book());
        return "library";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute Book newBook) {
        libraryService.addBook(newBook);
        return "redirect:/library";
    }

    // Borrow a book
    @GetMapping("/borrow")
    public String showAvailableBooks(Model model) {
        model.addAttribute("availableBooks", libraryService.getAvailableBooks());
        return "borrow"; // Refers to borrow.html
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam Integer bookId) {
        libraryService.borrowBook(bookId);
        return "redirect:/library/borrow";
    }

    // Return a book
    @GetMapping("/return")
    public String showBorrowedBooks(Model model) {
        model.addAttribute("borrowedBooks", libraryService.getBorrowedBooks());
        return "return"; // Refers to return.html
    }
    
    @PostMapping("/return")
    public String returnBook(@RequestParam Integer bookId) {
        libraryService.returnBook(bookId);
        return "redirect:/library/return"; 
    }
}
