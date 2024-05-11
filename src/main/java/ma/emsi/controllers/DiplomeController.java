package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Diplome;
import ma.emsi.services.DiplomeService;

@RestController
@RequestMapping(value = "/api/diplomes")
public class DiplomeController {
	
	@Autowired
	private DiplomeService diplomeService;

	@PostMapping(value = "/save")
	public Diplome save(Diplome object) {
		return diplomeService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Diplome update(Diplome object) {
		return diplomeService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Diplome object) {
		diplomeService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Diplome findById(int id) {
		return diplomeService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Diplome> findAll() {
		return diplomeService.findAll();
	}
	
	


	
	

}
