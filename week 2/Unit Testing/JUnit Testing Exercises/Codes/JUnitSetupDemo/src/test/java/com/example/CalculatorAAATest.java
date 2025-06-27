package com.example;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator(); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null; // Clean up
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);
        
        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 5);
        
        // Assert
        assertEquals(5, result);
    }
}
