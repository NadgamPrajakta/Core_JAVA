package USS.com;

// Abstract class
abstract class AnimalBase {

    // Abstract method (no body)
    public abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass Dog
class DogAnimal extends AnimalBase {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class CatAnimal extends AnimalBase {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Program6 {
    public static void main(String[] args) {
        AnimalBase dog = new DogAnimal();
        AnimalBase cat = new CatAnimal();

        dog.sound();   // Output: Dog barks
        cat.sound();   // Output: Cat meows
        dog.sleep();   // Output: Sleeping...
    }
}
