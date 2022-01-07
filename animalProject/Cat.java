package animalProject;

public class Cat extends Animal{
	 String name;
	 int age;
	 String habitat;
	 boolean isDomestic;
	@Override
	String animalName() {
		return this.name;
	}
	@Override
	int animalAge() {
		return this.age;
	}
	@Override
	String habitat() {
		return this.habitat;
	}
	@Override
	boolean isDomestic() {
		return this.isDomestic;
	}
	
	public Cat(String name, int age, String habitat, boolean isDomestic) {
		super();
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		this.isDomestic = isDomestic;
	}
	public Cat() {
		super();
	}
	
	
}
