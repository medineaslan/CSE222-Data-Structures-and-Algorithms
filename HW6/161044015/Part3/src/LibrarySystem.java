import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * LibrarySystem class. Keeps map and password of admin.
 */
public class LibrarySystem {

    /**
     * Keeps books.
     */
    private static Map<String, Map<String, Set<String>>> books = new HashMap<>();

    /**
     * Getter method of books.
     * @return map.
     */
    public static Map<String, Map<String, Set<String>>> getBooks() {
        return books;
    }

    /**
     * Keeps password.
     */
    private int password;

    /**
     * Getter method of password.
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * Constructor of LibrarySystem.
     */
    public LibrarySystem(){
        password = 1234;
    }
}
