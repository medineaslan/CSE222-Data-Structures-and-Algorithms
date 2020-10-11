/**
 * Books class which keeps book's author name, title and location.
 */
public class Books {

    /**
     * Keeps author name of book.
     */
    private String authorName;
    /**
     * Keeps title of book.
     */
    private String title;
    /**
     * Keeps location of book.
     */
    private String location;

    /**
     * Constructor of Books.
     * @param authorName initialize authorName.
     * @param title initialize title.
     * @param location initialize location.
     */
    public Books(String authorName, String title, String location){
        this.authorName = authorName;
        this.title = title;
        this.location = location;
    }

    /**
     * Getter method of title.
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter method of location.
     * @return location.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Getter method of authorName.
     * @return authorName.
     */
    public String getAuthorName() {
        return authorName;
    }
}
