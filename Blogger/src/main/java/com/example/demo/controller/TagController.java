package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tag;
import com.example.demo.request.AddTopicRequest;
import com.example.demo.service.TagService;

@RestController
@RequestMapping("/api")
public class TagController {
	
	@Autowired
	TagService tagService;
	
	@PostMapping("/add-tag")
	public ResponseEntity<String> addNewTag(@RequestBody AddTopicRequest addTopicRequest) {
		return tagService.addNewTag(addTopicRequest);
	}
	
	@GetMapping("/tags")
	public List<Tag> fetchAllTags(){
		return tagService.fetchAllTags();
	}
}
