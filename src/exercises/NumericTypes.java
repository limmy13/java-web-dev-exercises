package exercises;
import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args) {
        // create scanner object to handle user input
        Scanner scanner = new Scanner(System.in);

        // prompt user for length of the rectangle
        System.out.print("Enter the length of the rectangle: ");

        // read user's input as a double value
        double length = scanner.nextDouble();

        // prompt user for width of the rectangle
        System.out.print("Enter the width of the rectangle: ");

        // read user's input as a double value
        double width = scanner.nextDouble();

        // calculate area of the rectangle
        double area = length * width;

        // print calculated area
        System.out.println("The area of the rectangle is " + area);

        // close scanner object to free resources
        scanner.close();

    }
}