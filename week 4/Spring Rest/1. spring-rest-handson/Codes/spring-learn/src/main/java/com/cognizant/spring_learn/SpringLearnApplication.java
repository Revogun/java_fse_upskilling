package com.cognizant.spring_learn;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	private static ApplicationContext context;
	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);

		displayDate();
		displayCountry();
		displayCountries();
	}
	public static void displayCountries() {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		List<Country> countries = context.getBean("countryList", List.class);

		for (Country country : countries) {
			LOGGER.debug("Country: {}", country.toString());
		}

		LOGGER.info("END");
	}


	public static void displayDate() {
		LOGGER.info("START");

		context = new ClassPathXmlApplicationContext("date-format.xml");

		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		String dateStr = "31/12/2018";

		try {
			Date date = format.parse(dateStr);
			LOGGER.debug("Parsed Date: {}", date);
		} catch (ParseException e) {
			LOGGER.error("Date parsing failed!", e);
		}

		LOGGER.info("END");
	}

	public static void displayCountry() {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country1 = context.getBean("country", Country.class);
		Country country2 = context.getBean("country", Country.class);

		LOGGER.debug("Country 1: {}", country1.toString());
		LOGGER.debug("Country 2: {}", country2.toString());

		LOGGER.info("Same object? {}", country1 == country2);

		LOGGER.info("END");
	}

}