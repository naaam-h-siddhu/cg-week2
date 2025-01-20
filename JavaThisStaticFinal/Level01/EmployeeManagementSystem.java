public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employees e1 = new Employees("Siddhu",101, "SDE1");
        Employees e2 = new Employees("Babuaan",199,"Power Star");
        Employees.setCompanyName("Bihar");
        Employees.displayTotalEmployees();
        if(e1 instanceof Employees){
            System.out.println("Yes its a instance of Class  Employees");
        }
    }
}

class Employees{
    private static String  companyName;
    private String name;
    final private int id;
    private static int count = 0;
    private String designation;

    public Employees(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        count++;
    }
    public static void setCompanyName(String newCompanyName){
        companyName = newCompanyName;
    }
    public static void displayTotalEmployees(){
        System.out.println("Total employees are "+count);
    }

}