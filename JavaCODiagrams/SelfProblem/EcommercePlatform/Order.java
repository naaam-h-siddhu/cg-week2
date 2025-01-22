package EcommercePlatform;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        products = new ArrayList<>();
        this.orderId = orderId;
    }
    public void addProduct(Product product)
    {
        products.add(product);
    }
    public void getOrderDetails(){
        System.out.println("    Order Id : "+orderId);
        System.out.print("    List of product: \n");
        for(Product product: products){
            product.getProductDetails();
            System.out.println();
        }
        System.out.println();
    }
}
