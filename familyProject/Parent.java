package familyProject;

public class Parent implements HonorAward{
	private String name;
	private String lastname;
	private Student student;
	private boolean honorStudent;
	
	
	
	
	
	
	
	@Override
	public String successMessage() {
		
		String message= "Please spend more time with " + student.getName();
		
		if (student.total()>=35) {
			message="Congratulations! You hav an amazing child who honors everyone";
		}
		
		return message;
	}


	public Parent() {
		super();
	}


	public Parent(String name, String lastname, Student student, boolean honorStudent) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.student = student;
		this.honorStudent = honorStudent;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getLastname() {
		return lastname;
	}







	public void setLastname(String lastname) {
		this.lastname = lastname;
	}







	public Student getStudent() {
		return student;
	}







	public void setStudent(Student student) {
		this.student = student;
	}







	public boolean isHonorStudent() {
		return honorStudent;
	}







	public void setHonorStudent(boolean honorStudent) {
		this.honorStudent = honorStudent;
	}







	@Override
	public String toString() {
		return "Parent [name=" + name + ", lastname=" + lastname + ", student=" + student + ", honorStudent="
				+ honorStudent + "]";
	}
	
	
	
}
