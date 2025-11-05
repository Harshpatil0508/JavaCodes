// Abstraction 
// Abstract class
abstract class Animal {
    abstract void sound();  // abstract method

    void eat() {  // concrete method
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barks");
    }
}

public class Code34 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
