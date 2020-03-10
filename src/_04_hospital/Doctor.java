package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> currentPatients = new ArrayList<Patient>();

	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws Exception{
		// TODO Auto-generated method stub
		if(currentPatients.size()>=3) {
			throw new Exception();
		}
		else {
			currentPatients.add(patient);
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return currentPatients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i = 0; i < currentPatients.size(); i++) {
			currentPatients.get(i).caredFor = true;
		}
	}

}
