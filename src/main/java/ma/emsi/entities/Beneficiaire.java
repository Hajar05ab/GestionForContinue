package ma.emsi.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Beneficiaire  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	protected int PPR;
	protected String CNE;
	protected String Nom;
	protected String Prenom;
	protected Character Genre;
	protected Date DateNaissance;
	protected String telephone;
	protected String Email;
	protected String Fonction;
	
	@OneToMany
	private List <Affectation> affectation;
	
	@OneToMany
	private List <Diplome> diplome;
	
	
	@OneToMany
	private List <ForContinue> forContinue;
	
	@OneToMany
	private List<Thematique> thematiques;
	
	

}
