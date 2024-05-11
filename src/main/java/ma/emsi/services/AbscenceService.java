package ma.emsi.services;

import java.util.List;
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
		// TODO Auto-generated method stub
		return this.abscenceRep.save(object);
	}

	@Override
	public Abscence update(Abscence object) {
		// TODO Auto-generated method stub
		return this.abscenceRep.save(object);
	}

	@Override
	public void delete(Abscence object) {
		// TODO Auto-generated method stub
		this.abscenceRep.delete(object);
	}

	@Override
	public Abscence findById(int id) {
		// TODO Auto-generated method stub
		return this.abscenceRep.findById(id);
	}

	@Override
	public List<Abscence> findAll() {
		// TODO Auto-generated method stub
		return this.abscenceRep.findAll();
	}
	
	
	
	

	
	
	


	
	

}
