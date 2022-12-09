package com.database.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.database.demo.Entity.UserType;
import com.database.demo.Repo.Repo;

@RestController
public class UsersApi {
    @Autowired
    Repo repo;

    @GetMapping("/getusers")
    public List<UserType> getUsers(){
        return repo.findAll();
    }
}
