package UniversityWithFacultiesAndDepartments;

import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Department> departments;
    public University(String universityName){
        this.universityName = universityName ;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department){
        departments.add(department);

    }
    public void getUniversityDetails(){
        System.out.println("University Name : "+universityName);
        System.out.println("Department Names : ");
        for(Department department : departments){
            department.getDepartmentDetails();
        }
    }

}
