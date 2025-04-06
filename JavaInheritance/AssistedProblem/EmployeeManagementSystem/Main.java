package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {


        Employee e1 = new Employee(1, "Siddhu", 100000);
        Manager m1 = new Manager(2, "Nitish", 4000000, 10);
        Developer d1 = new Developer(5, "Karan", 30000, "Java");
        Intern i1 = new Intern(4, "Sudhakar", 30000, 6);

        e1.displayDetails();
        System.out.println();
        m1.displayDetails();
        System.out.println();
        d1.displayDetails();
        System.out.println();
        i1.displayDetails();
    }
}
