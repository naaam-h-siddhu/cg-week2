package UniversityManagementSystem;

import java.util.ArrayList;


public class Student {
    private int rollNumber;
    private String studentName;
    private ArrayList<Course> courses;
    public Student(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        courses = new ArrayList<>();

    }
    public void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
    }
    public void getStudentDetails(){
        System.out.print(rollNumber+" "+studentName);
    }


}
