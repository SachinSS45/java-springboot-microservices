package com.sachin.datajpa;

import com.sachin.datajpa.entities.ProductEntity;
import com.sachin.datajpa.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class DataJpaApplicationTests {

    @Autowired
    ProductRepository productRepository;
    @Test
    void contextLoads() {
    }

    @Test
    void testRepository(){
        ProductEntity productEntity = ProductEntity.builder()
                .sku("nestle1234")
                .title("Nestle chocolate")
                .quantity(4)
                .price(BigDecimal.valueOf(10.00))
                .build();
        ProductEntity savedProductEntity = productRepository.save(productEntity);
        System.out.println(savedProductEntity);
    }

    @Test
    void getRepository(){
        List<ProductEntity> allProducts = productRepository.findAll();
        System.out.println(allProducts);
        System.out.println("--------------------");
        List<ProductEntity> findByTitle = productRepository.findByTitle("Nestle chocolate");
        System.out.println(findByTitle);
    }

    @Test
    void findByCreatedAtAfter(){
        List<ProductEntity> products = productRepository.findByCreatedAtAfter(LocalDateTime.of(2026,01,01,0,0,0));
        System.out.println(products);
    }

    @Test
    void findByQuantityAndPrice(){
        List<ProductEntity> products = productRepository.findByQuantityAndPrice(4,BigDecimal.valueOf(10));
        System.out.println(products);
    }
}
