package AnimalHierarchy;

public class Bird extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Chirp!");
    }
}
