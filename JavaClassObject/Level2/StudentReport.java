public class StudentReport {
    public static void main(String[] args){
        Student siddhu = new Student("Sudhakar Singh",165, 88);
        siddhu.calculateGrade();
        siddhu.displayDetails();
    }
}
class Student{
    private String name;
    private int rollNumber;
    private int marks;
    private char grade;
    public Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void calculateGrade(){
        if(marks > 100){
            System.out.println("Enter a valid marks");
        }
        else if(marks >= 90 && marks <= 100){
            grade = 'A';
        }
        else if(marks >= 80 && marks <90)
            grade = 'B';
        else if(marks >= 70 && marks < 80)
            grade = 'C';
        else if(marks >= 60 && marks < 70)
            grade = 'D';
        else if(marks >= 50 && marks < 60)
            grade = 'E';
        else
            grade = 'F';
    }
    public void displayDetails(){
        System.out.println("Name :"+name+"\nRoll Number :"+rollNumber);
        System.out.println("Marks :"+marks+"\nGrade :"+grade);
    }
}
