package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tag;
import com.example.demo.repository.TopicRepository;

@Service
public class FeedService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Tag> getFeed() {
		return topicRepository.findAll();
	}
}
