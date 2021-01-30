package com.Playtika.LearningJava;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public BankAccount(String cName, String cId){
        this.customerName = cName;
        this.customerId = cId;
    }

    public void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount){
        if(amount > 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposit amount: " + previousTransaction);
        }else if(previousTransaction < 0){
            System.out.println("Wthdrawn amount: " + Math.abs(previousTransaction));
        }else{
            System.out.println("No transaction was made!");
        }
    }
}
