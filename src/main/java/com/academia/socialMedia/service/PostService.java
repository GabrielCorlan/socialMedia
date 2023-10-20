package com.academia.socialMedia.service;

import com.academia.socialMedia.model.Post;
import com.academia.socialMedia.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void savePost(Post post){
        postRepository.save(post);
    }
}
