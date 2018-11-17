package com.spring.rest.webservices.restwebservices.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bus {

    @Id
    @GeneratedValue
    private int id;


    private  String Immatricul;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore
    private Client client;


    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "bus")
    private Receveur receveur;


    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "bus")
    private Chauffeur chauffeur;

    @ManyToMany
    @JoinTable(name = "bus_ligne",
            joinColumns = { @JoinColumn(name = "fk_bus") },
            inverseJoinColumns = { @JoinColumn(name = "fk_ligne") })
    private Set<Ligne> ligne = new HashSet<Ligne>();



    private  String NoSerieAppareil;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_reseau")
    private Reseau reseau;

    @OneToMany(mappedBy = "bus")
    private Set<Ticket> ticketList =  new HashSet<Ticket>();

    @OneToMany(mappedBy = "bus")
    private Set<Trajet> trajetList  = new HashSet<Trajet>();


    protected Bus(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoSerieAppareil() {
        return NoSerieAppareil;
    }

    public void setNoSerieAppareil(String noSerieAppareil) {
        NoSerieAppareil = noSerieAppareil;
    }

    public String getImmatricul() {
        return Immatricul;
    }

    public void setImmatricul(String immatricul) {
        Immatricul = immatricul;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    public Receveur getReceveur() {
        return receveur;
    }

    public void setReceveur(Receveur receveur) {
        this.receveur = receveur;
    }

    public Set<Ligne> getLigne() {
        return ligne;
    }

    public void setLigne(Set<Ligne> ligne) {
        this.ligne = ligne;
    }

    public Reseau getReseau() {
        return reseau;
    }

    public void setReseau(Reseau reseau) {
        this.reseau = reseau;
    }

    public Set<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(Set<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public Set<Trajet> getTrajetList() {
        return trajetList;
    }

    public void setTrajetList(Set<Trajet> trajetList) {
        this.trajetList = trajetList;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", Immatricul='" + Immatricul + '\'' +
                ", client=" + client +
                ", receveur=" + receveur +
                ", chauffeur=" + chauffeur +
                ", ligne=" + ligne +
                ", NoSerieAppareil='" + NoSerieAppareil + '\'' +
                ", reseau=" + reseau +
                ", ticketList=" + ticketList +
                ", trajetList=" + trajetList +
                '}';
    }
}
