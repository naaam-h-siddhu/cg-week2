package EcommercePlatform;

import java.util.ArrayList;

public class Customer {
    private String customer_name;
    private int customer_id;
    private ArrayList<Order> orders;

    public Customer(int customer_id, String customer_name) {
        orders = new ArrayList<>();
        this.customer_name = customer_name;
        this.customer_id = customer_id;
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public void getCustomerDetails(){
        System.out.println("Customer Id: "+customer_id);
        System.out.println("Customer Name: "+customer_name);
        System.out.println("Order details:");
        for(Order order: orders){
            order.getOrderDetails();
        }
        System.out.println();
    }
}
