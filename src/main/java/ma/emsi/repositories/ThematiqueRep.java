package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.entities.Thematique;

public interface ThematiqueRep extends JpaRepository<Thematique, Integer> {
	public Thematique findById(int id);

}
