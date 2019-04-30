package com.infotel.TPMavenSpringJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TPMavenSpringJPA.dao.DaoImpl;
import com.infotel.TPMavenSpringJPA.dao.Idao;
import com.infotel.TPMavenSpringJPA.metier.Adresse;
import com.infotel.TPMavenSpringJPA.metier.Personne;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	Idao dao = new DaoImpl();
	public int ajouterPersonne(Personne p) {
		return dao.ajouterPersonne(p);
	}

	@Override
	public int supprimerPersonne(Personne p) {
		return dao.supprimerPersonne(p);
	}

	@Override
	public Personne getPersonne(int id) {
		return dao.getPersonne(id);
	}

	@Override
	public Personne findPersonne(int id) {
		return dao.findPersonne(id);
	}

	@Override
	public int modifierPersonne(Personne p) {
		return dao.modifierPersonne(p);
	}

	public Idao getDao() {
		return dao;
	}
	public void setDao(Idao dao) {
		this.dao = dao;
	}

	@Override
	public List<Personne> findAllPeople() {
		return dao.findAllPeople();
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		return dao.ajouterAdresse(a);
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		return dao.supprimerAdresse(a);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		return dao.getAdresse(idAdresse);
	}

	@Override
	public Adresse findAdresse(int idAdresse) {
		return dao.findAdresse(idAdresse);
	}

	@Override
	public int modifierAdresse(Adresse a) {
		return dao.modifierAdresse(a);
	}
	
	@Override
	public List<Adresse> findAllAddresses() {
		return dao.findAllAddresses();
	}

}
