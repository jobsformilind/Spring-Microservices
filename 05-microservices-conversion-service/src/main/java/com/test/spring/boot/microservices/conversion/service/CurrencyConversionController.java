package com.test.spring.boot.microservices.conversion.service;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/{from}/to/{to}/{amount}")
	public ConversionValue retrieveConversionValue(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal amount) {
		StringBuilder builder = new StringBuilder("http://localhost:8000/currency-exchange/");
		builder.append(from).append("/to/").append(to);

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ConversionValue> response = restTemplate.getForEntity(builder.toString(), ConversionValue.class);
		ConversionValue value = response.getBody();
		value.setAmount(amount);
		value.setCalculatedAmount(value.getAmount().multiply(value.getConversionFactor()));
		return value;
	}
}
