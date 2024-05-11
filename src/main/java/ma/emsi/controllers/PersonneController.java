package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Personne;
import ma.emsi.services.PersonneService;

@RestController
@RequestMapping(value = "/api/personnes")
public class PersonneController {
	
	@Autowired
	private PersonneService personneService;

	@PostMapping(value = "/save")
	public Personne save(Personne object) {
		return personneService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Personne update(Personne object) {
		return personneService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Personne object) {
		personneService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Personne findById(int id) {
		return personneService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Personne> findAll() {
		return personneService.findAll();
	}
	
	

	
	
	

}
