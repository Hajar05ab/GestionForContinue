package ma.emsi.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Abscence;
import ma.emsi.repositories.AbscenceRep;

@Service
public class AbscenceService implements DAO<Abscence> {
	
	@Autowired
	private AbscenceRep abscenceRep;

	 @Override
	    public Abscence save(Abscence object) {
	        System.out.println("Saving in Service: " + object); // Log the object being saved
	        return this.abscenceRep.save(object);
	    }

	    @Override
	    public Abscence update(int id, Abscence object) {
	        object.setId(id);
	        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
	        return this.abscenceRep.save(object);
	    }

	    @Override
	    public void delete(int id) {
	        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
	        this.abscenceRep.deleteById(id);
	    }

	    @Override
	    public Abscence findById(int id) {
	        Optional<Abscence> optional = this.abscenceRep.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<Abscence> findAll() {
	        return this.abscenceRep.findAll();
	    }

	
	
	
	
	

	
	
	


	
	

}
