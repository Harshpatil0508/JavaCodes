// Method Overriding

class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }

    
}

public class Code28 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // calls child method
    }
}
