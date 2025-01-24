package EducationalCourseHierarchy;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Physics",10);
        OnlineCourse o1 = new OnlineCourse("Math",110,"Youtube", true);
        PaidOnlineCourse p1 = new PaidOnlineCourse("Chemistry", 30, "Udemy", false,1000,20);

        c1.getDetails();
        System.out.println();
        o1.getDetails();
        System.out.println();
        p1.getDetails();

    }
}
