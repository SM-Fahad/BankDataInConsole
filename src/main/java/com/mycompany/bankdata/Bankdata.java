/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankdata;

/**
 *
 * @author A-2
 */
public class Bankdata {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    Bankdata (String accountNumber, String accountHolder, double initialbalance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    balance = initialbalance;
    }

    public void deposite (double amount) {
        balance = balance + amount;
        System.out.println("Dear Sir, "+ accountHolder + ", \n" +"Amount of TK. " + amount + " is deposited to your account." + " Your balance is: " + balance);
    }

    public void withdraw (double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Dear Sir, "+ accountHolder + ", \n" + "Amount of TK. " + amount + " is withdrwan from your account." + " Your balance is: " + balance);
        }else {
        System.out.println("Insufficient Balance. ");
        }
        
    }
    
    public void displayBalance (){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountHolder);
        System.out.println("Account Balace: " + balance);
    }
    
}
