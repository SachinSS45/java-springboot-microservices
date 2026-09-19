package com.sachin.datajpa.repositories;


import com.sachin.datajpa.entities.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    @Query("select e from ProductEntity e where e.price=?1 and e.title=?2")
    Optional<ProductEntity> findByPriceAndTitle(BigDecimal price,String title);
    //sorting all product by Price //but it is tightly coupled we need to write new method for new
    // for example for OrderByQuantity we need to write new , for OrderByName , OrderByCreatedDate
    List<ProductEntity> findByOrderByPrice();

    //to overcome that we use Sort class loosly coupled only we need on basis of which we want sorting
    List<ProductEntity> findBy(Sort sort);
}
