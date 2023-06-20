package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        // double describes the type area will be (primitive)
        double area;
        double radius;
        // create scanner object to handle user input
        Scanner input = new Scanner(System.in);
        //create do while loop
        do {
            // prompt the user
            System.out.println("Enter a radius: ");

            // check if input is a valid double
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                //check if radius is negative or zero
                if (radius <= 0) {
                    System.out.println("Error. Radius must be a positive number.");
                } else {
                    // replace area calculation line with call to circle.getArea()---don't forget to pass argument into circle.getArea
                    area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is " + area);
                    break;
                }
            } else {
                System.out.println("Error. Invalid input. Enter a numeric value.");
                input.next(); //discard the invalid input
            }
        } while (true); // continue looping until valid radius is entered

        input.close();

    }
}


