package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.Thematique;
import ma.emsi.services.ThematiqueService;

@RestController
@RequestMapping(value = "/api/thematiques")
public class ThematiqueController {
	
	@Autowired
	private ThematiqueService thematiqueService;

	@PostMapping(value = "/save")
	public Thematique save(@RequestBody Thematique object) {
		System.out.println("Saving Thematique: " + object); // Log the received object
		return thematiqueService.save(object);
	}
	
	@PutMapping(value = "/update/{id}")
	public Thematique update(@PathVariable int id, @RequestBody Thematique object) {
		System.out.println("Updating Thematique ID " + id + ": " + object); // Log the received object and ID
		return thematiqueService.update(id, object);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("Deleting Thematique ID " + id); // Log the ID of the object to be deleted
		thematiqueService.delete(id);
	}
	
	@GetMapping(value = "/{id}")
	public Thematique findById(@PathVariable int id) {
		return thematiqueService.findById(id);
	}
	
	@GetMapping(value = "")
	public List<Thematique> findAll() {
		return thematiqueService.findAll();
	}
	
	

	
	
	

}
