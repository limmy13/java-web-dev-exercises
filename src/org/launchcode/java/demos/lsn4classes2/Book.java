package org.launchcode.java.demos.lsn4classes2;

public class Book {
    // FIELDS
    // TODO: Declare a class-level int field that will hold the next available number for book IDs
    // Initialize it to 1
    private static int nextIdNum = 1;

    // TODO: Declare a String field for each unique bookID, but do not initialize it
    // Make sure each book's ID cannot be changed after it is set in the constructor
    private final String bookId;
    private String title;
    private String author;
    private boolean available = true;
    private int numPages;

    // CONSTRUCTORS
    // TODO: In the primary constructor, set the bookID (but not using a parameter) using instance method

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.bookId = generateBookId(); // put after title and author fields so that it has something to grab
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    // GETTERS & SETTERS
    // TODO: Add a getter for the static field nextIdNum that can be called on the class
    // Use the IntelliJ generator and notice it makes it a static method automatically
    // Then customize to make it a meaningful sentence and change the return type to String
    public static String getNextIdNum() {
        return "The next available ID number is " + nextIdNum;
    }


    // TODO: Add a getter for bookId (but no setter since it is final)
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // OVERRIDING SPECIAL METHODS
    // TODO: Write a custom toString() method that nicely formats the book data
    // Use the @Override annotation
    @Override
    public String toString() {
        return "\n" + getTitleAndAuthor() + "\n" + numPages + "pages " + "\nID: " + bookId;

    }


    // INSTANCE METHODS
    // TODO: Define an instance method to generate a unique book Id
    // It should be private because we want it to be called ONLY from the constructor
    // Use the format (author initials)-(first three letters of the title)-(next avail number)
    // All letters should be capped
    // Increment the next ID number for the class to use next time a new Book object is instantiated

    private String generateBookId() {
        String id = Utils.getInitials(author) + "-" + title.substring(0,3).toUpperCase() + "-" + nextIdNum;
        // nextIdNum is static class level that will always be different every time we instantiate a new object
        // nextIdNum = unique number to this unique combination of initials, first three letters of book title
        nextIdNum++; //increment so that the class is now going to hold the next number and when we create the next book, it'll hold the new number
        return id;
    }

    String getTitleAndAuthor() {
        return title + " by " + author;
    }

    public void checkOut() {
        available = false;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked out of the library.");
    }
    public void checkIn() {
        available = true;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked in.");
    }



}


