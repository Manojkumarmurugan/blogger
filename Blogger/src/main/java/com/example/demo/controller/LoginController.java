package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dataclass.LoginCredentials;
import com.example.demo.exception.UnAuthorisedUserException;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping("user")
	public ResponseEntity<String> login(@RequestBody @Valid LoginCredentials loginCredentials)throws UnAuthorisedUserException {
		if(loginService.validateUser(loginCredentials)) {
			return new ResponseEntity<>("User Authorized",HttpStatus.OK);
		}
		return new ResponseEntity<>("Invalid credentials",HttpStatus.BAD_REQUEST);
	}
}
