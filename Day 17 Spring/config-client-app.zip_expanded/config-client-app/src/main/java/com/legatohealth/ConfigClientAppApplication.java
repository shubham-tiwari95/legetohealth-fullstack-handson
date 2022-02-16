package com.legatohealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAppApplication.class, args);
	}

}
