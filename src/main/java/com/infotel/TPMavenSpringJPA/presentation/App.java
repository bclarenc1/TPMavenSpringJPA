package com.infotel.TPMavenSpringJPA.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TPMavenSpringJPA.metier.Adresse;
import com.infotel.TPMavenSpringJPA.metier.Personne;
import com.infotel.TPMavenSpringJPA.service.Iservice;
import com.infotel.TPMavenSpringJPA.service.ServiceImpl;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Iservice service = context.getBean("serviceImpl", ServiceImpl.class);
		
		Personne p1 = context.getBean("personne", Personne.class);
		Personne p2 = context.getBean("personne", Personne.class);
		Personne p3 = context.getBean("personne", Personne.class);
		Adresse a1 = context.getBean("adresse", Adresse.class);
		Adresse a2 = context.getBean("adresse", Adresse.class);
		Adresse a3 = context.getBean("adresse", Adresse.class);
		
//		p1.setPrenom("Lerooooooy");
//		p1.setNom("Jenkins");
//		p1.setAge(555);
//		service.ajouterPersonne(p1);
//		
//		p2.setPrenom("toto");
//		p2.setNom("lecoco");
//		p2.setAge(12);
//		service.ajouterPersonne(p2);
//		
//		p3.setPrenom("Annie");
//		p3.setNom("D'algo");
//		p3.setAge(54);
//		service.ajouterPersonne(p);

//		service.supprimerPersonne(service.getPersonne(4));

//		System.out.println(service.findPersonne(1));

//		int id1=1;
//		Personne q = service.findPersonne(id1);
//		q.setAge(130);
//		service.modifierPersonne(q);
//		System.out.println(service.findPersonne(id1));
		
//		service.findAllPeople();
		
//		a1.setNumRue("0 quater");
//		a1.setNomRue("jniop");
//		a1.setCp("00000");
//		a1.setVille("Snorkyville");
//		service.ajouterAdresse(a1);
//		
//		a2.setNumRue("2.5");
//		a2.setNomRue("Kappa");
//		a2.setCp("00001");
//		a2.setVille("Twitchtown");
//		service.ajouterAdresse(a2);
//
//		a3.setNumRue("pi");
//		a3.setNomRue("rue de la tarte");
//		a3.setCp("01010");
//		a3.setVille("Circle Village");
//		service.ajouterAdresse(a3);

//		service.supprimerAdresse(service.getAdresse(4));
		
//		a1 = service.findAdresse(5);
//		a1.setCp("43210");
//		a1.setNumRue("3210");
//		service.modifierAdresse(a1);
		
//		Personne p10 = service.findPersonne(1);
//		p10.setAdresse(service.getAdresse(1));
//		service.modifierPersonne(p10);

		Personne p11 = service.findPersonne(1);
		p11.setNom("Jenkins");
		p11.setAge(9001);
		service.modifierPersonne(p11);
		Personne p12 = service.findPersonne(2);
		p12.setAdresse(service.getAdresse(3));
		service.modifierPersonne(p12);
		Personne p13 = service.findPersonne(3);
		p13.setAdresse(service.getAdresse(2));
		service.modifierPersonne(p13);
	}
}
