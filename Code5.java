import java.util.*;
public class Code5 {
    public static void main(String[] args) {

        System.out.println("Arrays in Java");

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println(numbers); // Prints the reference address
        System.out.println(numbers[0]); // Prints the first element
        System.out.println(Arrays.toString(numbers)); // Prints the entire array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int [] moreNumbers = {1, 2, 30, 4, 5};
        System.out.println(moreNumbers.length); // Length of the array
        System.out.println(moreNumbers[moreNumbers.length - 1]); // Last element
        Arrays.sort(moreNumbers); // Sort the array
        System.out.println(Arrays.toString(moreNumbers)); // Print sorted array

        // // Multi-dimensional array
        // int [][] matrix = new int[2][3];
        // matrix[0][0] = 1;
        // System.out.println(Arrays.toString(matrix)); // Print first element
        // System.out.println(Arrays.deepToString(matrix)); // Print multi-dimensional array

        // int [][] predefinedMatrix = {
        //     {1, 2, 3},
        //     {4, 5, 6}
        // };
        // System.out.println(Arrays.deepToString(predefinedMatrix)); // Print predefined multi-dimensional array

      
    }
}
