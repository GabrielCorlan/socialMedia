package com.academia.socialMedia.repository;

import com.academia.socialMedia.model.Post;
import com.academia.socialMedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
