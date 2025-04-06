package EmployeeManagementSystem;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(int id, String name, int salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }
}

