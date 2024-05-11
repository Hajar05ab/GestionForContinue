package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.entities.ForContinue;

public interface ForContinueRep extends JpaRepository<ForContinue, Integer> {
	public ForContinue findById(int id);

}
