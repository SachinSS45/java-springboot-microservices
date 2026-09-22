package com.sachin.prodreadyfeatures.services;

import com.sachin.prodreadyfeatures.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);
}
