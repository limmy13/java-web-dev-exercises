package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

// for each loops: declare type of local variable that will represent current piece of data from collection
// use colon to separate the local variable from the name of the collection
public class Class2Loops {
    public static void main(String[] arg) {
        // TODO: construct a for each loop to print each element of the words Array below
        String[] words = {"I", "am", "Learning", "Java"};
        for (String word : words) {
            System.out.println(word);
        }

        // TODO: Construct three for each lops for this HashMap
        HashMap<String, String> postcards = new HashMap<>();
        postcards.put("collection", "The Night Sky");
        postcards.put("amount", "50");
        postcards.put("theme", "space");

        //loop through keys and print each
        for (String key: postcards.keySet()){
            System.out.println(key);
        }

        // loop through values and print each
        for (String val: postcards.values()) {
            System.out.println(val);
        }
        // loop through entries (key/value pairs) and print each
        for (Map.Entry<String, String> entry: postcards.entrySet()){
            System.out.println("The key is: " + entry.getKey());
            System.out.println("The value is: " + entry.getValue());
        }

        // while loop TODO: construct a while loop to print each # in the array below as long as value is below 100
        int[] numbers = {2, 14, 33, 57, 94, 106, 123, 176};
        int index = 0;

        while (numbers[index] < 100) {
            System.out.println(numbers[index]);
            index++;

        }
        //do while loop --- put semicolon after while loop
        //TODO: construct a do-while loop to ask the user for movie titles until they enter "QUIT"
        //HINT: use .nextLine() to handle multi-word strings
        //unless quitting, add each title to collection
        // print collection after loop closes

        Scanner input = new Scanner(System.in);

        ArrayList<String> movieTitles = new ArrayList<>();
        String title;

        do {
            System.out.println("Please enter a movie title, or QUIT: ");
            title = input.nextLine();
            if (!title.equalsIgnoreCase("quit")) {
                movieTitles.add(title);
            }
        } while ( !title.equalsIgnoreCase("quit"));
        System.out.println(movieTitles);
    }
}
