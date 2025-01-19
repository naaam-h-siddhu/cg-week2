public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("Brush",40);
        Product p2 = new Product("Toothpaste",105);
        Product p3 = new Product("Mat",60);
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        Product.displayTotalProducts();
    }
}
class Product{
    private String productName;
    private int price;
    static private int totalProducts = 0;

    public Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price of product: "+price);
    }
    public static void displayTotalProducts(){
        System.out.println("Total number of products = "+totalProducts);
    }
}