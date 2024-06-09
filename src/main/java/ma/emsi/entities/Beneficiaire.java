package ma.emsi.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Beneficiaire  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String CNE;
	private String Nom;
	private String telephone;
	private String Email;
	
	@OneToMany
	private List <Affectation> affectation;
	
	@OneToMany
	private List <Diplome> diplome;
	
	
	@OneToMany
	private List <ForContinue> forContinue;
	
	@OneToMany
	private List<Thematique> thematiques;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCNE() {
		return CNE;
	}

	public void setCNE(String cNE) {
		CNE = cNE;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public List<Affectation> getAffectation() {
		return affectation;
	}

	public void setAffectation(List<Affectation> affectation) {
		this.affectation = affectation;
	}

	public List<Diplome> getDiplome() {
		return diplome;
	}

	public void setDiplome(List<Diplome> diplome) {
		this.diplome = diplome;
	}

	public List<ForContinue> getForContinue() {
		return forContinue;
	}

	public void setForContinue(List<ForContinue> forContinue) {
		this.forContinue = forContinue;
	}

	public List<Thematique> getThematiques() {
		return thematiques;
	}

	public void setThematiques(List<Thematique> thematiques) {
		this.thematiques = thematiques;
	}
	
	
	
	

}
