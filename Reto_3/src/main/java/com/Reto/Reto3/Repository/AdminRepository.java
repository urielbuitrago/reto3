
package com.Reto.Reto3.Repository;


import com.Reto.Reto3.CrudRepository.AdminCrudRepository;
import com.Reto.Reto3.model.Admin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AdminRepository {
    
   @Autowired
   private AdminCrudRepository adminCrudRepository;
 
   public List<Admin> getAll(){
       return (List<Admin>)adminCrudRepository.findAll();
   }
 
   public Optional<Admin> getAdmin(int idAdmin){
       return adminCrudRepository.findById(idAdmin);
   }
    
   public Admin save(Admin admin){
       return adminCrudRepository.save(admin);
   }
   
   public void delete(Admin admin){
       adminCrudRepository.delete(admin);
   }
}
