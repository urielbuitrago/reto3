
package com.Reto.Reto3.Services;

import com.Reto.Reto3.Repository.MessageRepository;
import com.Reto.Reto3.model.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasaggeService {
    
    @Autowired
    private MessageRepository messageRepository;
    
    public List<Message> getAll(){
        return messageRepository.getAll();
    }
    
    public Optional<Message> getClien(int idMessage){
        return messageRepository.getMessage(idMessage);
    }
    
    public Message save(Message message){
        if (message.getIdMessage()== null) {
             return messageRepository.save(message);
           }else{
            Optional<Message>messgge1= messageRepository.getMessage(message.getIdMessage());
            if (messgge1.isPresent()){
                return messageRepository.save(message);
            }else{
                return message;
            }
        }
    }
    
    public Message update(Message message){
        if (message.getIdMessage()!=null) {
            Optional<Message>q=messageRepository.getMessage(message.getIdMessage());
            if (!q.isPresent()) {
                if (message.getIdMessage()!=null){
                    q.get().setIdMessage(message.getIdMessage());
                }
                if (message.getMessagerText()!=null) {
                    q.get().setMessagerText(message.getMessagerText());
                }
                return messageRepository.save(q.get());
                
            }
            
        }
        return message;
    }
}
