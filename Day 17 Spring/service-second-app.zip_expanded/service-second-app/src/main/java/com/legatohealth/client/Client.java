package com.legatohealth.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FIRSTAPP/myfirstapp")
public interface Client {
	
	//calling the method that has @GetMapping in FIRSTAPP/myfirstapp
	@GetMapping
	public String invokeFirstApp();

}
