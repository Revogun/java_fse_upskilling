package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testUserPersistence() {
        User user = new User(3L, "Dave");
        userRepository.save(user);
        User retrieved = userRepository.findById(3L).orElse(null);
        assertNotNull(retrieved);
        assertEquals("Dave", retrieved.getName());
    }
}
