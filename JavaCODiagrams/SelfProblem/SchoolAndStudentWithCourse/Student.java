package SchoolAndStudentWithCourse;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Course> courses;

    public Student(String studentName) {
        courses = new ArrayList<>();
        this.studentName = studentName;
    }
    public void getStudentName(){
        System.out.print(studentName+" ");
    }
    public void addCourse(Course s){
        courses.add(s);
        s.enrollStudent(this); // Association: Student Enroll in course
    }
    public void getStudentDetails(){
        System.out.println("Student name: "+studentName);
        System.out.print("Courses : ");
        for(Course c:courses ){
            c.getCourse();
        }
        System.out.println();
    }
}
