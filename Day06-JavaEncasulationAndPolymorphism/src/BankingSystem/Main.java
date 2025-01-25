package BankingSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(235134123, "Siddhu Singh", 50000, 10);
        CurrentAccount c1 = new CurrentAccount(5353533, "Sumit kumar",43442 );

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(s1);
        bankAccounts.add(c1);

        for(BankAccount bankAccount: bankAccounts){
            bankAccount.getDetails();
            System.out.println();
        }
    }
}
