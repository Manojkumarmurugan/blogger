package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserCredentials;

public interface UserCredentialsRepository extends CrudRepository<UserCredentials, Long>{
	Optional<UserCredentials> findByUsername(String userName);
}
