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
@Getter
@Setter
public class Thematique {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Intitule;
	private String Objectif;
	private String DomainFor;
	private int PopuCible;
	private int NbrJrs;
	private int NbrGrp;
	private int NbrForIntr;
	private int NbrForExtr;
	private String Prestataire;
	private Double CoutPedago;
	private Double CoutLogi;
	private Date DateDebut;
	private Date DateFin;
	
	@ManyToMany
	private List <Personne> personnes;

}
