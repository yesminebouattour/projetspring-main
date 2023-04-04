package com.example.pfa.annexes1SFm;
import javax.persistence.*;

@Entity(name = "annexes1SFm")
@Table(name = "annexes1SFm")
public class Annexe1SFm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String situation;

    public Annexe1SFm(Long id, String situation) {
        this.id = id;
        this.situation = situation;
    }

    public Annexe1SFm() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }






}
