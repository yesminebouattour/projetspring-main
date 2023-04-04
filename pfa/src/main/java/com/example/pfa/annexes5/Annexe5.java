package com.example.pfa.annexes5;

import com.example.pfa.annexes5TypeId.Annexe5TypeId;

import javax.persistence.*;

@Entity(name = "annexes5")
@Table(name = "annexes5")
public class Annexe5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private Long idCin;

    private String name;

    private String activite;
    private String adresse;
    private Double mt10;
    private Double retenues;
    private Double mt15;
    private Double mt23;
    private Double mtEses;
    private Double mtTVA;
    private Double montantnet;

    public Annexe5TypeId getAnnexe5TypeId() {
        return typeid;
    }

    public void setAnnexe5TypeId(Annexe5TypeId typeid) {
        this.typeid = typeid;
    }

    @ManyToOne
    private Annexe5TypeId typeid;
    public Annexe5(Long id, Long idCin, String name, String activite, String adresse, Double mt10, Double retenues, Double mt15, Double mt23, Double mtEses,
                   Double mtTVA, Double montantnet) {
        this.id = id;
        this.idCin = idCin;
        this.name = name;
        this.activite = activite;
        this.adresse = adresse;
        this.mt10 = mt10;
        this.retenues = retenues;
        this.mt15 = mt15;
        this.mt23 = mt23;
        this.mtEses = mtEses;
        this.mtTVA = mtTVA;
        this.montantnet = montantnet;
    }

    public Annexe5() {

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

    public Double getMt10() {
        return mt10;
    }

    public void setMt10(Double mt10) {
        this.mt10 = mt10;
    }

    public Double getRetenues() {
        return retenues;
    }

    public void setRetenues(Double retenues) {
        this.retenues = retenues;
    }

    public Double getMt15() {
        return mt15;
    }

    public void setMt15(Double mt15) {
        this.mt15 = mt15;
    }

    public Double getMt23() {
        return mt23;
    }

    public void setMt23(Double mt23) {
        this.mt23 = mt23;
    }

    public Double getMtEses() {
        return mtEses;
    }

    public void setMtEses(Double mtEses) {
        this.mtEses = mtEses;
    }

    public Double getMtTVA() {
        return mtTVA;
    }

    public void setMtTVA(Double mtTVA) {
        this.mtTVA = mtTVA;
    }

    public Double getMontantnet() {
        return montantnet;
    }

    public void setMontantnet(Double montantnet) {
        this.montantnet = montantnet;
    }



}
