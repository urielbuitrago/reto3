/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Reto.Reto3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.Year;
import java.util.List;
import java.util.Locale;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author puchungos
 */

@Entity
@Table(name = "Motorbike")
public class Motorbike implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private  Integer idMotorbike;
    @Column(name = "Motorbike",length = 50,nullable = false,unique = true)
    private String brand;
    private Year year;
    private Integer Category;
    private String name;
    private String description;

   
    @OneToMany(cascade = (CascadeType.PERSIST))
    @JsonIgnoreProperties({"idMotorbike","client"})
    private List<Message> message;
    
    @ManyToOne
    @JoinColumn(name = "categoryId" )
    @JsonIgnoreProperties("motorbike")
    private Category category;
    
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "motorbike")
    @JsonIgnoreProperties({"motorbike","message"})
    private List<Reservation> reservations;
    

    public Motorbike(Category category) {
        this.category = category;
    }

    public Motorbike(List<Reservation> reservations) {
        this.reservations = reservations;
    }
     
    

    public Motorbike() {
    }

    public Motorbike(Integer idMotorbike) {
        this.idMotorbike = idMotorbike;
    }

    public Motorbike(Integer idMotorbike, String brand, String name, Year year, String description, Integer category) {
        this.idMotorbike = idMotorbike;
        this.brand = brand;
        this.name = name;
        this.year = year;
        this.description = description;
        this.Category = category;
    }
    
    

    public Integer getIdMotorbike() {
        return idMotorbike;
    }

    public void setIdMotorbike(Integer idMotorbike) {
        this.idMotorbike = idMotorbike;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategory() {
        return Category;
    }

    public void setCategory(Integer category) {
        this.Category = category;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

   


    }
    
    
    
    

    
