package exercises;

public class ArrayPractice2
{
    public static void main(String[] args) {
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        // split sentence at each space and store words in an array
        String[] words = phrase.split(" ");

        //print each word in the array
        for (String word: words) {
            System.out.println(word);
        }
    }
}
