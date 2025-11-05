// Single Inheritance
class A {
    void showA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B method");
    }

}

public class Code23 {
     public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }
}
