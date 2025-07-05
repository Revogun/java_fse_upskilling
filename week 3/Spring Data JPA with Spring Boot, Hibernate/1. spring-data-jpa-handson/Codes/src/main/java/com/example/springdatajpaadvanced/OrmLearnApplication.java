package com.example.springdatajpaadvanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdatajpaadvanced.country.Country;
import com.example.springdatajpaadvanced.exception.CountryNotFoundException;
import com.example.springdatajpaadvanced.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testAddCountry();
        testGetCountry();
    }

    private static void testAddCountry() {
        Country country = new Country();
        country.setCode("IN");
        country.setName("India");
        countryService.addCountry(country);
    }

    private static void testGetCountry() {
        try {
            Country country = countryService.findCountryByCode("IN");
            System.out.println("Fetched Country: " + country);
        } catch (CountryNotFoundException e) {
            e.printStackTrace();
        }
    }
}
