package SchoolAndStudentWithCourse;

public class Main {
    public static void main(String[] args) {
        // Creating a schoool
        School dav = new School("DAV public school");
        // Creating some courses
        Course c1 = new Course("Maths");
        Course c2 = new Course("Physics");
        Course c3 = new Course("Biology");
        Course c4 = new Course("Zoology");

        // Creating some students
        Student s1 = new Student("jinn");
        Student s2 = new Student("Shyam");
        Student s3 = new Student("Chaggan");
        Student s4 = new Student("Henry");

        s1.addCourse(c1);
        s1.addCourse(c3);
        s2.addCourse(c2);
        s2.addCourse(c4);
        s4.addCourse(c1);
        s4.addCourse(c3);
        s3.addCourse(c2);
        s3.addCourse(c1);

        // View student's Courses
        c1.getCourseDetails();
        c2.getCourseDetails();
        c3.getCourseDetails();
        c4.getCourseDetails();
        // view Course's Students
        System.out.println("-----------");
        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
        s4.getStudentDetails();

    }
}
