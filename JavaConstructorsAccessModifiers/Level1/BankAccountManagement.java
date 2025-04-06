public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount2 sbi = new BankAccount2(100421212, "Munni badnam");
        sbi.update(32222);
        sbi.getBalance();
        sbi.getInfo();
        SavingAccount cbi = new SavingAccount(121212211,"Pritam Pyaare",8);
        cbi.getInfo();
    }
}
class BankAccount2{
    public long accountNumber;
    protected String accountHolder;
    private int balance;

    public BankAccount2(long accountNumber, String accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    public void update(int balance){
        this.balance = balance;
    }
    public void getBalance(){
        System.out.println("Balance : "+balance);
    }
    public void getInfo(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder Name : "+accountHolder);
    }
}

class SavingAccount extends BankAccount2{
    private int ageOfAccount;

    public SavingAccount(long accountNumber, String accountHolder,int ageOfAccount){
        super(accountNumber, accountHolder);
        this.ageOfAccount = ageOfAccount;
    }
    public void getInfo(){
        System.out.println("Account Number:  "+accountNumber);
        System.out.println("Account Holder Name:  "+accountHolder);
        System.out.println("Age of Account:  "+ageOfAccount);
    }
}

