package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Fetch BookService bean and invoke a method to confirm it's working
        BookService bookService = context.getBean(BookService.class);
        bookService.displayBooks(); // This should be a method in your BookService class

        System.out.println("Spring Core Application Loaded Successfully.");
    }
}
