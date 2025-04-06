package EmployeeManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        PartTimeEmployee emp1 = new PartTimeEmployee(1, "Siddhu", 10000, 40, 500);

        FullTimeEmployee emp2 = new FullTimeEmployee(2,"Sudhakar",4000,50000);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        for(Employee employee : employees){

            employee.displayDetails();
            System.out.println();
        }


    }
}
