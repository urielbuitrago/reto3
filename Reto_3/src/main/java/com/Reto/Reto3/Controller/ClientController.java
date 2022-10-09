
package com.Reto.Reto3.Controller;

import com.Reto.Reto3.Services.ClientService;
import com.Reto.Reto3.model.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/Client")
public class ClientController {
    
      
  @Autowired
    private ClientService clientService;
    
    
    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
        
                
    }
    @PostMapping("/save")
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }
    
}
