package bankaccounttypes;

public class BankAccount {
    private long accountNumber;
    private int balance;

    public BankAccount(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountType(){
        System.out.println("Bank Account");
    }
}
