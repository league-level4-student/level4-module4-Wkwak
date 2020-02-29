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
		for (Doctor d: doctors) {
			if(d.currentPatients.size()<3) {
				//list of patients to add afasdfsdfasdf
				d.assignPatient(patients.get(index));
			}
		}
	}
}
