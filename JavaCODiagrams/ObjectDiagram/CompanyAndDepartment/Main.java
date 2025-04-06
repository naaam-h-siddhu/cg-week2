package CompanyAndDepartment;

public class Main {
    public static void main(String[] args) {
        Company cg  = new Company("eTutor");

        Department dept1 = new Department("IT");
        Department dept2 = new Department("Sales");



        Employee siddhu = new Employee("Siddhu singh", 101);
        Employee ram = new Employee("Ram", 102);
        Employee dholu = new Employee("Dholu", 103);
        Employee bholu = new Employee("Bholu Sing",104);

        //Adding the employees to the departement
        dept1.addEmployee(siddhu);
        dept1.addEmployee(ram);
        dept2.addEmployee(dholu);
        dept2.addEmployee(bholu);

        // Adding the depart to the company
        cg.addDepartment(dept1);
        cg.addDepartment(dept2);
//        dept1.getEmployees();
//        dept2.getEmployees();
        cg.getCompanyDetails();
        cg = null;
//        dept1.getEmployees();

//        cg.getCompanyDetails();
    }
}
