package ma.emsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Thematique;
import ma.emsi.repositories.ThematiqueRep;

@Service
public class ThematiqueService implements DAO<Thematique> {
	
	@Autowired
	private ThematiqueRep thematiqueRep;

	 @Override
	    public Thematique save(Thematique object) {
	        System.out.println("Saving in Service: " + object); // Log the object being saved
	        return this.thematiqueRep.save(object);
	    }

	    @Override
	    public Thematique update(int id, Thematique object) {
	        object.setId(id);
	        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
	        return this.thematiqueRep.save(object);
	    }

	    @Override
	    public void delete(int id) {
	        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
	        this.thematiqueRep.deleteById(id);
	    }

	    @Override
	    public Thematique findById(int id) {
	        Optional<Thematique> optional = this.thematiqueRep.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<Thematique> findAll() {
	        return this.thematiqueRep.findAll();
	    }
	

	
	
	

}
