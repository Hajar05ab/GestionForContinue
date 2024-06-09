package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.Beneficiaire;
import ma.emsi.services.BeneficiaireService;

@RestController
@RequestMapping(value = "/api/beneficiaires")
public class BeneficiaireController {
	
	@Autowired
	private BeneficiaireService beneficiaireService;

	@PostMapping(value = "/save")
	public Beneficiaire save(@RequestBody Beneficiaire object) {
		System.out.println("Saving Beneficiaire: " + object); // Log the received object
		return beneficiaireService.save(object);
	}
	
	@PutMapping(value = "/update/{id}")
	public Beneficiaire update(@PathVariable int id, @RequestBody Beneficiaire object) {
		System.out.println("Updating Beneficiaire ID " + id + ": " + object); // Log the received object and ID
		return beneficiaireService.update(id, object);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("Deleting Beneficiaire ID " + id); // Log the ID of the object to be deleted
		beneficiaireService.delete(id);
	}
	
	@GetMapping(value = "/{id}")
	public Beneficiaire findById(@PathVariable int id) {
		return beneficiaireService.findById(id);
	}
	
	@GetMapping(value = "")
	public List<Beneficiaire> findAll() {
		return beneficiaireService.findAll();
	}
	
	

	
	
	

}
