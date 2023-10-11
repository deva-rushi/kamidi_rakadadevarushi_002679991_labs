/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessModels;

import java.util.Date;

/**
 *
 * @author rakadadevarushikamidi
 */
public class Account {
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private int accountBalance;
    private Date createdDate;

    @Override
    public String toString() {
        return bankName;
    }

    public Account() {
        this.createdDate = new Date();
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    
}
