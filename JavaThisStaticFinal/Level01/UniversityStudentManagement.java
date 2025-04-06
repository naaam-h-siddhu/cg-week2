public class UniversityStudentManagement {
    public static void main(String[] args) {
        Students ram = new Students("Ram ", 1, 'A');
        ram.getDetails();

        Students sita = new Students("Sita", 2, 'B');
        Students.setUniversityName("Vidhyalay");
        sita.getDetails();
        Students.displayTotalStudents();
        if(ram instanceof Students){
            System.out.println("Yes ram is instance of Students");
        }
    }
}
class Students{
    private static String  universityName;
    private String name;
    private final int rollNumber;
    private char grade;
    private static int count = 0;

    public Students(String name, int rollNumber,char grade){
        this.grade = grade;
        this.rollNumber = rollNumber;
        this.name = name;
        count++;
    }
    public static void displayTotalStudents(){
        System.out.println("Total Students : "+count);
    }
    public static void setUniversityName(String newUniversityName){
        universityName = newUniversityName;
    }
    public void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number "+ rollNumber);
        System.out.println("Grade: "+grade);

    }

}
