package com.cognizant.springlearn.spring_rest_handson.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Country {
    private String code;
    private String name;

    public Country() {}

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

}
