package com.cg.moviesgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MoviesGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesGatewayApplication.class, args);
	}

}
