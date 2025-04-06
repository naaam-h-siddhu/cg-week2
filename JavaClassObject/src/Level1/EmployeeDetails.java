class Employee{
    private String name;
    private int id;
    private int salary;
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void getDetails(){
        System.out.println("Employee "+name+" id "+id+" have salary = "+salary);
    }
}
public class EmployeeDetails {

    public static void main(String[] args){
        Employee sidd = new Employee("Sudhakar Singh",101,100000);
        sidd.getDetails();
    }
}
