public class PalindromeCheck {
    public static void main(String[] args){
        PalindromeChecker pc = new PalindromeChecker("abccba");
        pc.displayResult(pc.checkPalindrome());
    }
}
class PalindromeChecker{
    private String text;

    public PalindromeChecker(String text){
        this.text = text;
    }
    public boolean checkPalindrome(){
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(text.length()-1-i))
                return false;

        }
        return true;
    }
    public void displayResult(boolean ispali){
        if(ispali){
            System.out.println("YES!!! "+text+" is palindrome");
        }
        else
            System.out.println("NO!!! "+text+" is not palindrome");
    }
}
