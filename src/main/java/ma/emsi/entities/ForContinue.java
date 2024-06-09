package ma.emsi.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ForContinue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int Duree_Jrs;
	private int Annee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuree_Jrs() {
		return Duree_Jrs;
	}
	public void setDuree_Jrs(int duree_Jrs) {
		Duree_Jrs = duree_Jrs;
	}
	public int getAnnee() {
		return Annee;
	}
	public void setAnnee(int annee) {
		Annee = annee;
	}
		

}
