// Runtime Polymorphism (Method Overriding)
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 5;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 7;
    }

}

public class Code32 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate: " + b.getRateOfInterest());

        b = new HDFC();
        System.out.println("HDFC Rate: " + b.getRateOfInterest());
    }
}
