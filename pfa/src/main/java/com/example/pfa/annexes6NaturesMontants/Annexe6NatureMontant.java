package com.example.pfa.annexes6NaturesMontants;


import com.example.pfa.annexes.Annexes;

import javax.persistence.*;

@Entity(name = "NaturesMontants")
@Table(name = "NaturesMontants")
public class Annexe6NatureMontant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String natureMontant;

    private String annexe;


    public Annexes getAnnexes() {
        return annexes;
    }

    public void setAnnexes(Annexes annexe) {
        this.annexes = annexe;
    }

    @ManyToOne
    private Annexes annexes;

    public Annexe6NatureMontant(Long id, String natureMontant, String annexe) {
        this.id = id;
        this.natureMontant = natureMontant;
        this.annexe=annexe;
    }

    public Annexe6NatureMontant() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNatureMontant() {
        return natureMontant;
    }

    public void setNatureMontant(String natureMontant) {
        this.natureMontant = natureMontant;
    }

    public String getAnnexe() {
        return annexe;
    }

    public void setAnnexe(String annexe) {
        this.annexe = annexe;
    }




}
