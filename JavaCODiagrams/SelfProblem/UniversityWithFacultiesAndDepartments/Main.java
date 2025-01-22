package UniversityWithFacultiesAndDepartments;

public class Main {
    public static void main(String[] args) {
        University tit = new University("Technocrats Intitute Of Technology");
        Department d1 = new Department("CSE");
        Department d2 = new Department("IT");

        Faculty f1 = new Faculty(101,"Siddhu Singh");
        Faculty f2 = new Faculty(102, "Nitish Kumar Singh");
        Faculty f3 = new Faculty(103,"Karan Kumar");
        Faculty f4 = new Faculty(104,"Prinshu Singh");
        // Adding faculties to the department
        d1.addFaculty(f1);
        d1.addFaculty(f2);
        d2.addFaculty(f3);
        d2.addFaculty(f4);
        // Adding Department to the University
        tit.addDepartment(d1);
        tit.addDepartment(d2);

        // Printing the whole University Details
        tit.getUniversityDetails();



    }
}
