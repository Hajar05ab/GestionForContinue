package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.entities.Diplome;

public interface DiplomeRep extends JpaRepository<Diplome, Integer> {
	public Diplome findById(int id);

}
