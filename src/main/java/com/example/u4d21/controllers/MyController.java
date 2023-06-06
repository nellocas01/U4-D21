package com.example.u4d21.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.u4d21.exceptions.UnsupportedLanguageException;
import com.example.u4d21.services.MyServices;

@RestController
@RequestMapping("/u4-d21")
public class MyController {
	@Autowired
	MyServices myServices;

	@GetMapping(value = "/regolePrenotazione", produces = MediaType.TEXT_PLAIN_VALUE)
	@RequestMapping(headers = "Accept-Language")
	public Prenotazione geteffettuaPrenotazione(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String language) {
			return 
		
	}

}
