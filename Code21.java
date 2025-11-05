class BankAccount {
    int accNo;
    String name;
    double balance;

    BankAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void show() {
        System.out.println("Account Number: "+accNo + " Name: " + name + " Balance: " + balance);
    }

}

public class Code21{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Isha", 5000);
        b1.deposit(1500);
        b1.withdraw(2000);
        b1.show();
    }
}
