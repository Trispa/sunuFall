package com.spring.rest.webservices.restwebservices.model;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Chauffeur {


    @Id
    @GeneratedValue
    private int Id;

    private String permitId;

    private String nom;
    private String prenom;
    private String adresse;
    private String nomGie;
    private String email;
    private String identifiant;
    private Date Date;
    private String commentaire;
    private String numeroPermis;
    private String numeroTelephone;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "chauffeur_id", nullable = false)
    private Bus bus;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getPermitId() {
        return permitId;
    }

    public void setPermitId(String permitId) {
        this.permitId = permitId;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Chauffeur{" +
                "Id=" + Id +
                ", permitId='" + permitId + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nomGie='" + nomGie + '\'' +
                ", email='" + email + '\'' +
                ", identifiant='" + identifiant + '\'' +
                ", Date=" + Date +
                ", commentaire='" + commentaire + '\'' +
                ", numeroPermis='" + numeroPermis + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", bus=" + bus +
                '}';
    }
}
