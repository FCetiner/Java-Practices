package carProject;

public class Honda extends Car{
	private String make="Honda";
	private String model="Accord";
	private int year=2012;
	private double price=8000;
	
	static {
		System.out.println("Honda is on the way");
	}
	
	
	
	public Honda() {
		super();
	}
	
	public Honda( String model, int year, double price) {
		super( model, year, price);
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	String carMake() {
		// TODO Auto-generated method stub
		return "Car Make: " + this.make;
	}
	@Override
	String carModel() {
		// TODO Auto-generated method stub
		return "Car Model: " + this.model;
	}
	@Override
	int carYear() {
		// TODO Auto-generated method stub
		return  this.year;
	}
	@Override
	double carPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	
	
}
