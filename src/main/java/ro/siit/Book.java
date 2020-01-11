package ro.siit;

/**
 * Abstract class used to model the implementation and behavior of the Books
 */
abstract public class Book {
    protected String name;
    protected int numberOfPages;

    /**
     *
     * @param name - name of the book
     * @param numberOfPages - number of pages
     * Constructor
     */
    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    /**
     * Method used to define how the information regarding a book will be returned
     * @return - Returns a string with the information about the book
     */
    @Override
    public String toString(){
        return this.name+" has a number of "+this.numberOfPages+" Page(s)";
    }

    /**
     * Getter for name value
     * @return - returns the name value of the Book
     */
    public String getName(){
       return this.name;
    }
}
