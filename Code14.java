public class Code14 {
    // Math class in Java
    public static void main(String[] args) {
        System.out.println("Math Class in Java:");
        int a = -10;
        int b = 20;
        double x = 5.7;
        double y = 2.3;

        // Absolute value
        System.out.println("Absolute value of a: " + Math.abs(a)); // 10

        // Power
        System.out.println("a raised to the power of 2: " + Math.pow(a, 2)); // 100.0

        // Square root
        System.out.println("Square root of b: " + Math.sqrt(b)); // 4.47213595499958

        // Maximum and Minimum
        System.out.println("Maximum of x and y: " + Math.max(x, y)); // 5.7
        System.out.println("Minimum of x and y: " + Math.min(x, y)); // 2.3

        // Rounding
        System.out.println("Rounded value of x: " + Math.round(x)); // 6
        System.out.println("Ceiling value of x: " + Math.ceil(x)); // 6.0
        System.out.println("Floor value of x: " + Math.floor(x)); // 5.0

        // Random number between 0.0 and 1.0
        System.out.println("Random number: " + Math.random());
        System.out.println("Random number between 0 and 100: " + (int)(Math.random() * 100));
    }
    
}
