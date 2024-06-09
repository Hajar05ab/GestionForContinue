package ma.emsi.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Thematique {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Intitule;
	private int NbrJrs;
	private int NbrGrp;
	private int NbrForIntr;
	private int NbrForExtr;
	private Double CoutPedago;
	private Date DateDebut;
	private Date DateFin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return Intitule;
	}
	public void setIntitule(String intitule) {
		Intitule = intitule;
	}
	public int getNbrJrs() {
		return NbrJrs;
	}
	public void setNbrJrs(int nbrJrs) {
		NbrJrs = nbrJrs;
	}
	public int getNbrGrp() {
		return NbrGrp;
	}
	public void setNbrGrp(int nbrGrp) {
		NbrGrp = nbrGrp;
	}
	public int getNbrForIntr() {
		return NbrForIntr;
	}
	public void setNbrForIntr(int nbrForIntr) {
		NbrForIntr = nbrForIntr;
	}
	public int getNbrForExtr() {
		return NbrForExtr;
	}
	public void setNbrForExtr(int nbrForExtr) {
		NbrForExtr = nbrForExtr;
	}
	public Double getCoutPedago() {
		return CoutPedago;
	}
	public void setCoutPedago(Double coutPedago) {
		CoutPedago = coutPedago;
	}
	public Date getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	public Date getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	
	
	

}
