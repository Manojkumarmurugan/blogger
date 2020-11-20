package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="user_cred")
public class UserCredentials {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	private String username;
	private String userPassword;
	private String salt;
}
