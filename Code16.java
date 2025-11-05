
public class Code16 {
   // Method overloading
    static void display(String name){
        System.out.println("Hello "+name);
    }

    static void display(int n){
        System.out.println("The number is : "+n);
    }

    public static void main(String[] args) {
        display("Isha");
        display(25);
    }
}
