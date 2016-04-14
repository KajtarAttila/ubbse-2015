package pojo.java;

public class Car {

	protected String make;
	protected int age;
	protected int horsepower;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return make + " : " + Integer.toString(age)+ " : " + Integer.toString(horsepower);
	}
	public Car(){
		
	};
}
