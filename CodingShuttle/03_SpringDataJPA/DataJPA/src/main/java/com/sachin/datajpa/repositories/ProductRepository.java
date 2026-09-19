package com.sachin.datajpa.repositories;


import com.sachin.datajpa.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    List<ProductEntity> findByTitle(String title);

    List<ProductEntity> findByCreatedAtAfter(LocalDateTime localDateTime);

    List<ProductEntity> findByQuantityAndPrice(Integer quantity, BigDecimal price);

    Optional<ProductEntity> findByTitleAndPrice(String title,BigDecimal price);
}
