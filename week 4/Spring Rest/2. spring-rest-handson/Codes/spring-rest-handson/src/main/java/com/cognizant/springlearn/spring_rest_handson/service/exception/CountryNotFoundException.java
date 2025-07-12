package com.cognizant.springlearn.spring_rest_handson.service.exception;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Country Not found")
public class CountryNotFoundException extends Exception {
    public CountryNotFoundException(String msg) {
        super(msg);
    }
}
