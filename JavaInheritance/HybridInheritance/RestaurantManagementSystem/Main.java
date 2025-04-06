package RestaurantManagementSystem;

public class Main {
    public static void main(String[] args) {


        Chef c = new Chef("Siddhu", 12);
        Waiter w = new Waiter("Sudhakar", 10);
        c.performDuties();
        w.performDuties();
//        Worker chef = new Chef("John", 101);
//        Worker waiter = new Waiter("Alice", 102);
//        chef.performDuties();
//        waiter.performDuties();
    }
}
