package org.launchcode.java.demos.lsn3classes1;

public class ClassesNObjectsPart1Notes {


    // this. example

    public class Book {


      private String title;
        // private = use inside class only
        //title = field


        public String getTitle() {
            // public = no restrictions on use
            // getTitle() = no parameter
            // getTitlte() = getter
            return title;
        }

        public void setTitle(String title) {
            // setTitle = use anywhere within package
            // has parameter of same name
            // setTitle = setter
            this.title = title;
        }

        public class Book2 {
            // constructors example
            // it's possible to have optional parameters
            // define additional constructors of the same name
            // simplify by calling the primary constructor to set default values

            private String title;
            private String author;
            private int numPages;

            public Book2(String title, String author, int numPages) {
                this.title = title;
                this.author = author;
                this.numPages = numPages;
            }
            public Book2(String title, String author){
                // if third param is left off, code will know to use this second constructor and auto set numPages as 0
                this(title, author, 0);
            }
        }

        public class Book3{
            // instance methods example
            // fields, constructor(s), and getters & setters first
            String author;
            boolean available;

            // INSTANCE METHODS
            String getTitleAndAuthor() {
                return title + " by " + author;
            }

            public void checkOut(){
                available = true;
            }
        }
    }

    // this. method --- when is this. method required?
    // usually optional but required when you would have a conflict with a local variable of the same name
    //you can avoid this by using a different name

    // Default vs Public vs Private
    // public access modifier allows a field or method to be avail anywhere
    // private allows a field or method avail ONLY inside the class **ALWAYS USE THE MOST RESTRICTIVE**
    // default can be used anywhere inside package but not outside that


    // Encapsulation
    // keeps relevant code together (per class and per package)
    // use access modifiers to allow changes only in places that are truly necessary
    // fields should almost always be private and special methods called getters and setters use instead

    // Writing getters and setters
    // getField() and setField () is pretty universal
    // for booleans, the getter convention is isField()
    // why use? add behavior when data is retrieved or set or add validation to setters or specific access for getting diff than setting

    // Constructors
    // in java, it's a method, named as the same as the class
    // does not have a return type
    // parameters should be individually typed
    // when initializing fields w the constructor, use the this keyword if necessary to avoid variable name conflicts

    // Methods
    // instance methods: to add methods other than getters/setters, define at bottom of the class

    // DESIGNING CLASSES
    // single responsibility principle: each class should define behavior for its own data
    // think it through: what fields are needed? data types? is a constructor needed to set field values at instantiation?
    // what getters & setters are needed?
    // what level of access should each field and method have?

    // Book class
    // String title
    // String author
    // int numPages
    // boolean available
    // getTitleAndAuthor()
    // checkOut()
    // checkIn()

    // Library class
    // ArrayList<Book> books
    // addBook()
    // printAvailableBooks()


}


