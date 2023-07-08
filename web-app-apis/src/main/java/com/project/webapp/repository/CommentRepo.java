package com.project.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.webapp.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
