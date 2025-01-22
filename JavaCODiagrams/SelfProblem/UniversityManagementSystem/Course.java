package UniversityManagementSystem;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
        professors = new ArrayList<>();
    }

    public void getCourseName(){
        System.out.println("    course name: "+courseName);
    }
    public void assignProfessor(Professor professor){
        professors.add(professor);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void getCourseDetails(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Professors Name : ");
        for(Professor professor: professors){
            System.out.print(professor.getProfessorName()+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Students Name : ");
        for(Student student: students){
            student.getStudentDetails();
            System.out.println();
        }
        System.out.println();
    }
}
