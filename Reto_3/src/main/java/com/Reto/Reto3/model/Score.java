
package com.Reto.Reto3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "score")
public class Score implements Serializable {
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idScore;
   @Column(name = "score",length = 50,nullable = false,unique = true)
   private String messageTex;
   private Integer stars;
   
   @OneToOne
   @JsonIgnoreProperties("score")
   private Reservation reservation;

    public Score() {
    }

    public Score(Integer idScore, String messageTex, Integer stars, Reservation reservation) {
        this.idScore = idScore;
        this.messageTex = messageTex;
        this.stars = stars;
        this.reservation = reservation;
    }
   
   

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public String getMessageTex() {
        return messageTex;
    }

    public void setMessageTex(String messageTex) {
        this.messageTex = messageTex;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
   
   
   
    
}
