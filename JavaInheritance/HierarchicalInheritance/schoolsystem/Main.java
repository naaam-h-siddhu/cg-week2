package schoolsystem;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Siddhu", 20);
        Teacher t1 = new Teacher("Karan", 25, "Math");
        Student s1 = new Student("Sumit", 23, 'A');
        Staff st1 = new Staff("Sudhakar", 33, "10");
        t1.displayRole();
        s1.displayRole();
        st1.displayRole();
    }
}
