package com.spring.rest.webservices.restwebservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Reseau {


    @Id
    @GeneratedValue
    private int id;

    private String libelle;

    private String CodeReseau;

    private Date dateCreation;

    @OneToMany(mappedBy = "reseau")
    private Set<Ligne> lignes = new HashSet<Ligne>();

    protected Reseau(){

    }

    public Set<Ligne> getLignes() {
        return lignes;
    }

    public void setLignes(Set<Ligne> lignes) {
        this.lignes = lignes;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeReseau() {
        return CodeReseau;
    }

    public void setCodeReseau(String codeReseau) {
        CodeReseau = codeReseau;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Reseau{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", CodeReseau='" + CodeReseau + '\'' +
                ", dateCreation=" + dateCreation +
                ", lignes=" + lignes +
                '}';
    }
}
