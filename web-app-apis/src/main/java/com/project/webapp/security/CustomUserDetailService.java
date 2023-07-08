package com.project.webapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.webapp.entity.User;
import com.project.webapp.exception.ResourceNotFoundException;
import com.project.webapp.repository.UserRepo;

@Service
public class CustomUserDetailService implements UserDetailsService{
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Loading user from database by user name
		User user = this.userRepo.findByEmail(username)
				.orElseThrow(() -> new ResourceNotFoundException("User","email: " + username, 0));
		return user;
	}
}
