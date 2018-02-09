package com.test.spring.boot.microservices.conversion.service;

import java.math.BigDecimal;

public class ConversionValue {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private BigDecimal amount;
	private BigDecimal calculatedAmount;
	private int port;

	public ConversionValue() {
	}

	public ConversionValue(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal amount,
			BigDecimal calculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.amount = amount;
		this.calculatedAmount = calculatedAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
