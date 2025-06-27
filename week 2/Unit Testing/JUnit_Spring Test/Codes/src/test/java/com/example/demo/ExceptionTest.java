package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ExceptionTest {

    @Autowired
    private UserService userService;

    @Test
    void testUserNotFoundThrows() {
        assertThrows(NoSuchElementException.class, () -> userService.getUserById(999L));
    }
}
