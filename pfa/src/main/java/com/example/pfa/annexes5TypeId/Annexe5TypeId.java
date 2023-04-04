package com.example.pfa.annexes5TypeId;


import javax.persistence.*;

@Entity(name = "annexes5TypeId")
@Table(name = "annexes5TypeId")
public class Annexe5TypeId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeid;

    public Annexe5TypeId(Long id, String typeid) {
        this.id = id;
        this.typeid = typeid;
    }

    public Annexe5TypeId() {

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

