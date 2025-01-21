package SchoolAndStudentWithCourse;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        students = new ArrayList<>();
        this.courseName = courseName;
    }
    public void enrollStudent(Student s)
    {
        students.add(s);
    }
    public void getCourse(){
        System.out.print(courseName+" ");
    }
    public void getCourseDetails(){
        System.out.println("Course name : "+courseName);
        System.out.print("Students enrolled: ");
        for(Student s: students){
            s.getStudentName();
        }
        System.out.println();
    }
}
