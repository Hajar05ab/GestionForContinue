package ma.emsi.services;

import java.util.List;
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
		// TODO Auto-generated method stub
		return this.diplomeRep.save(object);
	}

	@Override
	public Diplome update(Diplome object) {
		// TODO Auto-generated method stub
		return this.diplomeRep.save(object);
	}

	@Override
	public void delete(Diplome object) {
		// TODO Auto-generated method stub
		this.diplomeRep.delete(object);
	}

	@Override
	public Diplome findById(int id) {
		// TODO Auto-generated method stub
		return this.diplomeRep.findById(id);
	}

	@Override
	public List<Diplome> findAll() {
		// TODO Auto-generated method stub
		return this.diplomeRep.findAll();
	}


	
	

}
