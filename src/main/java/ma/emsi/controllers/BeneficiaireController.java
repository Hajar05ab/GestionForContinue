package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entities.Beneficiaire;
import ma.emsi.services.BeneficiaireService;

@RestController
@RequestMapping(value = "/api/beneficiaires")
public class BeneficiaireController {
	
	@Autowired
	private BeneficiaireService beneficiaireService;

	@PostMapping(value = "/save")
	public Beneficiaire save(Beneficiaire object) {
		return beneficiaireService.save(object);
	}
	
	@PutMapping(value = "/update")
	public Beneficiaire update(Beneficiaire object) {
		return beneficiaireService.update(object);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(Beneficiaire object) {
		beneficiaireService.delete(object);
	}
	
	@GetMapping(value = "/{id}")
	public Beneficiaire findById(int id) {
		return beneficiaireService.findById(id);
	}
	
	@GetMapping(value = "/")
	public List<Beneficiaire> findAll() {
		return beneficiaireService.findAll();
	}
	
	

	
	
	

}
