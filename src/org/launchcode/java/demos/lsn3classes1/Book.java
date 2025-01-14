package org.launchcode.java.demos.lsn3classes1;

public class Book {

    // FIELDS
    // TODO: Declare private fields title, author, available, and numPages
    // available should be initialized to true
    private String title;
    private String author;
    private boolean available = true;
    private int numPages;


    // CONSTRUCTORS
    // TODO: Define a constructor that takes title, author, and numPages
    public Book(String title, String author, int someNumPages) {
        this.title = title;
        this.author = author;
        numPages = someNumPages; // don't need this. as long as there's no conflict (using some, an, a, prefix)

    }

    // TODO: Define an alternate (overloaded) constructor that requires only title and author
    public Book(String title, String author) {
        this(title, author, 0);
    }

    // GETTERS & SETTERS
    // TODO: Use the IntelliJ generate feature to create getters & setters
    // Create both getters & setters for title, author, and numPages
    // Create only a getter for available (we will have instance methods to get this)

    // Writing from scratch:
    public String getTitle() {
        return title;
    }
    public void setTitle(String aTitle) {
        title = aTitle;
    }
   // Using IntelliJ: right click/generate/getter and setter/click ones you want
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


    // INSTANCE METHODS
    // TODO: Define a method, getTitleAndAuthor(), to return a string like "Book Title by Author Name"
    // It should have default access
    String getTitleAndAuthor() {
        return title + " by " + author;
    }

    // TODO: Define a method, checkOut(), with public access
    // It should change the availability and also print a statement with the title and author name
    // VOID means no return type
    public void checkOut() {
        available = false;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked out of the library.");
    }

    // TODO: Define a method, checkIn(), with public access
    // It should change the availability and also print a statement with the title and author name
    public void checkIn() {
        available = true;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked in.");
    }
}
