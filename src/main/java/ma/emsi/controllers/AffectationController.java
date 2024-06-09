package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.Affectation;
import ma.emsi.services.AffectationService;

@RestController
@RequestMapping(value = "/api/affectations")
public class AffectationController {
	
	@Autowired
	private AffectationService affectationService;

	@PostMapping(value = "/save")
	public Affectation save(@RequestBody Affectation object) {
		System.out.println("Saving Affectation: " + object); // Log the received object
		return affectationService.save(object);
	}
	
	@PutMapping(value = "/update/{id}")
	public Affectation update(@PathVariable int id, @RequestBody Affectation object) {
		System.out.println("Updating Affectation ID " + id + ": " + object); // Log the received object and ID
		return affectationService.update(id, object);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("Deleting Affectation ID " + id); // Log the ID of the object to be deleted
		affectationService.delete(id);
	}
	
	@GetMapping(value = "/{id}")
	public Affectation findById(@PathVariable int id) {
		return affectationService.findById(id);
	}
	
	@GetMapping(value = "")
	public List<Affectation> findAll() {
		return affectationService.findAll();
	}
	
	

	
	
	

}
