// Abstraction Example

abstract class Bank {
    abstract void loan();
    void display() {
        System.out.println("Welcome to our bank");
    }
}

class HDFC extends Bank {
    void loan() {
        System.out.println("Home loan @8.5%");
    }
}

class ICICI extends Bank {
    void loan() {
        System.out.println("Personal loan @10.25%");
    }

}

public class Code36 {
    public static void main(String[] args) {
        Bank b = new HDFC();
        b.display();
        b.loan();

        b = new ICICI();
        b.display();
        b.loan();
    }
}
