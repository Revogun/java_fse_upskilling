package com.cognizant.springlearn.jwtdemo.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
    private static final Key SECRET_KEY = Keys.hmacShaKeyFor(
            "A1B2C3D4E5F6G7H8I9J0K1L2M3N4O5P6".getBytes());

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {
        LOGGER.info("Start");

        String username = authentication.getName();
        String token = generateJwt(username);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("End");
        return map;
    }

    private String generateJwt(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1200000)) // 20 mins
                .signWith(SECRET_KEY, SignatureAlgorithm.HS256)
                .compact();
    }
}
