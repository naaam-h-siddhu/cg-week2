package EmployeeManagementSystem;

public class Intern extends Employee {
    private int timePeriod;

    public Intern(int id, String name, int salary, int timePeriod) {
        super(id, name, salary);
        this.timePeriod = timePeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Time Period : "+timePeriod);
    }
}
