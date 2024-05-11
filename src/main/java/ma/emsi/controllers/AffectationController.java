package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Affectation;
import ma.emsi.services.AffectationService;

@RestController
@RequestMapping(value = "/api/affectations")
public class AffectationController {
	
	@Autowired
	private AffectationService affectationService;

	@PostMapping(value = "/save")
	public Affectation save(Affectation object) {
		return affectationService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Affectation update(Affectation object) {
		return affectationService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Affectation object) {
		affectationService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Affectation findById(int id) {
		return affectationService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Affectation> findAll() {
		return affectationService.findAll();
	}
	
	

	
	
	

}
