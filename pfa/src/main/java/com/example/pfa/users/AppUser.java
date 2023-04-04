package com.example.pfa.users;
import com.example.pfa.roles.Role;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
@Table(name = "users")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    @Column(unique=true)
    private  String email;
    private String password;
    private  Integer age;

    private Integer number;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @ManyToOne
    private Role role;



    public AppUser(String name, String email, String password, Integer age, Integer number ) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age=age;
        this.number = number;


    }

    public AppUser() {

    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }




}
