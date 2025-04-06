package CompanyAndDepartment;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Employee> employeeArrayList;
    public Department(String departmentName){
        this.departmentName = departmentName;
        employeeArrayList = new ArrayList<>();
    }
    public void addEmployee(Employee e){
        employeeArrayList.add(e);
    }
    public void getDepartent(){
        System.out.println("Name of department : "+departmentName);
    }
    public void getEmployees(){
        for(Employee e: employeeArrayList){
            e.getEmployeeDetails();
            System.out.println();
        }
    }
}
