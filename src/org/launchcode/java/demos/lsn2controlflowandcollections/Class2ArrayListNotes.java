package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.ArrayList;
import java.util.Collections;

// arrayList must have elements that are all the same type and this must be specified using
// wrapper class rather than primitives (Integer instead of int)
// flexible size
//declare an empty ArrayList simply by calling the constructor

//Sorting note: must import collections class from java.util // collections.sort(list)


public class Class2ArrayListNotes {
    public static void main(String[] arg) {
        //inside main method of class
        //ArrayList<String> fruits = new ArrayList<>();
        //ArrayList TYPES   names =  call constructor


        // TODO: declare an empty ArrayList that can hold date of type String
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("kiwi");

        //Print the list
        System.out.println(fruits);

        //Print list size
        System.out.println(fruits.size());

        //sort it
        Collections.sort(fruits);
        System.out.println(fruits);

        // TODO: Declare an empty ArrayList that can hold data of type Integer

        ArrayList<Integer> scores = new ArrayList<>();

        // Add 5 scores to it
        scores.add(10);
        scores.add(20);
        scores.add(30);
        scores.add(40);

        //print the list
        System.out.println(scores);

        //print size
        System.out.println(scores.size());


    }
}
