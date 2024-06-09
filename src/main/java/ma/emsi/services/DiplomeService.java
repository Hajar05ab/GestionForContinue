package ma.emsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Diplome;
import ma.emsi.repositories.DiplomeRep;

@Service
public class DiplomeService implements DAO<Diplome> {
	
	@Autowired
	private DiplomeRep diplomeRep;

	 @Override
	    public Diplome save(Diplome object) {
	        System.out.println("Saving in Service: " + object); // Log the object being saved
	        return this.diplomeRep.save(object);
	    }

	    @Override
	    public Diplome update(int id, Diplome object) {
	        object.setId(id);
	        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
	        return this.diplomeRep.save(object);
	    }

	    @Override
	    public void delete(int id) {
	        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
	        this.diplomeRep.deleteById(id);
	    }

	    @Override
	    public Diplome findById(int id) {
	        Optional<Diplome> optional = this.diplomeRep.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<Diplome> findAll() {
	        return this.diplomeRep.findAll();
	    }

	


	
	

}
