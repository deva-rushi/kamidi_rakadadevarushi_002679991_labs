/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author rakadadevarushikamidi
 */
public class InsuranceCoverage {
    private String corporateId;
    private Address companyAddress;
    private String premium;
    private String deductable;
    private String benefits;

    @Override
    public String toString() {
        return "InsuranceCoverage{" + "corporateId=" + corporateId + ", companyAddress=" + companyAddress + ", premium=" + premium + ", deductable=" + deductable + ", benefits=" + benefits + '}';
    }

    public String getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(String corporateId) {
        this.corporateId = corporateId;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDeductable() {
        return deductable;
    }

    public void setDeductable(String deductable) {
        this.deductable = deductable;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
