package com.infotel.TPMavenSpringJPA.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TPMavenSpringJPA.metier.Adresse;
import com.infotel.TPMavenSpringJPA.metier.Personne;

@Transactional  // s'applique à toutes les méthodes
@Repository
public class DaoImpl implements Idao {

	@PersistenceContext  // refere aux beans JPA2 dans applicationsContext.xml
	EntityManager em;
	
	@Override
	public int ajouterPersonne(Personne p) {
		em.persist(p);
		System.out.println("personne ajoutee");
		return p.getId();
	}

	@Override
	public int supprimerPersonne(Personne p) {
		em.remove(p);
		System.out.println("personne supprimee");
		return p.getId();
	}

	@Override
	public Personne getPersonne(int id) {
		Personne p = new Personne();
		p = em.getReference(Personne.class, id);
		return p;
	}

	@Override
	public Personne findPersonne(int id) {
		Personne p = new Personne();
		p = em.find(Personne.class, id);
		return p;
	}

	@Override
	public int modifierPersonne(Personne p) {
		em.merge(p);
		System.out.println("personne updatee");
		return p.getId();
	}

	@Override
	public List<Personne> findAllPeople() {
		List<Personne> list = new ArrayList<Personne>();
		Query q = null;
		q = em.createQuery("SELECT pers from Personne pers");
		list = q.getResultList();
		
		return list;
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		em.persist(a);
		System.out.println("adresse ajoutee");
		return a.getIdAdresse();
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		em.remove(a);
		System.out.println("adresse suprimee");
		return a.getIdAdresse();
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		Adresse a = new Adresse();
		a = em.getReference(Adresse.class, idAdresse);
		return a;
	
	}

	@Override
	public Adresse findAdresse(int idAdresse) {
		Adresse a = new Adresse();
		a = em.find(Adresse.class, idAdresse);
		return a;
	}

	@Override
	public int modifierAdresse(Adresse a) {
		em.merge(a);
		System.out.println("adresse updatee");
		return a.getIdAdresse();
	}

	@Override
	public List<Adresse> findAllAddresses() {
		List<Adresse> list = new ArrayList<Adresse>();
		Query q = null;
		q = em.createQuery("SELECT adr from Adresse adr");
		list = q.getResultList();
		return list;
	}

	
}
