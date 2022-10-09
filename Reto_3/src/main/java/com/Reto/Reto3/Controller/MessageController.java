
package com.Reto.Reto3.Controller;

import com.Reto.Reto3.Repository.MessageRepository;
import com.Reto.Reto3.model.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/Message")
public class MessageController {
    
    @Autowired
    private MessageRepository messageRepository;
    
    
    @GetMapping("/all")
    public List<Message> getAll(){
        return messageRepository.getAll();
        
                
    }
    @PostMapping("/save")
    public Message save(@RequestBody Message message){
        return messageRepository.save(message);
    }
}
