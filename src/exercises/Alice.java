package exercises;
import  java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        //storing sentence as string
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        //prompt user for a term to search within string
        System.out.println("Enter a term to search for: ");
        String searchTerm = input.nextLine();


        //print whether the search term was found, make it search case-insensitive
        boolean isFound = sentence.toLowerCase().contains(searchTerm.toLowerCase());



        System.out.println("Search term found: " + isFound);

}
}