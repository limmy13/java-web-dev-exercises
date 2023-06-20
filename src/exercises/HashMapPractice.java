package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        // The HashMap variable students is renamed to classRoster to match the variable used in the rest of the code.
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        // The newStudent variable is declared as a String instead of an int, as it represents the student name.
        String newStudent;

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                input.nextLine(); // Consume the newline character after reading the ID
                classRoster.put(newID, newStudent);
            }
        } while (!newStudent.equals(""));

        input.close(); // The code calls input.close() at the end to close the Scanner object.

        System.out.println("\nClass roster:");


        // prints students names followed by corresponding IDs in the for loop
        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
            // prints # of students in the roster using classRoster.size()
        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
