
package com.Reto.Reto3.CrudRepository;

import com.Reto.Reto3.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminCrudRepository extends CrudRepository<Admin, Integer>{
    
}
    

