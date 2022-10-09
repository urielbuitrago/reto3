package com.Reto.Reto3.Services;

import com.Reto.Reto3.Repository.ReservationRepository;
import com.Reto.Reto3.model.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationRepository;
    
    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }
         public Optional<Reservation> getReservation(int idReservation){
        return reservationRepository.getReservation(idReservation);
    }
    
         public Reservation save(Reservation reservation){
        if (reservation.getIdReservation()== null) {
             return reservationRepository.save(reservation);
           }else{
            Optional<Reservation>Reservation1= reservationRepository.getReservation(reservation.getIdReservation());
            if (Reservation1.isPresent()){
                return reservationRepository.save(reservation);
            }else{
                return reservation;
            }
        }
    }
    
    public Reservation update(Reservation reservation){
        if (reservation.getIdReservation()!=null) {
            Optional<Reservation>q=reservationRepository.getReservation(reservation.getIdReservation());
            if (!q.isPresent()) {
                if (reservation.getIdReservation()!=null){
                    q.get().setIdReservation(reservation.getIdReservation());
                }
                if (reservation.getStartDate()!=null) {
                    q.get().setStartDate(reservation.getStartDate());
                }
                if (reservation.getDevolutionDate()!=null) {
                    q.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if (reservation.getStatus()!=null) {
                    q.get().setStatus(reservation.getStatus());
                }
                return reservationRepository.save(q.get());
                
            }
            
        }
        return reservation;
    }
    
}
