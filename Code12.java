public class Code12 {
    public static void main(String[] args){
        System.out.println("Operator Precedence in Java:");
        int a = 10;
        int b = 20;
        int c = 30;
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("a + b * c = " + result); // Outputs 610
        result = (a + b) * c; // Parentheses change the precedence
        System.out.println("(a + b) * c = " + result); // Outputs 900
        int x = 5;
        int y = 10;
        int z = 15;
        result = x + y - z * 2; // Multiplication first, then addition and subtraction
        System.out.println("x + y - z * 2 = " + result); // Outputs -15
        result = x + (y - z) * 2; // Parentheses change the order
        System.out.println("x + (y - z) * 2 = " + result); // Outputs -5

    }
}
