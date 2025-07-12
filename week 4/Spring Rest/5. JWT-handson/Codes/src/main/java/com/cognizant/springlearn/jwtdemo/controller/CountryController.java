package com.cognizant.springlearn.jwtdemo.controller;

import com.cognizant.springlearn.jwtdemo.model.Country;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {


    @PreAuthorize("hasRole('USER')")
    @GetMapping
    public List<Country> getAllCountries() {
        return Arrays.asList(
                new Country("IN", "India"),
                new Country("US", "United States"),
                new Country("UK", "United Kingdom")
        );
    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        System.out.println("Country deleted: " + code);
    }
}
