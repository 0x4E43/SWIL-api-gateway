package com.swil.apigateway.swilapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SwilApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwilApiGatewayApplication.class, args);
	}

}
