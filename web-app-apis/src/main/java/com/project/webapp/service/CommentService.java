package com.project.webapp.service;

import com.project.webapp.payload.CommentDto;

public interface CommentService {
	CommentDto createComment(CommentDto commentDto, Integer postId);
	void deleteComment(Integer commentId);
}
