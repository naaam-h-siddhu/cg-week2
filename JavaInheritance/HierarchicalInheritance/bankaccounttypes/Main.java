package BankAccountTypes;

public class Main{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1121,1000);
        SavingsAccount s1 = new SavingsAccount(111,50000,12);
        CheckingAccount c1 = new CheckingAccount(433322,1000,500);
        FixedDepositAccount f1 = new FixedDepositAccount(90999,100000,12);

        b1.displayAccountType();
        s1.displayAccountType();
        c1.displayAccountType();
        f1.displayAccountType();
    }
}
