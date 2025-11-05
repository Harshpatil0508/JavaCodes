// Super keyword
// Call parent construtor
class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // calls Animal constructor
        System.out.println("Dog Constructor");
    }

}

public class Code27{
    public static void main(String[] args) {
        new Dog();
    }
}
