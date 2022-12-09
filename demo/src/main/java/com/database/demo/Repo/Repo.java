package com.database.demo.Repo;

import java.util.List;

import com.database.demo.Entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<UserType, Integer> {
    List<UserType> findAll();
    
}
