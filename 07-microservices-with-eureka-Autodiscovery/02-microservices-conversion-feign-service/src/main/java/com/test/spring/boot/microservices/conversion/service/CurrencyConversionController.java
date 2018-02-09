package com.test.spring.boot.microservices.conversion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.boot.microservices.conversion.feign.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy proxy;

	@GetMapping("/currency-converter/{from}/to/{to}/{amount}")
	public ConversionValue retrieveConversionValue(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal amount) {

		ConversionValue value = proxy.retrieveExchangeValue(from, to);
		value.setAmount(amount);
		value.setCalculatedAmount(value.getAmount().multiply(value.getConversionFactor()));
		return value;
	}
}
