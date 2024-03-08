package com.user_services.Userservices.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="micro-users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @Column(name="Id")
    private String userId;
    @Column(name="Name")
    private  String name;
    @Column(name="Email")
    private  String email;
    @Column(name="about")
    private  String about;
    @Transient
    private List<Rating> ratings;

}
