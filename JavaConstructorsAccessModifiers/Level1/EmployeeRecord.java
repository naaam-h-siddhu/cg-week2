public class EmployeeRecord {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(101,"Sales", 50000);
        e1.updateSalary(40000);
        e1.getEmployeeDetail();
        Manager m1 = new Manager(1,"Development",100000,10);
        m1.getManagerDetails();
    }
}
class Employee2{
    public int employeeID;
    protected String department;
    private int salary;

    Employee2(int employeeID, String department, int salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void updateSalary(int salary){
        this.salary = salary;
    }
    public void getEmployeeDetail(){
        System.out.println("Employee id: "+employeeID);
        System.out.println("Department: "+department);
        System.out.println("Salary : "+salary);
    }

}

class Manager extends Employee2{
    private int experience;
    public Manager(int employeeID, String departement, int salary , int experience){
        super(employeeID,departement,salary);
        this.experience = experience;
    }
    public void getManagerDetails(){
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Department: "+department);
        System.out.println("experience: "+experience+" years");
    }
}
