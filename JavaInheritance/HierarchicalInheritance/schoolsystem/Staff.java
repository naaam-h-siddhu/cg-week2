package schoolsystem;

public class Staff extends Person{
    private String dutyHour;

    public Staff(String name, int age, String dutyHour) {
        super(name, age);
        this.dutyHour = dutyHour;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Staff");
    }
}
