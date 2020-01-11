package ro.siit;

/**
 * Class used to model the implementation and behavior of the Albums
 */
public class Album extends Book {
    protected String qualityOfPaper;

    /**
     * Constructor
     * @param name - name of the Album
     * @param numberOfPages - number of pages of the Album
     * @param qualityOfPaper - quality of the album's paper
     */
    public Album(String name, int numberOfPages, String qualityOfPaper){
        super(name,numberOfPages);
        this.qualityOfPaper=qualityOfPaper;
    }

    /**
     * Method used to define how the information regarding an album will be returned
     * @return - Returns a string with the information about the album
     */
    @Override
    public String toString() {
        return super.toString() + "and the paper quality is " + qualityOfPaper + ".";
    }

}
