package com.miniproject1.miniproject1.repository;

import com.miniproject1.miniproject1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
