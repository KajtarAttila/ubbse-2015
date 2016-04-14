package pojo.java;

public class Person {
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	@Override
	public String toString() {
		return name+":"+Integer.toString(age)+":"+Integer.toString(height)+":"+Integer.toString(weight);
	}
	public Person()
	{
		
	}
	
}
