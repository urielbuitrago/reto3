
package com.Reto.Reto3.Services;

import com.Reto.Reto3.Repository.ScoreRepository;
import com.Reto.Reto3.model.Score;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






@Service
public class ScoreService {
     
    @Autowired
    private ScoreRepository scoreRepository;
    
    public List<Score> getAll(){
        return scoreRepository.getAll();
    }
    
    public Optional<Score> getScore(int idScore){
        return scoreRepository.getScore(idScore);
    }
    
    public Score save(Score score){
        if (score.getIdScore()== null) {
             return scoreRepository.save(score);
           }else{
            Optional<Score>Score1= scoreRepository.getScore(score.getIdScore());
            if (Score1.isPresent()){
                return scoreRepository.save(score);
            }else{
                return score;
            }
        }
    }
    
    public Score update(Score score){
        if (score.getIdScore()!=null) {
            Optional<Score>q=scoreRepository.getScore(score.getIdScore());
            if (!q.isPresent()) {
                if (score.getIdScore()!=null){
                    q.get().setIdScore(score.getIdScore());
                }
                if (score.getMessageTex()!=null) {
                    q.get().setMessageTex(score.getMessageTex());
                }
                if (score.getStars()!=null){
                    q.get().setStars(score.getStars());
                }
                return scoreRepository.save(q.get());
            }
            
        }
        return score;
    }
    
}
