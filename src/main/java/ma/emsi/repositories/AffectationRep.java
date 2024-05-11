package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.entities.Affectation;

public interface AffectationRep extends JpaRepository<Affectation, Integer> {
	public Affectation findById(int id);

}
