package com.springboot.blog.apringbootblogrestapi.service;

import com.springboot.blog.apringbootblogrestapi.payload.PostDto;
import com.springboot.blog.apringbootblogrestapi.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);
}
