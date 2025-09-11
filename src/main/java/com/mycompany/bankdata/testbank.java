/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankdata;

/**
 *
 * @author A-2
 */
public class testbank {
    public static void main(String[] args) {
        Bankdata acc1 = new Bankdata ("095325000000979", "Sheikh Mohammad Fahad", 50000);
        Bankdata acc2 = new Bankdata ("095325000000980", "Raihan Mhamud", 0);
        Bankdata acc3 = new Bankdata ("095325000000981", "MD Mahmud Hasan Reyad", 70000);
        
        acc1.withdraw(20000.50);
        acc2.deposite(30000);
        acc1.deposite(2000);
        acc1.displayBalance();
        acc2.displayBalance();
        acc3.displayBalance();
        
    }
}
