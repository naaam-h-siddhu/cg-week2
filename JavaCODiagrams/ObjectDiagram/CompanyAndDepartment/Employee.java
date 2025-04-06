package CompanyAndDepartment;

public class Employee {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
    public void getEmployeeDetails(){
        System.out.println("Name: "+name);
        System.out.println("Employee Id: "+empId);
    }
}
