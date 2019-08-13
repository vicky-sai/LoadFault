package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerDriverController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping("/findDriver")
	public String getDriverdetails() {
		return template.getForObject("http://call-driver-provider/drivers", String.class);
	}
}
