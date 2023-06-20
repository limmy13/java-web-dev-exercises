package exercises;

import java.util.ArrayList;


//Write a static method to find the sum of all the even numbers in an ArrayList.
// Within main, create a list with at least 10 integers and call your method on the list.

public class ArrayListPractice1 {
    public static void main(String[] args) {
        // Create a list with at least 10 integers

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Call the method to find the sum of even numbers
        int sum = findEvenNumberSum(numbers);

        System.out.println("Sum of even numbers: " + sum);
    }

    public static int findEvenNumberSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add the even number to the sum
            }
        }
        return sum;
    }
}


