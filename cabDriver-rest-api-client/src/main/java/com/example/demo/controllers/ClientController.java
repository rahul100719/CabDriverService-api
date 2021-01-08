package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ClientService;

@RestController
@CrossOrigin(origins = "*")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@GetMapping(path = "/partners")
	public String getAllPartners() {
		return this.service.getDrivers();
	}
}
