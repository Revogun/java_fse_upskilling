package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testHello() {
        String message = "Hello, JUnit!";
        assertEquals("Hello, JUnit!", message);
    }
}
