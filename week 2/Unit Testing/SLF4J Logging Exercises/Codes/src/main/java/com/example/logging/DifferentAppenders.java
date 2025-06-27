package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DifferentAppenders {
    private static final Logger logger = LoggerFactory.getLogger(DifferentAppenders.class);

    public static void main(String[] args) {
        logger.debug("Debugging message");
        logger.info("Information message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
