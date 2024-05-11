package ma.emsi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.Beneficiaire;
import ma.emsi.repositories.BeneficiaireRep;

@Service
public class BeneficiaireService implements DAO<Beneficiaire> {
	
	@Autowired
	private BeneficiaireRep beneficiaireRep;

	@Override
	public Beneficiaire save(Beneficiaire object) {
		// TODO Auto-generated method stub
		return this.beneficiaireRep.save(object);
	}

	@Override
	public Beneficiaire update(Beneficiaire object) {
		// TODO Auto-generated method stub
		return this.beneficiaireRep.save(object);
	}

	@Override
	public void delete(Beneficiaire object) {
		// TODO Auto-generated method stub
		this.beneficiaireRep.delete(object);
	}

	@Override
	public Beneficiaire findById(int id) {
		// TODO Auto-generated method stub
		return this.beneficiaireRep.findById(id);
	}

	@Override
	public List<Beneficiaire> findAll() {
		// TODO Auto-generated method stub
		return this.beneficiaireRep.findAll();
	}
	
	

	
	
	

}
