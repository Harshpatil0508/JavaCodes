public class Code15 {
    // Non parameterised function
    static void display(){
        System.out.println("Even chai takes a break when Isha smile... because sweetness overloaded!");
    }

    // Parameterised function
    static void add(int a, int b){
        System.out.println("The addition is : "+ (a+b));
    }

    // Function with int return value
    static int square(int a){
        return (a*a);
    }

    public static void main(String[] args) {
        display();
        add(10, 5);

        int res = square(5);
        System.out.println("The square of number is : " + res);
    }
}
