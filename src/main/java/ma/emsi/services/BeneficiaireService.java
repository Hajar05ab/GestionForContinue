package ma.emsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Beneficiaire;
import ma.emsi.repositories.BeneficiaireRep;

@Service
public class BeneficiaireService implements DAO<Beneficiaire> {
	
	@Autowired
	private BeneficiaireRep beneficiaireRep;

	 @Override
	    public Beneficiaire save(Beneficiaire object) {
	        System.out.println("Saving in Service: " + object); // Log the object being saved
	        return this.beneficiaireRep.save(object);
	    }

	    @Override
	    public Beneficiaire update(int id, Beneficiaire object) {
	        object.setId(id);
	        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
	        return this.beneficiaireRep.save(object);
	    }

	    @Override
	    public void delete(int id) {
	        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
	        this.beneficiaireRep.deleteById(id);
	    }

	    @Override
	    public Beneficiaire findById(int id) {
	        Optional<Beneficiaire> optional = this.beneficiaireRep.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<Beneficiaire> findAll() {
	        return this.beneficiaireRep.findAll();
	    }

	
	
	

	
	
	

}
