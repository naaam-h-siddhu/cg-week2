public class OnlineCourseManagement {
    public static void main(String[] args) {

        Course be = new Course("Btech",48,400000);
        be.displayCourseDetails();
        System.out.println();
        Course.update("Frz College");
        be.displayCourseDetails();

    }
}
class Course{
    private String courseName;
    private int duration;
    private int fee;
    private static String instituteName = "XYZ Bhopal";

    public Course(String courseName, int duration, int fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration of Course: "+duration);
        System.out.println("Fee of the course: "+fee);
        System.out.println("Institute Name : "+instituteName);

    }
    public static void update(String updatedName){
        instituteName = updatedName;
    }
}
