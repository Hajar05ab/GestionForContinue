package ma.emsi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Diplome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String DiplomeNom;
	private String Specialite;
	private String NivEtude;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiplomeNom() {
		return DiplomeNom;
	}

	public void setDiplomeNom(String diplomeNom) {
		DiplomeNom = diplomeNom;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	public String getNivEtude() {
		return NivEtude;
	}

	public void setNivEtude(String nivEtude) {
		NivEtude = nivEtude;
	}

	
	
	
	

}
