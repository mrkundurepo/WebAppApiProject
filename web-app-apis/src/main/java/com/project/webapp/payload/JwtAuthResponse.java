package com.project.webapp.payload;

import lombok.Data;

@Data
public class JwtAuthResponse {
	private String token;
	private UserDto user;
}
