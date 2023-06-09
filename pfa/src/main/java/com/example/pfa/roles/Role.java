package com.example.pfa.roles;


import javax.persistence.*;

@Entity(name = "Roles")
@Table(name = "Roles")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;

    public Role() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Role(Long id, String role){
        this.id=id;
        this.role=role;
    }


    public void addRole(Role role) {
    }
}
