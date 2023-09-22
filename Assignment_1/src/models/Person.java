/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author rakadadevarushikamidi
 */
public class Person {
    private String name;
    private String dateOfBirth;
    private String age;
    private String gender;
    private String ssnNumber;
    private String email;
    private Address personAddress;
    private String phoneNumber;
    private String bloodGroup;
    private Driver drivingLicense;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", gender=" + gender + ", ssnNumber=" + ssnNumber + ", email=" + email + ", personAddress=" + personAddress + ", phoneNumber=" + phoneNumber + ", bloodGroup=" + bloodGroup + ", drivingLicense=" + drivingLicense + ", vehcleRegistration=" + vehcleRegistration + '}';
    }
    private VehicleRegistration vehcleRegistration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(Address personAddress) {
        this.personAddress = personAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Driver getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(Driver drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public VehicleRegistration getVehcleRegistration() {
        return vehcleRegistration;
    }

    public void setVehcleRegistration(VehicleRegistration vehcleRegistration) {
        this.vehcleRegistration = vehcleRegistration;
    }
}
