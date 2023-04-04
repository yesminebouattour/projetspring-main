package com.example.pfa.annexes1;
import com.example.pfa.annexes1SFm.Annexe1SFm;
import com.example.pfa.annexes1TypeId.Annexe1TypeId;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "annexes1")
@Table(name = "annexes1")
public class Annexe1 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private Long nordre ;

    private Long idCin;
    private String name;
    private String emploi;
    private String adresse;

    private Integer enfant;
    private String d1 ;
    private String d2;
    private Integer njour;
    private Double revenuImposable;
    private Double vavantages;
    private Double totalrevenus;
    private Double revenuréinvesti;
    private Double redevence1;
    private Double régimecommun;
    private Double contribution;
    private Double tauxde20;
    private Double montantnet;

    public Annexe1TypeId getAnnexe1TypeId() {
        return typeid;
    }

    public void setAnnexe1TypeId(Annexe1TypeId typeid) {
        this.typeid = typeid;
    }

    public Annexe1SFm getAnnexe1SFm() {
        return annexe1SFm;
    }

    public void setAnnexe1SFm (Annexe1SFm situation) {
        this.annexe1SFm = situation;
    }
    @ManyToOne
    private Annexe1SFm annexe1SFm;
    @ManyToOne
    private Annexe1TypeId typeid;

    public Annexe1(Long id,Long nordre,  Long idCin, String name, String emploi, String adresse, Integer enfant, String d1, String d2,
                   Integer njour, Double revenuImposable, Double vavantages, Double totalrevenus, Double revenuréinvesti,
                   Double redevence1, Double régimecommun, Double contribution, Double tauxde20, Double montantnet/*, Annexe1SFm annexe1SFm*/ ) {
        this.id=id;
        this.nordre = nordre;
        this.idCin = idCin;
        this.name = name;
        this.emploi = emploi;
        this.adresse = adresse;
        this.enfant = enfant;
        this.d1 = d1;
        this.d2 = d2;
        this.njour = njour;
        this.revenuImposable = revenuImposable;
        this.vavantages = vavantages;
        this.totalrevenus = totalrevenus;
        this.revenuréinvesti = revenuréinvesti;
        this.redevence1 = redevence1;
        this.régimecommun = régimecommun;
        this.contribution = contribution;
        this.tauxde20 = tauxde20;
        this.montantnet = montantnet;
//        this.annexe1SFm = annexe1SFm;

    }
    public Annexe1() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNordre() {
        return nordre;
    }

    public void setNordre(Long nordre) {
        this.nordre = nordre;
    }



    public Long getidCin() {
        return idCin;
    }

    public void setidCin(Long idCin) {
        this.idCin = idCin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmploi() {
        return emploi;
    }

    public void setEmploi(String emploi) {
        this.emploi = emploi;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public Integer getEnfant() {
        return enfant;
    }

    public void setEnfant(Integer enfant) {
        this.enfant = enfant;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public Integer getNjour() {
        return njour;
    }

    public void setNjour(Integer njour) {
        this.njour = njour;
    }

    public Double getRevenuImposable() {
        return revenuImposable;
    }

    public void setRevenuImposable(Double revenuImposable) {
        this.revenuImposable = revenuImposable;
    }

    public Double getVavantages() {
        return vavantages;
    }

    public void setVavantages(Double vavantages) {
        this.vavantages = vavantages;
    }

    public Double getTotalrevenus() {
        return totalrevenus;
    }

    public void setTotalrevenus(Double totalrevenus) {
        this.totalrevenus = totalrevenus;
    }

    public Double getRevenuréinvesti() {
        return revenuréinvesti;
    }

    public void setRevenuréinvesti(Double revenuréinvesti) {
        this.revenuréinvesti = revenuréinvesti;
    }

    public Double getRedevence1() {
        return redevence1;
    }

    public void setRedevence1(Double redevence1) {
        this.redevence1 = redevence1;
    }

    public Double getRégimecommun() {
        return régimecommun;
    }

    public void setRégimecommun(Double régimecommun) {
        this.régimecommun = régimecommun;
    }

    public Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

    public Double getTauxde20() {
        return tauxde20;
    }

    public void setTauxde20(Double tauxde20) {
        this.tauxde20 = tauxde20;
    }

    public Double getMontantnet() {
        return montantnet;
    }

    public void setMontantnet(Double montantnet) {
        this.montantnet = montantnet;
    }







}
