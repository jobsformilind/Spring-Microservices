package com.test.spring.boot.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.test.spring.boot.microservices")
@EnableDiscoveryClient
public class FeignCurrencyConversionServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignCurrencyConversionServiceApplication.class, args);
	}
}
