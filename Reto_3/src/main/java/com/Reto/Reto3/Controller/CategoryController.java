
package com.Reto.Reto3.Controller;

import com.Reto.Reto3.Services.CategoryService;
import com.Reto.Reto3.model.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Category")
public class CategoryController {
    
  @Autowired
    private CategoryService categoryService;
    
    
    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
        
                
    }
    @PostMapping("/save")
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
}
