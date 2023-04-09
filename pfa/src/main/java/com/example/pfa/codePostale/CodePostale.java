package com.example.pfa.codePostale;

import javax.persistence.*;

@Entity(name = "codePostale")
@Table(name = "codePostale")
public class CodePostale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ville;
    private Long codePostale;

    public CodePostale(Long id, String ville, Long codePostale) {
        this.id = id;
        this.ville = ville;
        this.codePostale = codePostale;
    }

    public CodePostale() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Long getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(Long codePostale) {
        this.codePostale = codePostale;
    }





}
