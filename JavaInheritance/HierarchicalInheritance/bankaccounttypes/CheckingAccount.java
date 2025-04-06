package bankaccounttypes;

public class CheckingAccount extends BankAccount{
    private int withdrawalLimit;

    public CheckingAccount(long accountNumber, int balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}
