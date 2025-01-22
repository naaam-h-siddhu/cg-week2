package EcommercePlatform;


public class Main {
    public static void main(String[] args) {


        // Creating a customer
        Customer c = new Customer(1001, "Siddhu Singh");

        // Creating orders
        Order o1 = new Order(1);
        Order o2 = new Order(2);
        // Associating orders with customers
        c.addOrder(o1);
        c.addOrder(o2);

        // Creating some products
        Product p1 = new Product(101,"Shampoo", 100, 1);
        Product p2 = new Product(102,"Bottle", 50,2);
        Product p3 = new Product(103, "Mobile Phone",30000,3);
        Product p4 = new Product(104, "Earphones", 1000, 1);

        // Associating the products with orders
        o1.addProduct(p1);
        o1.addProduct(p2);
        o2.addProduct(p3);
        o2.addProduct(p4);

        o1.getOrderDetails();
        o2.getOrderDetails();
    }

}
