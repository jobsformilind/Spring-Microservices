package com.test.spring.boot.microservices.conversion.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.spring.boot.microservices.conversion.service.ConversionValue;

//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
@FeignClient(name = "currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/{from}/to/{to}")
	public ConversionValue retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
