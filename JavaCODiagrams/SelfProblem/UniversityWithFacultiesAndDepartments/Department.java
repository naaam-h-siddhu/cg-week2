package UniversityWithFacultiesAndDepartments;

import java.util.ArrayList;

public class Department {
    private String departmentName;

    private ArrayList<Faculty> faculties;

    public Department(String departmentName) {
        faculties = new ArrayList<>();
        this.departmentName = departmentName;
    }
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    public void getDepartmentDetails(){
        System.out.println("    "+departmentName);
        System.out.println("  Employee List: ");
        for(Faculty faculty : faculties){
            faculty.getFacultyDetails();
            System.out.println();
        }
        System.out.println();
    }
}
