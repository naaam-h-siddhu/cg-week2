
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student2 aman = new Student2(32,"Aman Kumar",8.72);
        aman.getCgpa();
        aman.modifyCgpa(7.90);
        aman.displayStudentInfo();
        PostgraduateStudent madan = new PostgraduateStudent(89,"Mohan Singh",6.77,"Pharma");
        madan.PostgraduateStudentInfo();
    }
}
class Student2{
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student2(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public void getCgpa(){
        System.out.println("CGPA = "+CGPA);
    }
    public void modifyCgpa(double newCgpa){
        CGPA = newCgpa;
    }
    public void displayStudentInfo(){
        System.out.println("Roll number: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+CGPA);
    }

}
class PostgraduateStudent extends Student2{
    private String stream;

    public PostgraduateStudent(int rollNumber, String name, double CGPA,String stream) {

        super(rollNumber, name, CGPA);
        this.stream = stream;
    }
    public void PostgraduateStudentInfo(){
        System.out.println("RollNumber: "+rollNumber);
        //Accessing the protected member (name)
        System.out.println("name: "+name);
        System.out.println("stream: "+stream);
    }

}
