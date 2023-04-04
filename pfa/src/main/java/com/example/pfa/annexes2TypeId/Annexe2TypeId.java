package com.example.pfa.annexes2TypeId;


import javax.persistence.*;

@Entity(name = "annexes2TypeId")
@Table(name = "annexes2TypeId")
public class Annexe2TypeId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeid;

    public Annexe2TypeId(Long id, String typeid) {
        this.id = id;
        this.typeid = typeid;
    }

    public Annexe2TypeId() {

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
