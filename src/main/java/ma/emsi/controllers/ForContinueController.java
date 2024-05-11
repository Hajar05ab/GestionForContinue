package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.ForContinue;
import ma.emsi.services.ForContinueService;

@RestController
@RequestMapping(value = "/api/forContinues")
public class ForContinueController {
	
	@Autowired
	private ForContinueService forContinueService;

	@PostMapping(value = "/save")
	public ForContinue save(ForContinue object) {
		return forContinueService.save(object);
	}
	
	@PutMapping(value = "/update")
	public ForContinue update(ForContinue object) {
		return forContinueService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(ForContinue object) {
		forContinueService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public ForContinue findById(int id) {
		return forContinueService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<ForContinue> findAll() {
		return forContinueService.findAll();
	}
	
	

	
	
	

}
