package com.sachin.datajpa.controllers;

import com.sachin.datajpa.entities.ProductEntity;
import com.sachin.datajpa.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final Integer PAGE_SIZE = 5;//5 items on one page
    private final ProductRepository productRepository;


    @GetMapping
    public Page<ProductEntity> getAllProducts(@RequestParam(defaultValue = "id") String sortBy, @RequestParam(defaultValue = "1") Integer pageNumber){
        // if two products if have same property then sort by price if not they sortBy whatever property coming in RequestParam
       // return productRepository.findBy(Sort.by(Sort.Direction.DESC,sortBy,"price")); //OR
        //by using below we can sort one field on basis of desc and if two product have same then sort by price asc
       // return productRepository.findBy(Sort.by(Sort.Order.desc(sortBy),Sort.Order.asc("price")));

        //pagination :
        Pageable pageable = PageRequest.of(pageNumber,PAGE_SIZE);
        return productRepository.findAll(pageable);

        //if we don't want to return in Page<ProductEntity> want to send in List<ProductEntity> we can do that
        // while return do this productRepository.findAll(pageable).getContent();
    }
}
