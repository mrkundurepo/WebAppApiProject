package com.project.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.webapp.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
