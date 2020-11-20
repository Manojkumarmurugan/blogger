package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tag;
import com.example.demo.service.FeedService;

@RestController
@RequestMapping("/api/feed")
@CrossOrigin
public class FeedController {
	
	@Autowired
	private FeedService feedService;
	
	@GetMapping()
	public Tag showFeed() {
		return feedService.getFeed().get(0);
	}
}
