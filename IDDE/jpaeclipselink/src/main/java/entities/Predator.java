package entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Predator {
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the population
	 */
	public Integer getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(Integer population) {
		this.population = population;
	}
	/**
	 * @return the livesInEurope
	 */
	public boolean isLivesInEurope() {
		return livesInEurope;
	}
	/**
	 * @param livesInEurope the livesInEurope to set
	 */
	public void setLivesInEurope(boolean livesInEurope) {
		this.livesInEurope = livesInEurope;
	}
	
	@Id
	@GeneratedValue
	protected Integer Id;
	
	@Column( name = "predator_name")
	protected String name;
	
	@Column( name = "predator_population")
	protected Integer population;
	
	@Column( name = "predator_lives_in_europe")
	protected boolean livesInEurope;
	
	@Column( name = "predator_average_weight")
	protected float averageWeight;
	
	@OneToMany
	protected List<Prey> prayAnimals;

	/**
	 * @return the prayAnimals
	 */
	public List<Prey> getPrayAnimals() {
		return prayAnimals;
	}
	/**
	 * @param prayAnimals the prayAnimals to set
	 */
	public void setPrayAnimals(List<Prey> prayAnimals) {
		this.prayAnimals = prayAnimals;
	}
	
	

}
