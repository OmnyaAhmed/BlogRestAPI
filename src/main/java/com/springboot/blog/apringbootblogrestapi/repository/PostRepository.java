package com.springboot.blog.apringbootblogrestapi.repository;

import com.springboot.blog.apringbootblogrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
