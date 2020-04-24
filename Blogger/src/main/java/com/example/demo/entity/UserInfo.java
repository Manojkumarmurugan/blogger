package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="user_info")
@Entity
public class UserInfo {
	@Id
	Long id;
	String name;
	String email;
}
