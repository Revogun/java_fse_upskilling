package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepo = mock(UserRepository.class);
        UserService userService = new UserService();
        User user = new User(1L, "Alice");

        // Inject mock
        java.lang.reflect.Field field;
        try {
            field = UserService.class.getDeclaredField("userRepository");
            field.setAccessible(true);
            field.set(userService, mockRepo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        when(mockRepo.findById(1L)).thenReturn(Optional.of(user));
        assertEquals("Alice", userService.getUserById(1L).getName());
    }
}
