package carProject;

public class Toyota extends Car{
	private String make="Toyota";
	private String model="Camry";
	private int year=2015;
	private double price=14000;
	
	static {
		System.out.println("Toyota is on the way");
	}
	
	
	public Toyota() {
		super();
	}

	public Toyota(String model, int year, double price) {
		super(model, year, price);
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	@Override
	String carMake() {
		return this.make;
	}
	@Override
	String carModel() {
		return this.model;
	}
	@Override
	int carYear() {
		return this.year;
	}
	@Override
	double carPrice() {
		return this.price;
	}
}
