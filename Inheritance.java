// Example for Inheritance

class animal {
    // Attribute
    String name;

    // Constructor
    public animal(String name) {
        this.name = name;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Child class) inheriting from Animal
class dog extends animal {
    // Additional attribute
    String breed;

    // Constructor
    public dog(String name, String breed) {
        super(name); // Call the superclass constructor
        this.breed = breed;
    }

    // Additional method
    public void bark() {
        System.out.println(name + " (" + breed + ") is barking.");
    }
}

// Main class to test inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        dog myDog = new dog("Buddy", "Golden Retriever");

        // Call methods from the superclass (Animal)
        myDog.eat();   // Inherited from Animal
        myDog.sleep(); // Inherited from Animal

        // Call method from the subclass (Dog)
        myDog.bark();  // Specific to Dog
    }
}