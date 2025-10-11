
import java.awt.Point;

public class Code2 {
    public static void main(String[] args) {
        // Primitive Type
        byte x = 10;
        byte y = 20;
        x = 30;
        System.out.println(y);

        // Reference Type
        Point p1 = new Point(1, 2);
        System.out.println(p1.x); // Outputs 1
        Point p2 = p1; // p2 references the same object as p1
        p1.x = 100;
        System.out.println(p2.x); // Outputs 100, as p2 references the same
        System.out.println(p1.x);
    }
    
}
