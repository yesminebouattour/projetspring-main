package com.example.pfa.annexes2;


import com.example.pfa.annexes2TypeId.Annexe2TypeId;
import com.example.pfa.annexes6NaturesMontants.Annexe6NatureMontant;
import com.example.pfa.clients.Client;

import javax.persistence.*;

@Entity(name = "annexes2")
@Table(name = "annexes2")
public class Annexe2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private Long idCin;
    private String name;

    private String activite;
    private String adresse;
    private Double montant ;
    private Double honorairesServis;
    private Double remuEtPrimes;
    private Double remunerationPaye;
    private Double plusValue;
    private Double loyerHotels;
    private Double remunerationArtiste;
    private Double montantRetenues;
    private Double retenueTVA;
    private Double montantnet;


    public Annexe6NatureMontant getAnnexe6NatureMontant() {
        return annexe6NatureMontant;
    }

    public void setAnnexe6NatureMontant( Annexe6NatureMontant natureMontant ) {
        this.annexe6NatureMontant = natureMontant;

    }

    public Annexe2TypeId getAnnexe2TypeId() {
        return typeid;
    }

    public void setAnnexe2TypeId(Annexe2TypeId typeid) {
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
    private Annexe2TypeId typeid;
    @ManyToOne
    private Client client;

    public Annexe2(Long id, Long idCin, String name, String activite, String adresse,Double montant, Double honorairesServis, Double remuEtPrimes, Double remunerationPaye, Double plusValue, Double loyerHotels, Double remunerationArtiste, Double montantRetenues, Double retenueTVA, Double montantnet) {
        this.id = id;
        this.idCin = idCin;
        this.name = name;
        this.activite = activite;
        this.adresse = adresse;
        this.montant = montant;
        this.honorairesServis = honorairesServis;
        this.remuEtPrimes = remuEtPrimes;
        this.remunerationPaye = remunerationPaye;
        this.plusValue = plusValue;
        this.loyerHotels = loyerHotels;
        this.remunerationArtiste = remunerationArtiste;
        this.montantRetenues = montantRetenues;
        this.retenueTVA = retenueTVA;
        this.montantnet = montantnet;

    }

    public Annexe2() {

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

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Double getHonorairesServis() {
        return honorairesServis;
    }

    public void setHonorairesServis(Double honorairesServis) {
        this.honorairesServis = honorairesServis;
    }

    public Double getRemuEtPrimes() {
        return remuEtPrimes;
    }

    public void setRemuEtPrimes(Double remuEtPrimes) {
        this.remuEtPrimes = remuEtPrimes;
    }

    public Double getRemunerationPaye() {
        return remunerationPaye;
    }

    public void setRemunerationPaye(Double remunerationPaye) {
        this.remunerationPaye = remunerationPaye;
    }

    public Double getPlusValue() {
        return plusValue;
    }

    public void setPlusValue(Double plusValue) {
        this.plusValue = plusValue;
    }

    public Double getLoyerHotels() {
        return loyerHotels;
    }

    public void setLoyerHotels(Double loyerHotels) {
        this.loyerHotels = loyerHotels;
    }

    public Double getRemunerationArtiste() {
        return remunerationArtiste;
    }

    public void setRemunerationArtiste(Double remunerationArtiste) {
        this.remunerationArtiste = remunerationArtiste;
    }

    public Double getMontantRetenues() {
        return montantRetenues;
    }

    public void setMontantRetenues(Double montantRetenues) {
        this.montantRetenues = montantRetenues;
    }

    public Double getRetenueTVA() {
        return retenueTVA;
    }

    public void setRetenueTVA(Double retenueTVA) {
        this.retenueTVA = retenueTVA;
    }

    public Double getMontantnet() {
        return montantnet;
    }

    public void setMontantnet(Double montantnet) {
        this.montantnet = montantnet;
    }


}
