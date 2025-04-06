package EmployeeManagementSystem;

public class Manager extends Employee{
    private int teamSize;

    public Manager(int id, String name, int salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : "+teamSize);
    }
}
