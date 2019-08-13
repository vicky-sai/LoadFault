package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HystrixBasedService;

@RestController
public class DriverController {

	@Autowired
	public HystrixBasedService service;
	
	@GetMapping("/driver") 
	public String findDriver() {
		
		return this.service.findDriver();
	}
}
