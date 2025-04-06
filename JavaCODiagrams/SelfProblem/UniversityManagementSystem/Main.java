package UniversityManagementSystem;

public class Main {
    public static void main(String[] args) {


        // Creating some courses
        Course c1 = new Course("Physics");
        Course c2 = new Course("Math");

        Professor p1 = new Professor("Siddhu Singh");
        Professor p2 = new Professor("Prinshu Singh");
        Professor p3 = new Professor("Yuvraj Singh");
        Professor p4 = new Professor("Manish Jha");


        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(3, "Charlie");
        Student s4 = new Student(4, "Diana");
        Student s5 = new Student(5, "Eve");
        Student s6 = new Student(6, "Frank");
        Student s7 = new Student(7, "Grace");
        Student s8 = new Student(8, "Hank");
        Student s9 = new Student(9, "Ivy");
        Student s10 = new Student(10, "Jack");

        // Assigning professor to the course
        c1.assignProfessor(p1);
        c1.assignProfessor(p4);
        c2.assignProfessor(p2);
        c2.assignProfessor(p3);

        // Enrolling students to course
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s3.enrollCourse(c2);
        s5.enrollCourse(c1);
        s4.enrollCourse(c2);
        s9.enrollCourse(c1);
        s8.enrollCourse(c1);
        s7.enrollCourse(c2);
        s10.enrollCourse(c1);
        s6.enrollCourse(c1);


        // Get course details
       c1.getCourseDetails();
       c2.getCourseDetails();

    }


}
