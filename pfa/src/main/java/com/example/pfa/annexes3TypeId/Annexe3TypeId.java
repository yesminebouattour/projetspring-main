package com.example.pfa.annexes3TypeId;

import javax.persistence.*;

@Entity(name = "annexes3TypeId")
@Table(name = "annexes3TypeId")
public class Annexe3TypeId {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeid;


    public Annexe3TypeId(Long id, String typeid) {
        this.id = id;
        this.typeid = typeid;
    }
    public Annexe3TypeId() {

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
