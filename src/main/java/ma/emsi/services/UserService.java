package ma.emsi.services;

import java.util.List;
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
		// TODO Auto-generated method stub
		return this.userRep.save(object);
	}

	@Override
	public User update(User object) {
		// TODO Auto-generated method stub
		return this.userRep.save(object);
	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub
		this.userRep.delete(object);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return this.userRep.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userRep.findAll();
	}

	
	
	

}
