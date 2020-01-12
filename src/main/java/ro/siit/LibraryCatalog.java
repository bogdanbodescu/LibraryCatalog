package ro.siit;

import java.util.ArrayList;

/**
 * Class used to model the Library Catalog. It contains an ArrayList of the books.
 */
public class LibraryCatalog {
    private ArrayList<Book> t;

    /**
     * Class LibraryCatalog Constructor
     */
    public LibraryCatalog(){
        this.t= new ArrayList<Book>();
    }

    /**
     *
     * @param b - Book Object
     *          Used for mentioning what book to be added to the Catalog
     * Function is used to add a book sent by parameter into the Catalog
     */
    public void addBook(Book b){
        if(t.contains(b))
        {
            System.out.println("This book already exists in your collection. It was not added.");
        }
        else
        {
            t.add(b);
        }
    }

    /**
     *
     * @param name - Name of the book we want to remove
     * Method used to remove a book by mentioning its name
     */
    public void removeBookByName(String name){
        Book temp=null;

        for(Book b:t){
            if(name.equals(b.getName())){
                temp=b;
                break;
            }
            else{}
        }

        if(temp != null){
            t.remove(temp);
            System.out.println("The book has been removed!");
        }
        else{
            System.out.println("The book you mentioned does not exist. Try again!");
        }
        System.out.println();
    }

    /**
     *
     * @param number - the ordered number of the book we want to remove (e.g. using 1 for removing the first book from the ArrayList)
     * Function used to remove a book by its rank
     */
    public void removeBookByOrder(int number){
        if(number<1 || t.size()<(number-1))
        {
            System.out.println("We could not remove the book because the number provided is not valid! Try again.");
        }
        else
        {
            t.remove(number-1);
        }
    }

    /**
     * Function used to list all of the books stored in the Library Catalog
     */
    public void listBooks(){
        if(t.size()==0)
        {
            System.out.println("Sorry, the library catalog is empty :(.");
        }
        else
        {
            for(int i=0;i<t.size();i++){
                System.out.println(t.get(i));
            }
        }
        System.out.println();
    }

}
