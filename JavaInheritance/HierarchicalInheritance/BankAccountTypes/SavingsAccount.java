package BankAccountTypes;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(long accountNumber, int balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Saving Account");
    }
}
