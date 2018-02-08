package com.test.spring.boot.microservices.limit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

	@GetMapping("/limits")
	public LimitConfiguration getConfiguration() {
		return new LimitConfiguration(1, 9999);
	}
}
