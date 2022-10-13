package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CitizenApp;
import com.example.service.ServiceRepo;

@RestController
public class ArRestController {
	@Autowired
	private ServiceRepo serv;

	@PostMapping("/ar")
	public ResponseEntity<String> getmsg(@RequestBody CitizenApp app) {
		Integer num = serv.saveApplication(app);
		if (num > 0) {
			return new ResponseEntity<>("Application number:" + num, HttpStatus.OK);
		} else
			return new ResponseEntity<>("Invalid ssn", HttpStatus.BAD_REQUEST);
	}

}
