package com.example.pfa.annexes1TypeId;
import javax.persistence.*;


@Entity(name = "annexes1TypeId")
@Table(name = "annexes1TypeId")
public class Annexe1TypeId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeid;

    public Annexe1TypeId(Long id, String typeid) {
        this.id = id;
        this.typeid = typeid;
    }

    public Annexe1TypeId() {

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

