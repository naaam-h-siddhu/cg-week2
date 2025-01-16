import java.util.Scanner;

public class InventoryOfItem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Item item = new Item(101,"Monitor", 1000);
        item.getData();
        System.out.println("Enter the number of quantities");
        int quantity = sc.nextInt();
        int totalPrice = item.getTotalPrice(quantity);
        System.out.println("Total price = "+totalPrice);
    }
}

class Item{
    private int itemCode;
    private String itemName;
    private int price;
    public Item(int itemCode, String itemName,int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void getData(){
        System.out.println("Item Code : "+itemCode);
        System.out.println("Item Name : "+itemName);
        System.out.println("Price of item : "+price);
    }
    public int getTotalPrice(int quantity){
        return price*quantity;
    }
}