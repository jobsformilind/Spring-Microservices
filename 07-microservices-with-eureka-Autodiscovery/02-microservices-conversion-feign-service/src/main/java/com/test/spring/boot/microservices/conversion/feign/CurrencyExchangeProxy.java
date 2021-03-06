package com.test.spring.boot.microservices.conversion.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.spring.boot.microservices.conversion.service.ConversionValue;

//@FeignClient(name = "currency-exchange-service")
@FeignClient(name = "zuul-api-gateway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {

	//@GetMapping("/currency-exchange/{from}/to/{to}")
	@GetMapping("/currency-conversion-service/currency-exchange/{from}/to/{to}")
	public ConversionValue retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
