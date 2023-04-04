package com.example.pfa.posts;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;
    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public void addPost(Post post){
        postRepository.save(post);
  }
    public List<Post> getPosts(){
        return postRepository.findAll();
    }
    public  Post getPost(Long id){
        return postRepository.findById(id).get();
    }
    public void deletePost(Long id){
        boolean exist=postRepository.existsById(id);
        if (exist){
            postRepository.deleteById(id);
        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        };
    }
    public void updatePost(Long id , Post post){
        boolean exist = postRepository.existsById(id);
        if (exist){
            postRepository.save(post);

        }
        else {
            throw new IllegalStateException(
                    "post with id" +id+ "does not exist"
            );
        }
    }

}
