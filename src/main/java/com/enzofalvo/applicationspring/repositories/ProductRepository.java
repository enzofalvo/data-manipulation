package com.enzofalvo.applicationspring.repositories;

import com.enzofalvo.applicationspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>   {
    
}
