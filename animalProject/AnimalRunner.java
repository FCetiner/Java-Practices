package animalProject;

public class AnimalRunner {

	public static void main(String[] args) {


		Animal animal1=new Cat("Cookie",3,"ground",true);
		
		
		//Reference Type	//Object type
		Animal animal2=new Eagle("Coco",7,"Air",false);
		// polymorphism when we have different Reference Type different Object type
		//Inheritance
		//Abstraction
		//We just did three principles of OOP consept with this project
		
		System.out.println("**********Cat*********");
		System.out.println("animal name : "+animal1.animalName());
		System.out.println("animal age : "+animal1.animalAge());
		System.out.println("animal habitat : "+animal1.habitat());
		System.out.println("is domestic : "+animal1.isDomestic());

		System.out.println("**********Eagle*********");
		System.out.println("animal name : "+animal2.animalName());
		System.out.println("animal age : "+animal2.animalAge());
		System.out.println("animal habitat : "+animal2.habitat());
		System.out.println("is domestic : "+animal2.isDomestic());

	}

}
