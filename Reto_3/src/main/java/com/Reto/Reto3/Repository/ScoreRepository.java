
package com.Reto.Reto3.Repository;


import com.Reto.Reto3.CrudRepository.ScoreCrudRepository;
import com.Reto.Reto3.model.Score;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepository {
    
     @Autowired
   private ScoreCrudRepository scoreCrudRepository;
 
   public List<Score> getAll(){
       return (List<Score>)scoreCrudRepository.findAll();
   }
 
   public Optional<Score> getScore(int idScore){
       return scoreCrudRepository.findById(idScore);
   }
    
   public Score save(Score score){
       return scoreCrudRepository.save(score);
   }
   
   public void delete(Score score){
       scoreCrudRepository.delete(score);
   }
}
