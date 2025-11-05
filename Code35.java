// Interface

interface Animal {
    void sound();     // abstract method
    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Barks");
    }

    public void eat() {
        System.out.println("Eats meat");
    }

}

public class Code35 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
