package UniversityWithFacultiesAndDepartments;

import com.sun.security.jgss.GSSUtil;

public class Faculty {
    private int facultyId;
    private String facultyName;

    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }
    public void getFacultyDetails(){
        System.out.print("      Id : "+facultyId);
        System.out.print("      Faculty Name : "+facultyName);
    }
}
