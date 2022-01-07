package carProject;

public abstract class Car {
	protected String make;
	protected String model;
	protected int year;
	protected double price;
	
	static {
		System.out.println("The car is on the way");
		//initializer
		//if you have static veriables you can start from static blocks
	}
	
	
	abstract String carMake();
	abstract String carModel();
	abstract int carYear();
	abstract double carPrice();
	
	public Car( String model, int year, double price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public Car() {
		super();
	}

}
