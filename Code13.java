
public class Code13 {
    // Implicit and explicit Type Casting in Java
    public static void main(String[] args) {
        System.out.println("Type Casting in Java:");

        // Implicit Type Casting (Widening)
        int intVal = 100;
        double doubleVal = intVal; // int to double
        System.out.println("Implicit Type Casting (int to double): " + doubleVal);

        // Explicit Type Casting (Narrowing)
        double anotherDoubleVal = 9.78;
        int anotherIntVal = (int) anotherDoubleVal; // double to int
        System.out.println("Explicit Type Casting (double to int): " + anotherIntVal);

        // Parse String to Integer
        String strNum = "123";
        int parsedInt = Integer.parseInt(strNum);
        System.out.println("Parsed String to Integer: " + parsedInt);
        parsedInt += 10;
        System.out.println("After adding 10: " + parsedInt);
        String backToStr = Integer.toString(parsedInt);
        System.out.println("Converted back to String: " + backToStr);

    }
}
