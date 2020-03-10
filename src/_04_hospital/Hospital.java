package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		Doctor doctor = new GeneralPractitioner();
		generalPractitioner = (GeneralPractitioner) doctor;
		doctors.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
		Doctor doctor = new Surgeon();
		surgeon = (Surgeon) doctor;
		doctors.add(surgeon);
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int x = 0;
		for (Doctor d : doctors) {
			while (x < patients.size()) {
				if(d.getPatients().size()<3) {
					try {
						d.assignPatient(patients.get(x));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					x++;
				}
				else {
					break;
				}
			}
		}
	}

}
