package com.cognizant.springlearn.spring_rest_handson;



import com.cognizant.springlearn.spring_rest_handson.controller.CountryController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringRestHandsonApplicationTests {

	@Autowired
	private CountryController countryController;

	@Autowired
	private MockMvc mvc;

	// Verify context loads and controller is autowired
	@Test
	public void contextLoads() {
		assertNotNull(countryController);
	}

	// Test /country endpoint
	@Test
	public void testGetCountry() throws Exception {
		ResultActions actions = mvc.perform(get("/country"));
		actions.andExpect(status().isOk());
		actions.andExpect(jsonPath("$.code").value("IN"));
		actions.andExpect(jsonPath("$.name").value("India"));
	}

	// Test /countries/{code} for a valid country
	@Test
	public void testGetCountryByCode() throws Exception {
		ResultActions actions = mvc.perform(get("/countries/IN"));
		actions.andExpect(status().isOk());
		actions.andExpect(jsonPath("$.code").value("IN"));
		actions.andExpect(jsonPath("$.name").value("India"));
	}

	// Test /countries/{code} for an invalid country (error scenario)
	@Test
	public void testGetCountryException() throws Exception {
		mvc.perform(get("/countries/ZZ"))
				.andExpect(status().isNotFound())
				.andExpect(status().reason("Country Not found"));
	}
}

