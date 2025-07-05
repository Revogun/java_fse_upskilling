
package com.example.springdatajpaadvanced.service;

import com.example.springdatajpaadvanced.country.Country;
import com.example.springdatajpaadvanced.exception.CountryNotFoundException;
import com.example.springdatajpaadvanced.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String code) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(code);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found with code: " + code);
        }
        return result.get();
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(String code, String newName) throws CountryNotFoundException {
        Country country = findCountryByCode(code);
        country.setName(newName);
        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    @Transactional
    public List<Country> searchByName(String keyword) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc(keyword);
    }

    @Transactional
    public List<Country> getCountriesStartingWith(String prefix) {
        return countryRepository.findByNameStartingWithIgnoreCase(prefix);
    }
}
