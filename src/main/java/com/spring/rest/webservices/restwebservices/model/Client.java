package com.spring.rest.webservices.restwebservices.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@ApiModel(description = "All details about the Client")
@Entity
@Table(name = "user")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String identifiant;
    private String commentaire;
    private String numeroTelephone;
    private Date dateCreation;
    private String nomGie;

    @OneToMany(mappedBy = "client")
    private Set<Bus> buses = new HashSet<Bus>();

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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNomGie() {
        return nomGie;
    }

    public void setNomGie(String nomGie) {
        this.nomGie = nomGie;
    }

    public Set<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Set<Bus> buses) {
        this.buses = buses;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", identifiant='" + identifiant + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", dateCreation=" + dateCreation +
                ", nomGie='" + nomGie + '\'' +
                ", buses=" + buses +
                '}';
    }
}
