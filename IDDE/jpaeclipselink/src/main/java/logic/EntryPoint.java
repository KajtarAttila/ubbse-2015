package logic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Predator;
import entities.Prey;

public class EntryPoint {

	private static final String PERSISTENCE_UNIT_NAME = "jpaeclipselink";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		em.getTransaction().begin();
		Predator p = new Predator();
		p.setName("Farkas");
		p.setPopulation(125);
		p.setLivesInEurope(true);
		Prey malac = new Prey();
		malac.setName("malac");
		malac.setPrey_average_weight(112.5);
		Prey csirke = new Prey();
		csirke.setName("csirke");;
		csirke.setPrey_average_weight(8.5);
		List<Prey> prays = new ArrayList<Prey>();
		prays.add(malac);
		prays.add(csirke);
		p.setPrayAnimals(prays);
		em.persist(malac);
		em.persist(csirke);
		em.persist(p);
		em.getTransaction().commit();

		em.close();
	}
}


