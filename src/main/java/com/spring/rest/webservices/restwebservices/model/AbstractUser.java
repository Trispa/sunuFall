//package com.spring.rest.webservices.restwebservices.model;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//
//import javax.persistence.*;
//import javax.validation.constraints.Past;
//import javax.validation.constraints.Size;
//
//
//@ApiModel(description = "All details about the user")
//
//@MappedSuperclass
//public class AbstractUser {
//
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//
//    @Size(min=2, message = "Name should have at least 2 characters")
//    @ApiModelProperty (notes = "First Name should have at least 2 characters")
//    private String nom;
//
//    @Size(min=2, message = "Name should have at least 2 characters")
//    @ApiModelProperty (notes = "First Name should have at least 2 characters")
//    private String prenom;
//
//    @Size(min=2, message = "Name should have at least 2 characters")
//    @ApiModelProperty (notes = "First Name should have at least 2 characters")
//    private String Adresse;
//
//    @Size(min=2, message = "Name should have at least 2 characters")
//    @ApiModelProperty (notes = "First Name should have at least 2 characters")
//    private String Email;
//
//    @Size(min=2, message = "Name should have at least 2 characters")
//    @ApiModelProperty (notes = "First Name should have at least 2 characters")
//    private String Identifiant;
//
//
//    Adresse
//            Email
//    Identifiant
//            MotDePasse
//    Commentaire
//            NumeroTelephone
//    Date
//            NomGie
//
//    @Size(min=2, message = "Name should have at least 2 characters")
//    @ApiModelProperty (notes = "First Name should have at least 2 characters")
//    private String firstName;
//    @Size(min=2, message = "Name should have at least 2 characters")
//    @ApiModelProperty (notes = "Last Name should have at least 2 characters")
//    private String LastName;
//
//    private String phoneNumber;
//
//
//    protected AbstractUser(){
//
//    }
//    public AbstractUser(Integer id, String name, String phoneNumber) {
//        this.id = id;
//        this.firstName = name;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return firstName;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return LastName;
//    }
//
//    public void setLastName(String lastName) {
//        LastName = lastName;
//    }
//
//    @Override
//    public String toString() {
//        return "AbstractUser{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", LastName='" + LastName + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
//}
