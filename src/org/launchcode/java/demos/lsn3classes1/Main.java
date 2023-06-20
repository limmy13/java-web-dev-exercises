package org.launchcode.java.demos.lsn3classes1;

public class Main {
    public static void main(String[] args) {

        // TODO: Instantiate a Library object called library
        Library library = new Library();

        // TODO: Instantiate 3 books -- two with numPages and one without
        Book book1 = new Book("Contact", "Carl Sagan", 430);
        Book book2 = new Book ("Nemesis", "Isaac Asimov", 360);
        Book book3 = new Book("1984", "George Orwell");

        // Test
//        System.out.println(book1.getTitle());
//        System.out.println(book2.getTitleAndAuthor());
//        System.out.println(book3.isAvailable());

        // TODO: Add each book to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // TODO: Print available books
        library.printAvailableBooks();

        // TODO: Check out first book
        book1.checkOut();
//        System.out.println(book1.isAvailable());

        // TODO: Print available books again
        library.printAvailableBooks();

        // TODO: Check out second book and check in first book
        book2.checkOut();
        book1.checkIn();

        // TODO: Print available books again
        library.printAvailableBooks();
    }
}
