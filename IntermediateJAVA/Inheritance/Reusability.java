package Inheritance;


public class Reusability {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Reused from Animal
        d.bark();

        Cat c = new Cat();
        c.eat();   // Reused from Animal
        c.meow();
    }
}


class Animals {
    void eat() { // Method
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animals {
    void meow() {
        System.out.println("Cat meows.");
    }
}