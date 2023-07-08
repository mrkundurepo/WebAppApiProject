package com.project.webapp.service;

import java.util.List;
import com.project.webapp.payload.PostDto;
import com.project.webapp.payload.PostResponse;
public interface PostService {
	// Create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	// Update
	PostDto updatePost(PostDto postDto, Integer postId);
	// Delete
	void deletePost(Integer postId);
	// Fetch all posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	// Fetch single post
	PostDto getPostById(Integer postId);
	// Fetch all post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	// Fetch all post by user
	List<PostDto> getPostsByUser(Integer userId);
	// Search Post
	List<PostDto> searchPosts(String keyword);
	
}
