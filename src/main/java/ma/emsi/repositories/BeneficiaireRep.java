package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.entities.Beneficiaire;

public interface BeneficiaireRep extends JpaRepository<Beneficiaire, Integer> {
	public Beneficiaire findById(int id);

}
