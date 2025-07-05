
package com.example.springdatajpaadvanced.repository;

import com.example.springdatajpaadvanced.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String name);
    List<Country> findByNameStartingWithIgnoreCase(String prefix);
}
