// Super keyword
// Call Parent Method
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void eat() { System.out.println("Eating bones..."); }

    void display() {
        super.eat();  // calls parent class method
        eat();        // calls child class method
    }
   
}

public class Code26{
     public static void main(String[] args) {
        new Dog().display();
    }
}