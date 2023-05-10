package com.example.pfa.annexes4;


import com.example.pfa.annexes4TypeId.Annexe4TypeId;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontant;
import com.example.pfa.clients.Client;

import javax.persistence.*;

@Entity(name = "annexes4")
@Table(name = "annexes4")
public class Annexe4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private Long idCin;
    private String name;

    private String activite;
    private String adresse;
    private Double honorairesCom;
    private Double honoraires6M;
    private Double taux ;
    private Double plusValueImm;

    private Double mtdesrevenues;
    private Double valeurMob;
    private Double retOpérées;

    private Double plusValueCessi;
    private Double montantRetenues;
    private Double montantnet;


    public Annexe6NatureMontant getAnnexe6NatureMontant() {
        return annexe6NatureMontant;
    }

    public void setAnnexe6NatureMontant( Annexe6NatureMontant natureMontant ) {
        this.annexe6NatureMontant = natureMontant;

    }

    public Annexe4TypeId getAnnexe4TypeId() {
        return typeid;
    }

    public void setAnnexe4TypeId(Annexe4TypeId typeid) {
        this.typeid = typeid;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client raisonsocial) {
        this.client = raisonsocial;
    }
    @ManyToOne
    private Annexe6NatureMontant annexe6NatureMontant;
    @ManyToOne
    private Annexe4TypeId typeid;
    @ManyToOne
    private Client client;
    public Annexe4(Long id, Long idCin, String name, String activite, String adresse,Double honorairesCom, Double honoraires6M, Double taux, Double plusValueImm, Double mtdesrevenues,
                   Double valeurMob, Double retOpérées, Double plusValueCessi, Double montantRetenues, Double montantnet,Annexe6NatureMontant annexe6NatureMontant) {
        this.id = id;
        this.idCin = idCin;
        this.name = name;
        this.activite = activite;
        this.adresse = adresse;
        this.honorairesCom = honorairesCom;
        this.honoraires6M = honoraires6M;
        this.taux = taux;
        this.plusValueImm = plusValueImm;
        this.mtdesrevenues = mtdesrevenues;
        this.valeurMob = valeurMob;
        this.retOpérées = retOpérées;
        this.plusValueCessi = plusValueCessi;
        this.montantRetenues = montantRetenues;
        this.montantnet = montantnet;
        this.annexe6NatureMontant=annexe6NatureMontant;
    }

    public Annexe4() {

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

    public Double getHonorairesCom() {
        return honorairesCom;
    }

    public void setHonorairesCom(Double honorairesCom) {
        this.honorairesCom = honorairesCom;
    }

    public Double getHonoraires6M() {
        return honoraires6M;
    }

    public void setHonoraires6M(Double honoraires6M) {
        this.honoraires6M = honoraires6M;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public Double getPlusValueImm() {
        return plusValueImm;
    }

    public void setPlusValueImm(Double plusValueImm) {
        this.plusValueImm = plusValueImm;
    }

    public Double getMtdesrevenues() {
        return mtdesrevenues;
    }

    public void setMtdesrevenues(Double mtdesrevenues) {
        this.mtdesrevenues = mtdesrevenues;
    }

    public Double getValeurMob() {
        return valeurMob;
    }

    public void setValeurMob(Double valeurMob) {
        this.valeurMob = valeurMob;
    }

    public Double getRetOpérées() {
        return retOpérées;
    }

    public void setRetOpérées(Double retOpérées) {
        this.retOpérées = retOpérées;
    }



    public Double getPlusValueCessi() {
        return plusValueCessi;
    }

    public void setPlusValueCessi(Double plusValueCessi) {
        this.plusValueCessi = plusValueCessi;
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
