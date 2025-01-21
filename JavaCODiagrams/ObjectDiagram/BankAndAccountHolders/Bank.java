package BankAndAccountHolders;

import java.util.Scanner;

public class Bank {
    private String  name;
    private int balance;
    public void openAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        name = sc.nextLine().trim();
        System.out.println("Enter the inital balance");
        balance = sc.nextInt();

    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int money){
        if(money <0){
            System.out.println("Enter the amount in positive");
        }
        else
            balance+=money;
    }
    public void withdrawal(int money){
        if(money>balance){
            System.out.println("Insufficient Balance!!");
        }
        else {
            System.out.println("Successfully!!");
            balance-= money;
        }
    }
}

