package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.Role;
import ma.emsi.services.RoleService;

@RestController
@RequestMapping(value = "/api/roles")
public class RoleController {
	
	@Autowired
    private RoleService roleService;
	
	@PostMapping(value = "/save")
    public Role save(@RequestBody Role object) {
        System.out.println("Saving Role: " + object); // Log the received object
        return roleService.save(object);
    }
    
    @PutMapping(value = "/update/{id}")
    public Role update(@PathVariable int id, @RequestBody Role object) {
        System.out.println("Updating Role ID " + id + ": " + object); // Log the received object and ID
        return roleService.update(id, object);
    }
    
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable int id) {
        System.out.println("Deleting Role ID " + id); // Log the ID of the object to be deleted
        roleService.delete(id);
    }
    
    @GetMapping(value = "/{id}")
    public Role findById(@PathVariable int id) {
        return roleService.findById(id);
    }
    
    @GetMapping(value = "")
    public List<Role> findAll() {
        return roleService.findAll();
    }

}
