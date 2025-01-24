package OnlineRetailOrderManagement;

public class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, long trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("ORDER SHIPPED !!! order id "+super.getOrderId()+" order date "+super.getOrderDate()+" tracking number : "+super.getTrackingNumber());

        System.out.println("Delivery Date :"+deliveryDate);
    }
}
