package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.Diplome;
import ma.emsi.services.DiplomeService;

@RestController
@RequestMapping(value = "/api/diplomes")
public class DiplomeController {
	
	@Autowired
	private DiplomeService diplomeService;

	@PostMapping(value = "/save")
	public Diplome save(@RequestBody Diplome object) {
		System.out.println("Saving Diplome: " + object); // Log the received object
		return diplomeService.save(object);
	}
	
	@PutMapping(value = "/update/{id}")
	public Diplome update(@PathVariable int id, @RequestBody Diplome object) {
		System.out.println("Updating Diplome ID " + id + ": " + object); // Log the received object and ID
		return diplomeService.update(id, object);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("Deleting Diplome ID " + id); // Log the ID of the object to be deleted
		diplomeService.delete(id);
	}
	
	@GetMapping(value = "/{id}")
	public Diplome findById(@PathVariable int id) {
		return diplomeService.findById(id);
	}
	
	@GetMapping(value = "")
	public List<Diplome> findAll() {
		return diplomeService.findAll();
	}
	
	


	
	

}
