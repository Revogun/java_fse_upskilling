package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedCalculatorTest {

    CalculatorService service = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "3, 4, 7",
        "-1, 1, 0",
        "10, 15, 25"
    })
    void testAdd(int a, int b, int expected) {
        assertEquals(expected, service.add(a, b));
    }
}
