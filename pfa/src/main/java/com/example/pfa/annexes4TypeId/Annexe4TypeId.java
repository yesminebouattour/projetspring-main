package com.example.pfa.annexes4TypeId;


import javax.persistence.*;

@Entity(name = "annexes4TypeId")
@Table(name = "annexes4TypeId")
public class Annexe4TypeId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeid;

    public Annexe4TypeId(Long id, String typeid) {
        this.id = id;
        this.typeid = typeid;
    }

    public Annexe4TypeId() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }
}

