package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tag;
import com.example.demo.repository.TopicRepository;
import com.example.demo.request.AddTopicRequest;

@Service
public class TagService {
	
	@Autowired 
	TopicRepository topicRepository;
	
	public ResponseEntity<String> addNewTag(AddTopicRequest addTopicRequest) {
		Tag topic=new Tag();
		topic.setTopicName(addTopicRequest.getTopicName());
		topic.setParentTopicName(addTopicRequest.getParentTopicName());
		topicRepository.save(topic);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}
	
	public List<Tag>  fetchAllTags(){
		return topicRepository.findAll();
	}
}
