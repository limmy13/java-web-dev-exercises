package org.launchcode.java.demos.lsn2controlflowandcollections;
import  java.util.Arrays;
public class Class2ArrayNotes {
// you can initialize a Java array with values using curly braces {}
    //get size with .length

    public static void main(String[] arg) {
        // TODO: Declare an empty Array that can hold 20 integers
        int[] someNumbers = new int[20];
        someNumbers[0] = 2;
        someNumbers[1] = 5;
        someNumbers[2] = 6;

        // Use Array.toString(arr) to print
        System.out.println((Arrays.toString(someNumbers)));

        // TODO: Declare an Array that can hold 3 strings

        String[] authorName = new String[3];
        authorName[0] = "Jasmine";
        authorName[1] = "Lim";
        authorName[2] = "Name";
    }
}
