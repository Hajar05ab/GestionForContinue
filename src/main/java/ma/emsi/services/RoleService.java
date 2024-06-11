package ma.emsi.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Role;
import ma.emsi.repositories.RoleRep;

@Service
public class RoleService  implements DAO<Role> {
	
	 @Autowired
	    private RoleRep roleRep;
	 
	 @Override
	    public Role save(Role object) {
	        System.out.println("Saving in Service: " + object); // Log the object being saved
	        return this.roleRep.save(object);
	    }

	    @Override
	    public Role update(int id, Role object) {
	        object.setId(id);
	        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
	        return this.roleRep.save(object);
	    }

	    @Override
	    public void delete(int id) {
	        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
	        this.roleRep.deleteById(id);
	    }

	    @Override
	    public Role findById(int id) {
	        Optional<Role> optional = this.roleRep.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<Role> findAll() {
	        return this.roleRep.findAll();
	    }

}
