package BankAndAccountHolders;

public class Main {
    public static void main(String[] args) {
        Customer siddhu = new Customer("Siddhu","20");
        Bank b1 = new Bank();
        b1.openAccount();
        Bank b2 = new Bank();
        b2.openAccount();
        b2.deposit(6443);
        b1.withdrawal(1000);
        siddhu.addAccount(b1);
        siddhu.addAccount(b2);
        siddhu.viewBalance();
    }
}
