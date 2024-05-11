package ma.emsi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Affectation;
import ma.emsi.repositories.AffectationRep;

@Service
public class AffectationService implements DAO<Affectation> {
	
	@Autowired
	private AffectationRep affectationRep;

	@Override
	public Affectation save(Affectation object) {
		// TODO Auto-generated method stub
		return this.affectationRep.save(object);
	}

	@Override
	public Affectation update(Affectation object) {
		// TODO Auto-generated method stub
		return this.affectationRep.save(object);
	}

	@Override
	public void delete(Affectation object) {
		// TODO Auto-generated method stub
		this.affectationRep.delete(object);
	}

	@Override
	public Affectation findById(int id) {
		// TODO Auto-generated method stub
		return this.affectationRep.findById(id);
	}

	@Override
	public List<Affectation> findAll() {
		// TODO Auto-generated method stub
		return this.affectationRep.findAll();
	}

	
	
	


	
	
}
