/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4ex1;

/**
 *
 * @author houssem
 */
public class CheckingAccount extends BankAccount {
    private Double overdraftAllowed;

    public CheckingAccount(Integer accountNumber, Double overdraftAllowed) {
        super(accountNumber);
        this.overdraftAllowed = overdraftAllowed;
    }
    public CheckingAccount(Integer accountNumber, Double balance, Double overdraftAllowed) {
        super(accountNumber, balance);
        this.overdraftAllowed = overdraftAllowed;
    }

    public Double getOverdraftAllowed() {
        return overdraftAllowed;
    }

    public void setOverdraftAllowed(Double overdraftAllowed) {
        this.overdraftAllowed = overdraftAllowed;
    }

    public void withdraw(double montant) {
        if (montant <= (super.getBalance() + overdraftAllowed)) {
            super.withdraw(montant);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
