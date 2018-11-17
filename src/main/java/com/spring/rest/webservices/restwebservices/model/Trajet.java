package com.spring.rest.webservices.restwebservices.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Trajet {

    @Id
    @GeneratedValue
    private  int id;

    private Date heuredepart;
    private Date heureArrive;
    private String position;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore
    private Bus bus;
}
