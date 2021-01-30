package com.Playtika.LearningJava;
import java.util.Scanner;

public class Menu extends BankAccount{
    String welcomeMessage = "Welcome " + customerName;
    String idMessage = "Your Id is: " + customerId;
    String optionsMessage = "A - Check Balance" + "\r\n" + "B - Deposit" + "\r\n" + "C - Withdraw" + "\r\n" + "D - Previous Transaction" +
                            "E - Exit";

    public Menu(String cName, String cId) {
        super( cName, cId );
    }
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        char option = '\0';
        System.out.println(welcomeMessage + "\r\n" + idMessage + System.lineSeparator());
        System.out.println("Select one of the below options: " + "\r\n" + optionsMessage);


        do{

            System.out.println("Enter an option");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println( "Your current balance is: " + balance );
                    break;
                case 'B':
                    System.out.println( "Enter the amount you'd like to deposit: " );
                    int amount = scanner.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println( "Enter the amount you'd like to withdraw: " );
                    int amount2 = scanner.nextInt();
                    withdraw( amount2 );
                    break;
                case 'D':
                    getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println( "Operation terminated!" );
                    break;
                default:
                    System.out.println( "Invalid option! Please choose one of the below options: " + optionsMessage );

            }
        }while(option != 'E');

    }

}
