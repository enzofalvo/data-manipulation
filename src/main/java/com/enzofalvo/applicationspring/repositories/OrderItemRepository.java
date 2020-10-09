package com.enzofalvo.applicationspring.repositories;

import com.enzofalvo.applicationspring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
    
}
