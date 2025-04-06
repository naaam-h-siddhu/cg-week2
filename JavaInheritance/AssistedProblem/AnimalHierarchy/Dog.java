package AnimalHierarchy;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }
}
