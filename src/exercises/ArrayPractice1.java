package exercises;

public class ArrayPractice1 {

    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // loop through the array and print out each value then modify loop to print only odd numbers
        for(int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }
        }
    }
}
