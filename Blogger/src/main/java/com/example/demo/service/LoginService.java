package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dataclass.LoginCredentials;
import com.example.demo.entity.UserCredentials;
import com.example.demo.repository.UserCredentialsRepository;

@Service
public class LoginService {
	@Autowired
	UserCredentialsRepository userCredentialsRepository;
	
	public boolean validateUser(LoginCredentials loginCredentials){
		Optional<UserCredentials> currentUserCredentials=userCredentialsRepository.findByUsername(loginCredentials.getUsername());
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		boolean authenticatedUser=false;
		if(currentUserCredentials.isPresent()) {
//			authenticatedUser=bCryptPasswordEncoder.encode(loginCredentials.getPassword()).equals(currentUserCredentials.get().getUserPassword());
			authenticatedUser=BCrypt.checkpw(loginCredentials.getPassword(), currentUserCredentials.get().getUserPassword());
		}
		return authenticatedUser;
	}
}
