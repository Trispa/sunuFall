package com.spring.rest.webservices.restwebservices.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
public class Ticket {


    @Id
    @GeneratedValue
    private int  id;

    private String price;


    @ApiModelProperty(notes = "Birth date should be in the past")
    private Date issueDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_bus")
    private Bus bus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_receveur")
    private Receveur receveur;


    private String statut;
    private String emission;
    private String noTicket;
    private String tarif;
    private String section;
    private String montant;
    private String direction;
    private String position;

    private Date dateCreations;

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public String getNoTicket() {
        return noTicket;
    }

    public void setNoTicket(String noTicket) {
        this.noTicket = noTicket;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateCreations() {
        return dateCreations;
    }

    public void setDateCreations(Date dateCreations) {
        this.dateCreations = dateCreations;
    }

    protected Ticket(){

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Receveur getReceveur() {
        return receveur;
    }

    public void setReceveur(Receveur receveur) {
        this.receveur = receveur;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price='" + price + '\'' +
                ", issueDate=" + issueDate +
                ", statut='" + statut + '\'' +
                ", emission='" + emission + '\'' +
                ", noTicket='" + noTicket + '\'' +
                ", tarif='" + tarif + '\'' +
                ", section='" + section + '\'' +
                ", montant='" + montant + '\'' +
                ", direction='" + direction + '\'' +
                ", position='" + position + '\'' +
                ", dateCreations=" + dateCreations +
                '}';
    }
}
