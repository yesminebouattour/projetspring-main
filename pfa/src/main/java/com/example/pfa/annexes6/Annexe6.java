package com.example.pfa.annexes6;

import com.example.pfa.annexes3TypeId.Annexe3TypeId;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontant;

import javax.persistence.*;

@Entity(name = "annexes6")
@Table(name = "annexes6")
public class Annexe6 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private Long idCin;
    private String name;
    private String activite;
    private String adresse;
    private Double mtsRistoumes;
    private Double mtsVentes;
    private Double ventesPP;
    private Double mtPari;
    private Double retenuPari;
    private Double mtVentesEses;
    private Double retenuVentesEses;
    private Double mtsRecouvrés;


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

    public Annexe6(Long id, Long idCin, String name, String activite, String adresse, Double mtsRistoumes, Double mtsVentes, Double ventesPP, Double mtPari, Double retenuPari, Double mtVentesEses, Double retenuVentesEses, Double mtsRecouvrés) {
        this.id = id;
        this.idCin = idCin;
        this.name = name;
        this.activite = activite;
        this.adresse = adresse;
        this.mtsRistoumes = mtsRistoumes;
        this.mtsVentes = mtsVentes;
        this.ventesPP = ventesPP;
        this.mtPari = mtPari;
        this.retenuPari = retenuPari;
        this.mtVentesEses = mtVentesEses;
        this.retenuVentesEses = retenuVentesEses;
        this.mtsRecouvrés = mtsRecouvrés;
    }

    public Annexe6() {

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

    public Double getMtsRistoumes() {
        return mtsRistoumes;
    }

    public void setMtsRistoumes(Double mtsRistoumes) {
        this.mtsRistoumes = mtsRistoumes;
    }

    public Double getMtsVentes() {
        return mtsVentes;
    }

    public void setMtsVentes(Double mtsVentes) {
        this.mtsVentes = mtsVentes;
    }

    public Double getVentesPP() {
        return ventesPP;
    }

    public void setVentesPP(Double ventesPP) {
        this.ventesPP = ventesPP;
    }

    public Double getMtPari() {
        return mtPari;
    }

    public void setMtPari(Double mtPari) {
        this.mtPari = mtPari;
    }

    public Double getRetenuPari() {
        return retenuPari;
    }

    public void setRetenuPari(Double retenuPari) {
        this.retenuPari = retenuPari;
    }

    public Double getMtVentesEses() {
        return mtVentesEses;
    }

    public void setMtVentesEses(Double mtVentesEses) {
        this.mtVentesEses = mtVentesEses;
    }

    public Double getRetenuVentesEses() {
        return retenuVentesEses;
    }

    public void setRetenuVentesEses(Double retenuVentesEses) {
        this.retenuVentesEses = retenuVentesEses;
    }

    public Double getMtsRecouvrés() {
        return mtsRecouvrés;
    }

    public void setMtsRecouvrés(Double mtsRecouvrés) {
        this.mtsRecouvrés = mtsRecouvrés;
    }

}

