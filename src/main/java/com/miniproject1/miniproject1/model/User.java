package com.miniproject1.miniproject1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String email;
    String password;
    String mobileNO;

   @OneToMany(mappedBy = "user")
   private List<Task> tasklist;


}
