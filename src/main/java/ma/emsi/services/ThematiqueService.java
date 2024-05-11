package ma.emsi.services;

import java.util.List;
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
		// TODO Auto-generated method stub
		return this.thematiqueRep.save(object);
	}

	@Override
	public Thematique update(Thematique object) {
		// TODO Auto-generated method stub
		return this.thematiqueRep.save(object);
	}

	@Override
	public void delete(Thematique object) {
		// TODO Auto-generated method stub
		this.thematiqueRep.delete(object);
	}

	@Override
	public Thematique findById(int id) {
		// TODO Auto-generated method stub
		return this.thematiqueRep.findById(id);
	}

	@Override
	public List<Thematique> findAll() {
		// TODO Auto-generated method stub
		return this.thematiqueRep.findAll();
	}

	
	
	

}
