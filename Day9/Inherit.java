// Multiple inheritance using interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Class implementing multiple interfaces (multiple inheritance)
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

// Another example
interface Runnable {
    void run();
}

interface Jumpable {
    void jump();
}

class Athlete implements Runnable, Jumpable {
    public void run() {
        System.out.println("Athlete is running");
    }
    
    public void jump() {
        System.out.println("Athlete is jumping");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        
        Athlete athlete = new Athlete();
        athlete.run();
        athlete.jump();
    }
}