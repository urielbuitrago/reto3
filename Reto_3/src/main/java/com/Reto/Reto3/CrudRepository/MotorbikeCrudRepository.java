
package com.Reto.Reto3.CrudRepository;

import com.Reto.Reto3.model.Motorbike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorbikeCrudRepository extends CrudRepository<Motorbike, Integer>{
    
}
