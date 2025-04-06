package AnimalHierarchy;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!");
    }
}
