package EducationalCourseHierarchy;

public class Course {
    private String courseName;
    private int duration;


    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public void getDetails(){
        System.out.println("Course name: "+courseName);
        System.out.println("Duration of Course: "+duration);
    }
}
