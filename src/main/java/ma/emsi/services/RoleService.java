package ma.emsi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Role;
import ma.emsi.repositories.RoleRep;

@Service
public class RoleService implements DAO<Role> {
	
	@Autowired
	private RoleRep roleRep;

	@Override
	public Role save(Role object) {
		// TODO Auto-generated method stub
		return this.roleRep.save(object);
	}

	@Override
	public Role update(Role object) {
		// TODO Auto-generated method stub
		return this.roleRep.save(object);
	}

	@Override
	public void delete(Role object) {
		// TODO Auto-generated method stub
		this.roleRep.delete(object);
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return this.roleRep.findById(id);
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return this.roleRep.findAll();
	}

	
	
	
	
	

}
