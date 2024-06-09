package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.ForContinue;
import ma.emsi.services.ForContinueService;

@RestController
@RequestMapping(value = "/api/forContinues")
public class ForContinueController {
    
    @Autowired
    private ForContinueService forContinueService;

    @PostMapping(value = "/save")
    public ForContinue save(@RequestBody ForContinue object) {
        System.out.println("Saving ForContinue: " + object); // Log the received object
        return forContinueService.save(object);
    }
    
    @PutMapping(value = "/update/{id}")
    public ForContinue update(@PathVariable int id, @RequestBody ForContinue object) {
        System.out.println("Updating ForContinue ID " + id + ": " + object); // Log the received object and ID
        return forContinueService.update(id, object);
    }
    
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable int id) {
        System.out.println("Deleting ForContinue ID " + id); // Log the ID of the object to be deleted
        forContinueService.delete(id);
    }
    
    @GetMapping(value = "/{id}")
    public ForContinue findById(@PathVariable int id) {
        return forContinueService.findById(id);
    }
    
    @GetMapping(value = "")
    public List<ForContinue> findAll() {
        return forContinueService.findAll();
    }
}
