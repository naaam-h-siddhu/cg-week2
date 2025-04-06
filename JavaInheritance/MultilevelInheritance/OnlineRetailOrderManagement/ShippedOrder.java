package OnlineRetailOrderManagement;

public class ShippedOrder extends Order{
    private  long trackingNumber;

    public ShippedOrder(int orderId, String orderDate, long trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public long getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public void getOrderStatus() {

        System.out.println("ORDER SHIPPED !!! order id "+super.getOrderId()+" order date "+super.getOrderDate()+" tracking number : "+trackingNumber);
    }
}
