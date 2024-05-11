package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Abscence;
import ma.emsi.services.AbscenceService;

@RestController
@RequestMapping(value = "/api/abscences")
public class AbscenceController {
	
	@Autowired
	private AbscenceService abscenceService;
	
	@PostMapping(value = "/save")
	public Abscence save(Abscence object) {
		return abscenceService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Abscence update(Abscence object) {
		return abscenceService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Abscence object) {
		abscenceService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Abscence findById(int id) {
		return abscenceService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Abscence> findAll() {
		return abscenceService.findAll();
	}
	
	
	
	
	
	
	
	
	
	



	
	
	

}
