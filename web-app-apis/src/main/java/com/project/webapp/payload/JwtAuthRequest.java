package com.project.webapp.payload;

import lombok.Data;

@Data
public class JwtAuthRequest {
	private String username;
	private String password;
	
}
