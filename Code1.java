import java.util.*;
// Isha coder
public class Code1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Primitive Data Types.");
        int value = 42; // 4 bytes
        byte age = 25; // 1 bytes (-127 to 128)
        long bigValue = 3_123_456_789L;     // 8
        System.out.println("Big Value:" + bigValue);
        float floatValue = 3.14F; // 4
        double doubleValue = 3.141592653589793; // 8
        char character = 'A'; // 2
        boolean isJavaFun = true; // 1

        // String is a reference type, because it refers to an object, but for declaration purposes, we treat it like a primitive type.
        String greeting = "Welcome to Java programming!";

        Date now = new Date();
        System.out.println(now);
    }
}

