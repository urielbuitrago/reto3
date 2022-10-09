/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Reto.Reto3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
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

@Entity
@Table(name = "Client")
public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    @Column(name = "nombre",length = 50,nullable = false,unique = true)
    private String name;
    private String email;
    private String password;
    private Integer age;
    
    @OneToMany(cascade = (CascadeType.PERSIST), mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Message> messages;
    
    @OneToMany(cascade = (CascadeType.PERSIST), mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Reservation> reservations;

   
   
    
    
    

    public Client(List<Message> messages) {
        this.messages = messages;
    }
    
    
    

    public Client() {
    }
    

    public Client(Integer idClient) {
        this.idClient = idClient;
    }

    public Client(Integer idClient, String name, String mail, String password, Integer age) {
        this.idClient = idClient;
        this.name = name;
        this.email = mail;
        this.password = password;
        this.age = age;
    }
    
    
    
    

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return getEmail();
    }

    public void setMail(String mail) {
        this.setEmail(mail);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
            
    
}
