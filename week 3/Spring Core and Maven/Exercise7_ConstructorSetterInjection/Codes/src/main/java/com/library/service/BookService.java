// Placeholder for BookService.java in Exercise7_ConstructorSetterInjection
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService Constructor Called");
    }

    // Setter injection for XML config
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("BookService calling BookRepository...");
        bookRepository.fetchBooks();
    }
}
