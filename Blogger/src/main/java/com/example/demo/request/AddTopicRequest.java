package com.example.demo.request;

import lombok.Data;

@Data
public class AddTopicRequest {
	private String topicName;
	private String parentTopicName;
}
