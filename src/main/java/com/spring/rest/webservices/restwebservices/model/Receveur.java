package com.spring.rest.webservices.restwebservices.model;


import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.*;
import java.util.Date;

//@Entity
//@Immutable
//@Table(name = "user")
//public class ReceveurRepository extends User { }


@Entity
public class Receveur {

    @Id
    @GeneratedValue
    public int id;

    private String nom;
    private String prenom;
    private String adresse;
    private String nomGie;
    private String email;
    private String identifiant;
    private java.util.Date Date;
    private String commentaire;
    private String  codeVendeur;
    private String numeroTelephone;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "receveur_id", nullable = false)
    private Bus bus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNomGie() {
        return nomGie;
    }

    public void setNomGie(String nomGie) {
        this.nomGie = nomGie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getCodeVendeur() {
        return codeVendeur;
    }

    public void setCodeVendeur(String codeVendeur) {
        this.codeVendeur = codeVendeur;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Receveur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nomGie='" + nomGie + '\'' +
                ", email='" + email + '\'' +
                ", identifiant='" + identifiant + '\'' +
                ", Date=" + Date +
                ", commentaire='" + commentaire + '\'' +
                ", codeVendeur='" + codeVendeur + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", bus=" + bus +
                '}';
    }
}
