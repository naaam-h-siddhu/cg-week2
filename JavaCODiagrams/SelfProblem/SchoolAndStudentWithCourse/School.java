package SchoolAndStudentWithCourse;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        students = new ArrayList<>();
        this.schoolName = schoolName;
    }
    public void addStudent(Student s){
        students.add(s);
    }

}
