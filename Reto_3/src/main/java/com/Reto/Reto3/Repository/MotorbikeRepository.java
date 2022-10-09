
package com.Reto.Reto3.Repository;


import com.Reto.Reto3.CrudRepository.MotorbikeCrudRepository;
import com.Reto.Reto3.model.Motorbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MotorbikeRepository {
    
    
     @Autowired
   private MotorbikeCrudRepository motorbikeCrudRepository;
 
   public List<Motorbike> getAll(){
       return (List<Motorbike>)motorbikeCrudRepository.findAll();
   }
 
   public Optional<Motorbike> getMotorbike(int idMotorbike){
       return motorbikeCrudRepository.findById(idMotorbike);
   }
    
   public Motorbike save(Motorbike motorbike){
       return motorbikeCrudRepository.save(motorbike);
   }
   
   public void delete(Motorbike motorbike){
       motorbikeCrudRepository.delete(motorbike);
   }
    
}
