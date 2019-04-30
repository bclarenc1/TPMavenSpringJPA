package com.infotel.TPMavenSpringJPA.dao;

import java.util.List;

import com.infotel.TPMavenSpringJPA.metier.Adresse;
import com.infotel.TPMavenSpringJPA.metier.Personne;

public interface Idao {

	public int ajouterPersonne(Personne p);
	public int supprimerPersonne(Personne p);
	public Personne getPersonne(int id);
	public Personne findPersonne(int id);
	public int modifierPersonne(Personne p);
	public List<Personne> findAllPeople();

	public int ajouterAdresse(Adresse a);
	public int supprimerAdresse(Adresse a);
	public Adresse getAdresse(int idAdresse);
	public Adresse findAdresse(int idAdresse);
	public int modifierAdresse(Adresse a);
	public List<Adresse> findAllAddresses();
	
}
