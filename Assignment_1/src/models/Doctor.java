/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author rakadadevarushikamidi
 */
public class Doctor {
    private String doctorId;
    private String doctorName;
    private String licenseNumber;
    private String medicalDegree;

    @Override
    public String toString() {
        return "Doctor{" + "doctorId=" + doctorId + ", doctorName=" + doctorName + ", licenseNumber=" + licenseNumber + ", medicalDegree=" + medicalDegree + ", officeLocation=" + officeLocation + ", specialization=" + specialization + ", experience=" + experience + '}';
    }
    private Address officeLocation;
    private String specialization;
    private String experience;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getMedicalDegree() {
        return medicalDegree;
    }

    public void setMedicalDegree(String medicalDegree) {
        this.medicalDegree = medicalDegree;
    }

    public Address getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(Address officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
