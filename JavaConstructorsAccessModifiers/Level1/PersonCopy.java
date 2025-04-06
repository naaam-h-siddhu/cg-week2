public class PersonCopy {
    public static void main(String[] args) {
        Person p1 = new Person("Neelu",21);//parameterised
        p1.getter();

        Person p2 = new Person(p1);//copy constructor
        p2.getter();
    }
}
class Person{
    private String name;
    private int age;
    public Person(){
        System.out.println("Default Constructor called !!");
        name = "Ram";
        age = 19;
    }
    public Person(String name , int age){
        System.out.println("Parameterised Constructor calles !!");
        this.name =  name;
        this.age = age;

    }
    //copy constructor
    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }
    public void getter(){
        System.out.println("Name = "+name+"\nage = "+age);
    }
}