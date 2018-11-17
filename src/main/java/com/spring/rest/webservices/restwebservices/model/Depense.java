package com.spring.rest.webservices.restwebservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Depense {


    @Id
    @GeneratedValue
    private int id;


    private String carburant;
    private String lavage;
    private String stationnement;
    private String depannage;
    private String ration;
    private String gardiennage;
    private String divers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public String getLavage() {
        return lavage;
    }

    public void setLavage(String lavage) {
        this.lavage = lavage;
    }

    public String getStationnement() {
        return stationnement;
    }

    public void setStationnement(String stationnement) {
        this.stationnement = stationnement;
    }

    public String getDepannage() {
        return depannage;
    }

    public void setDepannage(String depannage) {
        this.depannage = depannage;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getGardiennage() {
        return gardiennage;
    }

    public void setGardiennage(String gardiennage) {
        this.gardiennage = gardiennage;
    }

    public String getDivers() {
        return divers;
    }

    public void setDivers(String divers) {
        this.divers = divers;
    }

    @Override
    public String toString() {
        return "Depense{" +
                "id=" + id +
                ", carburant='" + carburant + '\'' +
                ", lavage='" + lavage + '\'' +
                ", stationnement='" + stationnement + '\'' +
                ", depannage='" + depannage + '\'' +
                ", ration='" + ration + '\'' +
                ", gardiennage='" + gardiennage + '\'' +
                ", divers='" + divers + '\'' +
                '}';
    }
}
