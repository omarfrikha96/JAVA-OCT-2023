package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	// Inside class:
	private ArrayList<String> patientNotes;

	// TO DO: Constructor that takes an ID
	public Physician(Integer id) {
		super(id);
	}

	// TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		int mdp = this.getPin();
		if (mdp > 999 || mdp < 9999) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		int id = this.getId();
		if (id == confirmedAuthID) {
			return true;
		} else {
			return false;
		}
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}


}
