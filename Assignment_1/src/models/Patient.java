/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author rakadadevarushikamidi
 */
public class Patient {
    private String patientId;
    private Doctor primaryDoctor;
    private String lastVist;
    private String nextAppointment;
    private String allergies;
    private String onMedication;
    private Person personalDetails;
    private InsuranceCoverage insuranceCoverage;

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", primaryDoctor=" + primaryDoctor + ", lastVist=" + lastVist + ", nextAppointment=" + nextAppointment + ", allergies=" + allergies + ", onMedication=" + onMedication + ", personalDetails=" + personalDetails + ", insuranceCoverage=" + insuranceCoverage + '}';
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Doctor getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(Doctor primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public String getLastVist() {
        return lastVist;
    }

    public void setLastVist(String lastVist) {
        this.lastVist = lastVist;
    }

    public String getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(String nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(String onMedication) {
        this.onMedication = onMedication;
    }

    public Person getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(Person personalDetails) {
        this.personalDetails = personalDetails;
    }

    public InsuranceCoverage getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(InsuranceCoverage insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }
}
