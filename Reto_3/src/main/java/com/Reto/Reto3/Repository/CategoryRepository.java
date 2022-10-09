
package com.Reto.Reto3.Repository;


import com.Reto.Reto3.CrudRepository.CategoryCrudRepository;
import com.Reto.Reto3.model.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CategoryRepository {
    
     @Autowired
   private CategoryCrudRepository categoryCrudRepository;
 
   public List<Category> getAll(){
       return (List<Category>)categoryCrudRepository.findAll();
   }
 
   public Optional<Category> getCategory(int idCategory){
       return categoryCrudRepository.findById(idCategory);
   }
    
   public Category save(Category category){
       return categoryCrudRepository.save(category);
   }
   
   public void delete(Category category){
       categoryCrudRepository.delete(category);
   }

   
}
