package ma.emsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.User;
import ma.emsi.repositories.UserRep;

@Service
public class UserService implements DAO<User> {
	
	@Autowired
	private UserRep userRep;

	 @Override
	    public User save(User object) {
	        System.out.println("Saving in Service: " + object); // Log the object being saved
	        return this.userRep.save(object);
	    }

	    @Override
	    public User update(int id, User object) {
	        object.setId(id);
	        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
	        return this.userRep.save(object);
	    }

	    @Override
	    public void delete(int id) {
	        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
	        this.userRep.deleteById(id);
	    }

	    @Override
	    public User findById(int id) {
	        Optional<User> optional = this.userRep.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<User> findAll() {
	        return this.userRep.findAll();
	    }

	

	
	
	

}
