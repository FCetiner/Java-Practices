package familyProject;

public class FamilyRunner {

	public static void main(String[] args) {


		ReportCard reportCard=new ReportCard(9,9,10,10);
		
		Student student=new Student("Ali","Can",16,reportCard);
		
		Parent parent=new Parent("Veli","Can",student,student.total()>=35);

		System.out.println(parent); 
		System.out.println("Parent Status : "+ parent.successMessage());
	
		System.out.println("Child status : " + student.successMessage());
	
	}

}
