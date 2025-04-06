import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        CartItem apple = new CartItem();
        apple.addItem();
        apple.delete();
        apple.delete();
        apple.delete();
        apple.delete();


        apple.displayItem();
    }
}

class CartItem{
    private String itemName;
    private int price;
    private int quantity;


    public void addItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name:");
        itemName = sc.nextLine().trim();
        System.out.println("Enter the price of product(INR):");
        price = sc.nextInt();
        System.out.println("Enter the number of item:");
        quantity = sc.nextInt();
    }
    public void delete(){
        if(quantity == 0){
            System.out.println("NO Item left to remove");

        }
        else{
            quantity--;
            System.out.println("1 quantity deleted successfully");
        }

    }
    public int totalCost(){
        return quantity*price;
    }
    public void displayItem(){
        if(quantity == 0){
            System.out.println("OOPS !!! Item doesn't Exist to display");
        }
        else {
            System.out.println("Item Name: "+itemName);
            System.out.println("Item Price: "+price);
            System.out.println("Item quantity: "+quantity);
            System.out.println("Total price(INR): "+totalCost());
        }
    }


}