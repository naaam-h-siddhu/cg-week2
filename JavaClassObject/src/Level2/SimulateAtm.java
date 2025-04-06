public class SimulateAtm {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Sudhakar Singh",763923 , 1000);
        account1.currentBalance();
        account1.deposit(500);
        account1.withdrawing(1400);
        account1.currentBalance();
        account1.withdrawing(150);
    }
}
class BankAccount{
    private String accountHolder;
    private long accountNumber;
    private int balance;

    public BankAccount(String accountHolder , long accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Successfully deposited");
    }
    public void withdrawing(int amount){
        if(amount > balance)
            System.out.println("Insufficient balance!!");
        else{
            System.out.println("Successfully withdraw");
            balance-=amount;
        }
    }
    public void currentBalance(){
        System.out.println("Current balance : "+balance);
    }


}
