package hospitalProject;

public class Patient {
private String name;
private String surname;
private int patientId;
private Case patientCase;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public Case getPatientCase() {
	return patientCase;
}
public void setPatientCase(Case patientCase) {
	this.patientCase = patientCase;
}
@Override
public String toString() {
	return "Patient [name=" + name + ", surname=" + surname + ", patientId=" + patientId + ", patientCase="
			+ patientCase + "]";
}

}
