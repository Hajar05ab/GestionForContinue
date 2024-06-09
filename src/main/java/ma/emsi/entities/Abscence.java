package ma.emsi.entities;

import java.util.Date;

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
public class Abscence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String EtatAbs;
	private Date dateAbs;
	
	@ManyToOne
	private Beneficiaire beneficiaire;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEtatAbs() {
		return EtatAbs;
	}

	public void setEtatAbs(String etatAbs) {
		EtatAbs = etatAbs;
	}

	public Date getDateAbs() {
		return dateAbs;
	}

	public void setDateAbs(Date dateAbs) {
		this.dateAbs = dateAbs;
	}

	public Beneficiaire getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(Beneficiaire beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	

}
