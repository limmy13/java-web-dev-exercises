import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        // create list of words
        ArrayList<String> words = new ArrayList<>();
        words.add("launch");
        words.add("code");
        words.add("rocks");
        words.add("my");
        words.add("socks");
        words.add("off");

        // prompt user to enter word length for the search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word length to search: ");
        int wordLength = scanner.nextInt();

        // call the method to print words with the specified length
        printWordLength(words, wordLength);
    }

    public static void printWordLength(ArrayList<String> words, int wordLength) {
        for (String word : words) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
