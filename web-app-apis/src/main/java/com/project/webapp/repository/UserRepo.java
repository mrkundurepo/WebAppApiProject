package com.project.webapp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.webapp.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String eamil);

}
