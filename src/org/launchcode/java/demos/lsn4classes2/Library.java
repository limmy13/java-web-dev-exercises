package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Library {

    // TODO: Ensure books cannot be overwritten by another object
    //  Also, make books available to package


    // TODO: Declare a field, books, as an ArrayList of Book objects
    // Give it private access // took private off so books can be accessed
    final ArrayList<Book> books = new ArrayList<>();

    // TODO: WRite a custom equals() method to compare the contents of the books
    // Use the @Override annotation
    // First include a reference check, null check, class check, and case (see chapter 5.3.2.2)
    // Finally, loop through both lists and compare the books on their title & author
    @Override
    public boolean equals(Object toBeCompared) {
        // reference check
        if(this == toBeCompared) {
            return true;
        }

        // null check
        if (toBeCompared == null) {
            return false;
        }

        // class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        // cast
        Library otherLibrary = (Library) toBeCompared;

        // compare size of book list
        if (books.size() != otherLibrary.books.size()) {
            return false;
        }

        // custom comparison
        for (Book book: books) {
            int index = otherLibrary.findBook(book.getTitle(), book.getAuthor());
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

    // Note: no constructor is required to instantiate a library object

    // TODO: Define a public method, addBook()
    public void addBook(Book book) {
        books.add(book);
    }

    public int findBook(String title, String author) {
        for (Book book: books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return books.indexOf(book);
            }
        }
        return -1;
    }
    // TODO: Define a public method, printAvailableBooks()
    // It should print only books that aren't checked out
    public void printAvailableBooks() {
        System.out.println("\nLIST OF AVAILABLE BOOKS: ");
        for (Book book: books) { //checks book of our books
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }
}
