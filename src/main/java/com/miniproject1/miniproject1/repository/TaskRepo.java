package com.miniproject1.miniproject1.repository;

import com.miniproject1.miniproject1.model.Task;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Integer> {
}
