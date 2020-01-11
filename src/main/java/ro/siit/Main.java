package ro.siit;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Main class
 */
public class Main {

    /**
     *
     * @param args Parameter not used
     * Main function used to test the functionality of the program required for the homework
     */
    public static void main(String[] args) {

        //initialization of the Library catalog and adding dummy data
        LibraryCatalog h = new LibraryCatalog();
        for(int i=0;i<5;i++)
        {
            h.addBook(new Novel("Novel "+ (i+1),1 + (int)(Math.random()*1000), "comedy" ));
            h.addBook(new Album("Album "+ (i+1), 1 + (int)(Math.random()*1000), "high" ));
        }
        for(int i=0;i<5;i++)
        {
            h.addBook(new Novel("Novel "+ (i+6),1 + (int)(Math.random()*1000), "horror" ));
            h.addBook(new Album("Album "+ (i+6), 1 + (int)(Math.random()*1000), "low" ));
        }
        for(int i=0;i<5;i++)
        {
            h.addBook(new Novel("Novel "+ (i+11),1 + (int)(Math.random()*1000), "comedy" ));
            h.addBook(new Album("Album "+ (i+11), 1 + (int)(Math.random()*1000), "medium" ));
        }
        for(int i=0;i<5;i++)
        {
            h.addBook(new Novel("Novel "+ (i+16),1 + (int)(Math.random()*1000), "crime" ));
            h.addBook(new Album("Album "+ (i+16), 1 + (int)(Math.random()*1000), "high" ));
        }

        h.listBooks();

        //Remove the first 10 books
        for(int i=0;i<10;i++)
        h.removeBookByOrder(1);

        h.listBooks();
        h.removeBookByName("Novel 10");
        h.removeBookByName("Album 20");
        h.removeBookByName("Novel 101");
        h.removeBookByName("Album 12");
        h.listBooks();

    }
}
