package RestaurantManagementSystem;

public class Chef extends Person implements Worker{
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(super.getName()+" is performing chef duty");
    }
}
