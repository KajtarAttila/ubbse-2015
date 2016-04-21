package entities;

import java.io.Serializable;
import java.lang.Float;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Prey
 *
 */
@Entity

public class Prey implements Serializable {

	   
	@Id
	private String name;
	private double prey_average_weight;
	private static final long serialVersionUID = 1L;

	public Prey() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public double getPrey_average_weight() {
		return this.prey_average_weight;
	}

	public void setPrey_average_weight(double d) {
		this.prey_average_weight = d;
	}
   
}
