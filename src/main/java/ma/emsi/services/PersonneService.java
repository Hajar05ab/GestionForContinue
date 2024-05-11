package ma.emsi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Personne;
import ma.emsi.repositories.PersonneRep;

@Service
public class PersonneService implements DAO<Personne> {
	
	@Autowired
	private PersonneRep personneRep;

	@Override
	public Personne save(Personne object) {
		// TODO Auto-generated method stub
		return this.personneRep.save(object);
	}

	@Override
	public Personne update(Personne object) {
		// TODO Auto-generated method stub
		return this.personneRep.save(object);
	}

	@Override
	public void delete(Personne object) {
		// TODO Auto-generated method stub
		this.personneRep.delete(object);
	}

	@Override
	public Personne findById(int id) {
		// TODO Auto-generated method stub
		return this.personneRep.findById(id);
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return this.personneRep.findAll();
	}

	
	
	

}
