package OnlineRetailOrderManagement;

public class Main {
    public static void main(String[] args) {


        Order o1 = new Order(1, "12 jan");
        ShippedOrder s1 = new ShippedOrder(1, "12 Jan", 424242);
        DeliveredOrder d1 = new DeliveredOrder(1, "12 Jan", 424242, "20 Jan");
        d1.getOrderStatus();
    }
}
