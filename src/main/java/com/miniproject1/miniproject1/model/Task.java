package com.miniproject1.miniproject1.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Task{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String taskname;
    String taskinfo;
    String date;

    @ManyToOne
   @JoinColumn(name = "user_id")
    private User user;


}
