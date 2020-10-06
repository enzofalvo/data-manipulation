
package com.enzofalvo.applicationspring.services;

import com.enzofalvo.applicationspring.entities.Order;
import com.enzofalvo.applicationspring.repositories.OrderRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
    
    public Order findById (Long id) {
        Optional <Order> obj = repository.findById(id);
        return obj.get();
    }

    
    
}


