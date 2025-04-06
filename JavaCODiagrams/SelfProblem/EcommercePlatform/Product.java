package EcommercePlatform;

public class Product {
    private int product_id;
    private String product_name;
    private int price;
    private int quantity;



    public Product(int product_id, String product_name, int price, int quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }
    public void getProductDetails(){
        System.out.println("        Product id : "+product_id);
        System.out.println("        Product Name : "+product_name);
        System.out.println("        Price : "+price);
        System.out.println("        quantity : "+quantity);
    }

}

