package com.test.spring.boot.microservices.exchange.service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
	ExchangeValue findByFromAndTo(String from, String to);
}
