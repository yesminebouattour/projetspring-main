package com.example.pfa.annexes7;

import com.example.pfa.annexes3TypeId.Annexe3TypeId;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontant;

import javax.persistence.*;

@Entity(name = "annexes7")
@Table(name = "annexes7")
public class Annexe7 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private Long idCin;

    private String name;
    private String activite;
    private String adresse;
    private Double montansPaye;
    private Double montantRetenues;
    private Double montantnet;



    public Annexe3TypeId getAnnexe3TypeId() {
        return typeid;
    }

    public void setAnnexe3TypeId(Annexe3TypeId typeid) {
        this.typeid = typeid;
    }

    public Annexe6NatureMontant getAnnexe6NatureMontant() {
        return annexe6NatureMontant;
    }

    public void setAnnexe6NatureMontant( Annexe6NatureMontant natureMontant ) {
        this.annexe6NatureMontant = natureMontant;

    }
    @ManyToOne
    private Annexe3TypeId typeid;
    @ManyToOne
    private Annexe6NatureMontant annexe6NatureMontant;
    public Annexe7(Long id, Long idCin, String name, String activite, String adresse, Double montansPaye, Double montantRetenues, Double montantnet) {
        this.id = id;
        this.idCin = idCin;
        this.name = name;
        this.activite = activite;
        this.adresse = adresse;
        this.montansPaye = montansPaye;
        this.montantRetenues = montantRetenues;
        this.montantnet = montantnet;
    }

    public Annexe7() {

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

    public Double getMontansPaye() {
        return montansPaye;
    }

    public void setMontansPaye(Double montansPaye) {
        this.montansPaye = montansPaye;
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

