package com.springrest.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringrestExternalAPI {
	
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();		
	}
	
	private static final Logger log = LoggerFactory.getLogger(SpringrestExternalAPI.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringrestExternalAPI.class, args);
	}

}
