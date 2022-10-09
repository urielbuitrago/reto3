
package com.Reto.Reto3.Repository;


import com.Reto.Reto3.CrudRepository.ClientCrudRepository;
import com.Reto.Reto3.model.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ClientRepository {
    
     @Autowired
   private ClientCrudRepository clientCrudRepository;
 
   public List<Client> getAll(){
       return (List<Client>)clientCrudRepository.findAll();
   }
 
   public Optional<Client> getClien(int idClient){
       return clientCrudRepository.findById(idClient);
   }
    
   public Client save(Client client){
       return clientCrudRepository.save(client);
   }
   
   public void delete(Client client){
       clientCrudRepository.delete(client);
   }
}
