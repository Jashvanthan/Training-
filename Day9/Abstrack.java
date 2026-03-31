// Abstract class example
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();
    
    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Concrete subclass
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Concrete subclass
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.makeSound(); // Output: Woof!
        dog.eat();       // Output: Animal is eating
        
        cat.makeSound(); // Output: Meow!
        cat.eat();       // Output: Animal is eating
    }
}