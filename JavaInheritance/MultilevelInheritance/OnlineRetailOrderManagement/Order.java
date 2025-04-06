package OnlineRetailOrderManagement;

public class Order {
    private  int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void getOrderStatus(){
        System.out.println("ORDER PLACED !!! Order id: "+orderId+" order Date "+orderDate);
    }
}
