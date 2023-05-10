package com.example.pfa.annexes;

import javax.persistence.*;

@Entity(name = "annexe")
@Table(name = "annexe")
public class Annexes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private Long annexe;

    public Annexes() {

    }


    public Annexes(Long id, Long annexe) {
        this.id = id;
        this.annexe = annexe;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAnnexe() {
        return annexe;
    }

    public void setAnnexe(Long annexe) {
        this.annexe = annexe;
    }


}
