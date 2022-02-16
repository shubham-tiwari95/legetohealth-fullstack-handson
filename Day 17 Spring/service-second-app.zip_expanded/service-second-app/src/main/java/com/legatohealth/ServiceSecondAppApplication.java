package com.legatohealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceSecondAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSecondAppApplication.class, args);
	}
	
	@Bean		//registers the RestTemplate in IoC container
	@LoadBalanced  	//uses client side load balancer to equally distribute the load
	public RestTemplate createTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
