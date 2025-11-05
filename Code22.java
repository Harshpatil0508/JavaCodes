// Inheritance
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Isha is Barking...");
    }
}

public class Code22 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // own method
    }
}
