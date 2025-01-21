package CompanyAndDepartment;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departmentArrayList;

    public Company(String name) {
        this.name = name;
        departmentArrayList =new ArrayList<>();
    }
    public void addDepartment(Department d){
        departmentArrayList.add(d);
    }
    public void getCompanyDetails(){
        for(Department d : departmentArrayList){
            d.getDepartent();
            d.getEmployees();
        }
    }
}
