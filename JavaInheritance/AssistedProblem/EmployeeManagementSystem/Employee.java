package EmployeeManagementSystem;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Employee Id : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
}
