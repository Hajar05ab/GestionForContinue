package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.emsi.entities.Abscence;


public interface AbscenceRep extends JpaRepository<Abscence, Integer>{
	public Abscence findById(int id);

}
