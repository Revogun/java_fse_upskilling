package com.cognizant.springlearn.spring_rest_handson.controller;

import com.cognizant.springlearn.spring_rest_handson.model.Country;
import com.cognizant.springlearn.spring_rest_handson.service.CountryService;
import com.cognizant.springlearn.spring_rest_handson.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    // /country → return India
    @GetMapping("/country")
    public Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        return (Country) context.getBean("in");
    }

    // /countries → return all
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        return (List<Country>) context.getBean("countryList");
    }

    // /countries/{code} → get by code
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        return countryService.getCountry(code);
    }
}

