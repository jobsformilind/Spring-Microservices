package com.test.spring.boot.microservices.limits.service;

public class LimitsConfiguration {
	private String environment;
	private int minimum;
	private int maximum;

	public LimitsConfiguration() {
	}

	public LimitsConfiguration(Configuration configuration) {
		super();
		this.environment = configuration.getEnvironment();
		this.minimum = configuration.getMinimum();
		this.maximum = configuration.getMaximum();
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
