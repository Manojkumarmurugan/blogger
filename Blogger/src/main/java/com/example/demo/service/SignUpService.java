package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dataclass.LoginCredentials;
import com.example.demo.entity.UserCredentials;
import com.example.demo.repository.UserCredentialsRepository;

@Service
public class SignUpService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserCredentialsRepository userCredentialsRepository;
	
	public String signUpUser(LoginCredentials loginCredentials){
		UserCredentials userCredentials=new UserCredentials();
		userCredentials.setUsername(loginCredentials.getUsername());
		userCredentials.setUserPassword(passwordEncoder.encode(loginCredentials.getPassword()));
		userCredentialsRepository.save(userCredentials);
		return "success";
	}
}
