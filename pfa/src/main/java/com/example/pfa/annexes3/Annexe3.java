package com.example.pfa.annexes3;


import com.example.pfa.annexes1TypeId.Annexe1TypeId;
import com.example.pfa.annexes3TypeId.Annexe3TypeId;

import javax.persistence.*;

@Entity(name = "annexes3")
@Table(name = "annexes3")
public class Annexe3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private Long idCin;

    private String name;

    private String activite;
    private String adresse;
    private Double interetCompte;
    private Double interetAutre;
    private Double interetPrets;
    private Double montantCGC;
    private Double montantRetenues;
    private Double montantnet;

    public Annexe3TypeId getAnnexe3TypeId() {
        return typeid;
    }

    public void setAnnexe3TypeId(Annexe3TypeId typeid) {
        this.typeid = typeid;
    }

    @ManyToOne
    private Annexe3TypeId typeid;
    public Annexe3(Long id, Long idCin, String name, String activite, String adresse, Double interetCompte, Double interetAutre, Double interetPrets, Double montantCGC, Double montantRetenues, Double montantnet) {
        this.id = id;
        this.idCin = idCin;
        this.name = name;
        this.activite = activite;
        this.adresse = adresse;
        this.interetCompte = interetCompte;
        this.interetAutre = interetAutre;
        this.interetPrets = interetPrets;
        this.montantCGC = montantCGC;
        this.montantRetenues = montantRetenues;
        this.montantnet = montantnet;
    }

    public Annexe3() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCin() {
        return idCin;
    }

    public void setIdCin(Long idCin) {
        this.idCin = idCin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Double getInteretCompte() {
        return interetCompte;
    }

    public void setInteretCompte(Double interetCompte) {
        this.interetCompte = interetCompte;
    }

    public Double getInteretAutre() {
        return interetAutre;
    }

    public void setInteretAutre(Double interetAutre) {
        this.interetAutre = interetAutre;
    }

    public Double getInteretPrets() {
        return interetPrets;
    }

    public void setInteretPrets(Double interetPrets) {
        this.interetPrets = interetPrets;
    }

    public Double getMontantCGC() {
        return montantCGC;
    }

    public void setMontantCGC(Double montantCGC) {
        this.montantCGC = montantCGC;
    }

    public Double getMontantRetenues() {
        return montantRetenues;
    }

    public void setMontantRetenues(Double montantRetenues) {
        this.montantRetenues = montantRetenues;
    }

    public Double getMontantnet() {
        return montantnet;
    }

    public void setMontantnet(Double montantnet) {
        this.montantnet = montantnet;
    }



}