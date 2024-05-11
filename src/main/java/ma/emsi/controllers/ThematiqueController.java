package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Thematique;
import ma.emsi.services.ThematiqueService;

@RestController
@RequestMapping(value = "/api/thematiques")
public class ThematiqueController {
	
	@Autowired
	private ThematiqueService thematiqueService;

	@PostMapping(value = "/save")
	public Thematique save(Thematique object) {
		return thematiqueService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Thematique update(Thematique object) {
		return thematiqueService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Thematique object) {
		thematiqueService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Thematique findById(int id) {
		return thematiqueService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Thematique> findAll() {
		return thematiqueService.findAll();
	}
	
	

	
	
	

}
