public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccounts sbi = new BankAccounts("siddhu singh",42434242);
        BankAccounts.setBankName("State Bank of India");
        sbi.getDetails();
        BankAccounts cbi = new BankAccounts("simpdhu", 245532324);
        BankAccounts.getTotalAccounts();
        if(cbi instanceof BankAccounts){
            System.out.println("Yes cbi is an instance of class BankAccounts");
        }

    }
}
class BankAccounts{
    private static int count = 0;
    static String bankName;
    private String accountHolderName;
    private final long accountNumber;


    public BankAccounts(String accountHolderName, long accountNumber){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        count++;
    }
    public static void setBankName(String newBankName){
        bankName = newBankName;
    }
    public static void getTotalAccounts(){
        System.out.println("Total number of accounts = "+count);
    }
    public void getDetails(){
        System.out.println("Account number : "+accountNumber);
        System.out.println("Bank name : "+bankName);
        System.out.println("Account holder name : "+accountHolderName);
    }



}
