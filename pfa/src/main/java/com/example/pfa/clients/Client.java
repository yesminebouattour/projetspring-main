package com.example.pfa.clients;
import javax.persistence.*;



@Entity(name = "clients")
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raisonsocial;

    private Long numero;

    private Long code ;
    private Long codeTVA;
    private Long nétablissement;
    private Long codePostale;
    private String activité;
    private String rue;
    private String ville;
    private String catégorie;

    private Long clef;


    public Client(Long id, String raisonsocial,  Long numero, Long code,Long codeTVA,Long nétablissement,
                  Long codePostale, String activité,String rue,String catégorie,Long clef, String ville ) {
        this.id = id;
        this.raisonsocial = raisonsocial;
        this.numero = numero;
        this.code= code;
        this.codeTVA=codeTVA;
        this.nétablissement=nétablissement;
        this.codePostale=codePostale;
        this.activité=activité;
        this.rue=rue;
        this.catégorie=catégorie;
        this.clef=clef;
        this.ville=ville;
    }

    public Client() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getraisonsocial() {
        return raisonsocial;
    }

    public void setraisonsocial(String raisonsocial) {
        this.raisonsocial =raisonsocial;
    }


    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code ;
    }
    public Long getcodeTVA() {
        return codeTVA;
    }

    public void setcodeTVA(Long codeTVA) {
        this.codeTVA = codeTVA ;
    }
    public Long getNétablissement() {
        return nétablissement;
    }

    public void setNétablissement(Long nétablissement) {
        this.nétablissement = nétablissement;
    }

    public Long getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(Long codePostale) {
        this.codePostale = codePostale;
    }

    public String getActivité() {
        return activité;
    }

    public void setActivité(String activité) {
        this.activité = activité;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }


    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }


    public Long getClef() {
        return clef;
    }

    public void setClef(Long clef) {
        this.clef = clef;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville =ville;
    }
}