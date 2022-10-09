
package com.Reto.Reto3.Controller;

import com.Reto.Reto3.Services.ReservationService;
import com.Reto.Reto3.model.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/Reservation")
public class ReservationController {
    
    @Autowired
    
    private ReservationService reservationService;
    
     @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
        
                
    }
    @PostMapping("/save")
    public Reservation save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }
    
}
