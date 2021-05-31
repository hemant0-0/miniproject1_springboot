package com.miniproject1.miniproject1.controller;

import com.miniproject1.miniproject1.model.User;
import com.miniproject1.miniproject1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "zal re bhai ";
    }
}
