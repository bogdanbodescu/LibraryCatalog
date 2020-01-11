package ro.siit;

/**
 * Class that models the implementation and behavior of the Novels
 */
public class Novel extends Book {
    protected String genre;

    /**
     * Constructor
      * @param name - Name of the Novel
     * @param numberOfPages - Number of pages of the Novel
     * @param genre - Genre of the Novel
     */
    public Novel(String name, int numberOfPages, String genre){
        super(name,numberOfPages);
        this.genre=genre;
    }

    /**
     * Method used to define how the information regarding a novel will be returned
     * @return - Returns a string with the information about the novel
     */
    @Override
    public String toString() {
        return super.toString() + " and its genre is " + this.genre +".";
    }
}
