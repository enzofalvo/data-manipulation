package com.enzofalvo.applicationspring.repositories;

import com.enzofalvo.applicationspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>   {
    
}
