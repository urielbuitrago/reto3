package com.Reto.Reto3.Controller;



import com.Reto.Reto3.Services.MotorbikeService;
import com.Reto.Reto3.model.Motorbike;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/Motorbike")
public class MotorbikeController {
 
      @Autowired
    private MotorbikeService motorbikeService;
    
    
    @GetMapping("/all")
    public List<Motorbike> getAll(){
        return motorbikeService.getAll();
        
                
    }
    @PostMapping("/save")
    public Motorbike save(@RequestBody Motorbike motorbike){
        return motorbikeService.save(motorbike);
    }
}
