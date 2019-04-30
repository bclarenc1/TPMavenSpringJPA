package com.infotel.TPMavenSpringJPA.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") // pour ajouter plusieurs personne en meme temps (cree un nouveau bean pour chaque personne)
@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdresse;
	private String numRue;
	private String nomRue;
	private String cp;
	private String ville;
	@OneToMany(mappedBy="adresse")
	private List<Personne> personnes = new ArrayList<>();
	
	public int getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numRue=" + numRue + ", nomRue=" + nomRue + ", cp=" + cp
				+ ", ville=" + ville + "]";
	}
	
	


}
