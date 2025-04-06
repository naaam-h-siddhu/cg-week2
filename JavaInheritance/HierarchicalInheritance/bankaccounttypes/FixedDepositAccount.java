package bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    private int durationInMonth;

    public FixedDepositAccount(long accountNumber, int balance, int durationInMonth) {
        super(accountNumber, balance);
        this.durationInMonth = durationInMonth;
    }
}
