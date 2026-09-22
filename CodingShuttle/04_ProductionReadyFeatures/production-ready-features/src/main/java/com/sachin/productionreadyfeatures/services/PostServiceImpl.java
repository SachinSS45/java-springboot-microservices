package com.sachin.productionreadyfeatures.services;

import com.sachin.productionreadyfeatures.DTO.PostDTO;
import com.sachin.productionreadyfeatures.entities.PostEntity;
import com.sachin.productionreadyfeatures.exceptions.ResourceNotFoundException;
import com.sachin.productionreadyfeatures.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
    private final ModelMapper mapper;
    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository
                .findAll()
                .stream()
                .map( e -> mapper.map(e,PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO createNewPost(PostDTO inputPost) {
        PostEntity postEntity = mapper.map(inputPost, PostEntity.class);
        PostEntity savedEntity = postRepository.save(postEntity);
//        PostDTO postDTO = new PostDTO();
//        postDTO.setTitle(savedEntity.getTitle());
//        postDTO.setDescription(savedEntity.getDescription());
//        return postDTO;
        return mapper.map(savedEntity,PostDTO.class);
    }

    @Override
    public PostDTO getPostById(Long postId) {
        PostEntity postEntity= postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Resource is not found with id : " + postId));
        return mapper.map(postEntity,PostDTO.class);
    }
}
