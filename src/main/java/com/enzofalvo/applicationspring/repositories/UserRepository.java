package com.enzofalvo.applicationspring.repositories;

import com.enzofalvo.applicationspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>   {
    
}
