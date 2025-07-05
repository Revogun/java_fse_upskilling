// Placeholder for BookService.java in Exercise6_AnnotationConfig
package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void displayBooks() {
        System.out.println("BookService using @Autowired BookRepository...");
        bookRepository.fetchBooks();
    }
}
