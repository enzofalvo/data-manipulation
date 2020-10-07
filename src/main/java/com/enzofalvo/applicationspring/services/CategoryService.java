
package com.enzofalvo.applicationspring.services;

import com.enzofalvo.applicationspring.entities.Category;
import com.enzofalvo.applicationspring.repositories.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
    
    public Category findById (Long id) {
        Optional <Category> obj = repository.findById(id);
        return obj.get();
    }

    
    
}


