package ma.emsi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.ForContinue;
import ma.emsi.repositories.ForContinueRep;

@Service
public class ForContinueService implements DAO<ForContinue> {
	
	@Autowired
	private ForContinueRep forContinueRep;

	@Override
	public ForContinue save(ForContinue object) {
		// TODO Auto-generated method stub
		return this.forContinueRep.save(object);
	}

	@Override
	public ForContinue update(ForContinue object) {
		// TODO Auto-generated method stub
		return this.forContinueRep.save(object);
	}

	@Override
	public void delete(ForContinue object) {
		// TODO Auto-generated method stub
		this.forContinueRep.delete(object);
	}

	@Override
	public ForContinue findById(int id) {
		// TODO Auto-generated method stub
		return this.forContinueRep.findById(id);
	}

	@Override
	public List<ForContinue> findAll() {
		// TODO Auto-generated method stub
		return this.forContinueRep.findAll();
	}

	
	
	

}
