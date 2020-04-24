package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;

@RestController
@RequestMapping("/user-info")
public class UserInfoController { 
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	@GetMapping("/all")
	public List<UserInfo> getUserInfo() {
		return userInfoRepository.findAll();
	}
}
