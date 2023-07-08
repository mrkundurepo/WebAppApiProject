package com.project.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.webapp.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
