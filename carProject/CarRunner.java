package carProject;

public class CarRunner {

	public static void main(String[] args) {


		Car car=new Honda("Civic",2021,60000);
		
		System.out.println("************Honda*********");
		System.out.println(car.carMake());
		System.out.println(car.carModel());
		System.out.println(car.carYear());
		System.out.println(car.carPrice());
		
		Car car2 =new Toyota();
		
		System.out.println("************Toyota*********");
		System.out.println(car2.carMake());
		System.out.println(car2.carModel());
		System.out.println(car2.carYear());
		System.out.println(car2.carPrice());
	}

}
