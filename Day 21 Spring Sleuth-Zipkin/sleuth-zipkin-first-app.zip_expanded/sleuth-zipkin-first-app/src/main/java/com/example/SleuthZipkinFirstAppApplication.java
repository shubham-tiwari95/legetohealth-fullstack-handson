package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SleuthZipkinFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinFirstAppApplication.class, args);
	}

}
