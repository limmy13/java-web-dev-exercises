package exercises;

import java.util.HashMap;
import java.util.Map;

public class Class2StudioCharacterCounter {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // Convert the string to an array of characters
        char[] characters = text.toCharArray();

        // Create a HashMap to store character counts
        Map<Character, Integer> characterCounts = new HashMap<>();

        // Loop through the characters array and update the counts
        for (char letter : characters) {
            if (characterCounts.containsKey(letter)) {
                // If the character already exists in the map, increment its count
                int count = characterCounts.get(letter);
                characterCounts.put(letter, count + 1);
            } else {
                // If the character doesn't exist in the map, add it with count 1
                characterCounts.put(letter, 1);
            }
        }

        // Loop through the map and print the character counts
        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();
            System.out.println(letter + ": " + count);
        }
    }
}
