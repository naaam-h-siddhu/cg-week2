public class ShoppingCartSystem {
    public static void main(String[] args) {
        Products a = new Products(1,"Brush",30,40);
        a.getTotalPrice();
        Products.updateDiscount(20);
        a.getTotalPrice();
        if(a instanceof Products){
            System.out.println("Yes a is instance of Products");
        }
    }
}
class Products{
    private static int discount = 10;
    private final int productId;
    private int price;
    private String productName;
    private int quantity;
    public Products(int productId,String productName, int price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }
    public static void updateDiscount(int newDiscount){
        discount = newDiscount;
    }
    private double totalPrice(){
        double  discountedPrice = (double) price - (price * (discount/100.0));
        return discountedPrice*quantity;
    }
    public void getTotalPrice(){
        System.out.println("total price after discount = "+totalPrice());
    }

}
