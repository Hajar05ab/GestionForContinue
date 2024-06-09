package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.Abscence;
import ma.emsi.services.AbscenceService;

@RestController
@RequestMapping(value = "/api/abscences")
public class AbscenceController {
	
	@Autowired
	private AbscenceService abscenceService;
	
	@PostMapping(value = "/save")
	public Abscence save(@RequestBody Abscence object) {
		System.out.println("Saving Abscence: " + object); // Log the received object
		return abscenceService.save(object);
	}
	
	@PutMapping(value = "/update/{id}")
	public Abscence update(@PathVariable int id, @RequestBody Abscence object) {
		System.out.println("Updating Abscence ID " + id + ": " + object); // Log the received object and ID
		return abscenceService.update(id, object);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("Deleting Abscence ID " + id); // Log the ID of the object to be deleted
		abscenceService.delete(id);
	}
	
	@GetMapping(value = "/{id}")
	public Abscence findById(@PathVariable int id) {
		return abscenceService.findById(id);
	}
	
	@GetMapping(value = "")
	public List<Abscence> findAll() {
		return abscenceService.findAll();
	}
	
	
	
	
	
	
	
	
	
	



	
	
	

}
