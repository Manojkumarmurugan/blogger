package com.example.demo.dataclass;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LoginCredentials {
	@NotNull
	private String username;
	@NotNull
	private String password;
}
