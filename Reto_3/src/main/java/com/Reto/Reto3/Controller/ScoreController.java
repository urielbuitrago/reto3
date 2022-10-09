
package com.Reto.Reto3.Controller;

import com.Reto.Reto3.Services.ScoreService;
import com.Reto.Reto3.model.Score;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/Score")
public class ScoreController {
    
    @Autowired
    
    private ScoreService scoreService;
    
    
    @GetMapping("/all")
    public List<Score> getAll(){
        return scoreService.getAll();
        
                
    }
    @PostMapping("/save")
    public Score save(@RequestBody Score score){
        return scoreService.save(score);
    }
}
