package ma.emsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Affectation;
import ma.emsi.entities.ForContinue;
import ma.emsi.repositories.AffectationRep;

@Service
public class AffectationService implements DAO<Affectation> {
	
	@Autowired
	private AffectationRep affectationRep;

	 @Override
	    public Affectation save(Affectation object) {
	        System.out.println("Saving in Service: " + object); // Log the object being saved
	        return this.affectationRep.save(object);
	    }

	    @Override
	    public Affectation update(int id, Affectation object) {
	        object.setId(id);
	        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
	        return this.affectationRep.save(object);
	    }

	    @Override
	    public void delete(int id) {
	        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
	        this.affectationRep.deleteById(id);
	    }

	    @Override
	    public Affectation findById(int id) {
	        Optional<Affectation> optional = this.affectationRep.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<Affectation> findAll() {
	        return this.affectationRep.findAll();
	    }
	

	
	
	


	
	
}
