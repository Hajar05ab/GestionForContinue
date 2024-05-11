package ma.emsi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Beneficiaire extends Personne {
	
	@OneToMany
	private List <Affectation> affectation;
	
	@OneToMany
	private List <Diplome> diplome;
	
	@ManyToOne
	private Abscence abscence;
	
	@OneToMany
	private List <ForContinue> forContinue;
	
	

}
