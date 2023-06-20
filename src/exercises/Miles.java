package exercises;
import java.util.Scanner; //e allows us to use 'scanner' class for reading user input
public class Miles {
    public static void main(String[] args) {
        // use 'scanner' object named 'input' to handle user input
        Scanner input = new Scanner(System.in);
        // prompts user to enter #
        System.out.println("How many miles have you driven?");
        //to read the user's input as a 'double' we use 'nextDouble()' method of the 'scanner' object 'input'. the entered value is stored in variable 'numMiles'
        Double numMiles = input.nextDouble();

        System.out.println("How much gas did you use in gallons?");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + " mpg.");

        //by using the 'double' date type and the 'nextDouble' method, it's ensured that the program correctly handles decimal values entered by user and performs the desired calculations
    }
}
