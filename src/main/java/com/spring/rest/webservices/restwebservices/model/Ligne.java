package com.spring.rest.webservices.restwebservices.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Size;


@ApiModel(description = "All details about the user")
@Entity
public class Ligne {

    @Id
    @GeneratedValue
    private int id;


    @Size(min=2, message = "departure should have at least 2 characters")
    @ApiModelProperty(notes = "departure should have at least 2 characters")
    private String departure;
    @Size(min=2, message = " arrival should have at least 2 characters")
    @ApiModelProperty(notes = "arrival should have at least 2 characters")
    private String arrival;

    private int maxSection;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore
    private Reseau reseau;

    protected  Ligne(){

    }

    public Ligne(@Size(min = 2, message = "departure should have at least 2 characters") String departure, @Size(min = 2, message = " arrival should have at least 2 characters") String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
