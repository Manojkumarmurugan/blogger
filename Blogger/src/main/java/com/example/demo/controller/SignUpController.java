package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dataclass.LoginCredentials;
import com.example.demo.service.SignUpService;

@RestController
@RequestMapping("/api/sign-up")
public class SignUpController {
	
	@Autowired
	SignUpService signUpService;
	
	@PostMapping()
	public ResponseEntity<String> signUp(@RequestBody LoginCredentials loginCredentials){
		final String response=signUpService.signUpUser(loginCredentials);
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
}
