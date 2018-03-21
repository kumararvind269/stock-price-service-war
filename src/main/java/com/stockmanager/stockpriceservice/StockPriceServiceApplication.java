package com.stockmanager.stockpriceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class StockPriceServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(StockPriceServiceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(StockPriceServiceApplication.class);
	}
	
}
