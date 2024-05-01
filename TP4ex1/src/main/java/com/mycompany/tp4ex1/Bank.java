/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4ex1;

import java.util.ArrayList;

/**
 *
 * @author houssem
 */
public class Bank {
    private ArrayList<Customer> clients ;
    public Bank(){
        this.clients = new ArrayList();
    }
    public void addCustomer(Customer client){
        if(this.clients.contains(client)){
            System.out.println("ce client deja existe !");
        }
        else {
            this.clients.add(client);
        }
    }
    public void removeCustomer(Customer client){
        if(this.clients.contains(client)){
            this.clients.remove(client);
        }
        else {
            System.out.println("ce client n'existe pas !");
        }
    }
    public Double getTotalBalance(){
        Double totalBankBalance = 0.0 ;
        for(Customer client : this.clients){
            totalBankBalance += client.getTotalAccountBalance() ;
        }
        return totalBankBalance ;
    }
    
    
}