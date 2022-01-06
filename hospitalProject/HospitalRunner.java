package hospitalProject;

public class HospitalRunner {

	static Hospital hospital = new Hospital();

	public static void main(String[] args) {

		String currentCase = "Bas agrisi";
		String title= doctorTitle(currentCase);
		System.out.println(title);
		System.out.println(findDoctor(title));
		System.out.println(findPatient(currentCase));
		
		

	}

	public static String doctorTitle(String actuelCase) {

		String title = "";
		switch (actuelCase) {
		case "Allerji":
			title = "Allergist";
			break;

		case "Bas agrisi":
			title = "Norolog";
			break;
		case "Diabet":
			title = "Genel cerrah";
			break;
		case "Sogukalginligi":
			title = "Cocukdoktoru";
			break;
		case "Migren":
			title = "Dahiliye";
			break;
		case "Kalphastaliklari":
			title = "Kardiolog";
			break;
		default:
			System.out.println("no matching title");
			break;
		}

		return title;
	}

	public static Doctor findDoctor(String title) {
		Doctor doctor = new Doctor();

		for (int i = 0; i < hospital.unvanlar.length; i++) {
			if (title.equalsIgnoreCase(hospital.unvanlar[i])) {
				doctor.setName(hospital.doctorIsimleri[i]);
				doctor.setLastname(hospital.doctorSoyIsimleri[i]);
				doctor.setTitle(hospital.unvanlar[i]);
			}
		}

		return doctor;
	}

	public static Case findCase(String actualCase) {
		Case case1 = new Case();

		switch (actualCase) {
		case "Allerji":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
		case "Bas agrisi":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "Diabet":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "Migren":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "Kalphastaliklari":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;

		default:
			break;
		}

		return case1;
	}

	public static Patient findPatient(String ActualCase) {
		Patient patient=new Patient();
		for (int i = 0; i < hospital.durumlar.length; i++) {
			if (ActualCase.equalsIgnoreCase(hospital.durumlar[i])) {
				patient.setName(hospital.hastaIsimleri[i]);
				patient.setSurname(hospital.hastaSoyIsimleri[i]);
				patient.setPatientId(hospital.hastaIDleri[i]);
				patient.setPatientCase(findCase(ActualCase));
			}
		}
		
		
		return patient;
	}
}
