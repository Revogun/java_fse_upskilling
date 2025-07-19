package com.example.paymentservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

@RestController
@RequestMapping("/payment")
class PaymentController {

	private final RestTemplate restTemplate;

	public PaymentController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping("/process")
	@CircuitBreaker(name = "paymentCB", fallbackMethod = "fallbackResponse")
	public ResponseEntity<String> makePayment() {
		String slowApi = "https://httpbin.org/delay/5"; // Simulates slow response
		String response = restTemplate.getForObject(slowApi, String.class);
		return ResponseEntity.ok("Payment processed: " + response);
	}

	public ResponseEntity<String> fallbackResponse(Throwable t) {
		System.out.println("Fallback called due to: " + t.getMessage());
		return ResponseEntity.ok("Fallback: Payment service is currently unavailable. Please try again later.");
	}
}

