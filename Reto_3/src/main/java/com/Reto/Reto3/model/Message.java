/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Reto.Reto3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


 @Entity
@Table(name = "Message")
public class Message implements Serializable {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private  Integer idMessage;
    @Column(name = "Category",length = 50,nullable = false,unique = true)
    private String messagerText;

    @ManyToOne
    @JoinColumn(name = "idMotorbike")
    @JsonIgnoreProperties("message")
    private Motorbike motorbike;
    
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("message")
    private Client client;

    
    
   
    
    
    
    

    public Message(Motorbike motorbike) {
        this.motorbike = motorbike;
    }

    public Message(Client client) {
        this.client = client;
    }

    
    
    public Message() {
    }

    public Message(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public Message(Integer idMessage, String messagerText) {
        this.idMessage = idMessage;
        this.messagerText = messagerText;
    }

    
    
    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessagerText() {
        return messagerText;
    }

    public void setMessagerText(String messagerText) {
        this.messagerText = messagerText;
    }

    public Motorbike getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(Motorbike motorbike) {
        this.motorbike = motorbike;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

   
    
    
    
}
