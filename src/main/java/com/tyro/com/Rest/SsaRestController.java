package com.tyro.com.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tyro.com.service.SsaService;

@RestController
public class SsaRestController {
	
	@Autowired
	private SsaService ssaservice;
	
	@GetMapping("/state/{ssn}")
	public ResponseEntity<String> stateName(@PathVariable String ssn){
		String stateName= ssaservice.fetchStateName(ssn);
		return new ResponseEntity<>(stateName, HttpStatus.OK);	
	}
}
