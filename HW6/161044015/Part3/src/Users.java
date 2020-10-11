import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Users class.
 */
public class Users  {

    /**
     * This method use for search book by using author name of book.
     * If library system is empty. Prints information message.
     * If author name is not found. Prints information message.
     * @param authorName author name of book which will searching.
     */
    public void searchByAuthorName(String authorName){

        boolean control = false;

        if(LibrarySystem.getBooks().isEmpty()){
            System.out.println("Library System is Empty. There is no book.");
        }
        else{
            Scanner object = new Scanner(System.in);
            for(Map.Entry<String, Map<String,Set<String>>> Entry : LibrarySystem.getBooks().entrySet()){
                if(Entry.getKey().equals(authorName)){
                    System.out.println(LibrarySystem.getBooks().get(authorName).keySet());
                    control = true;
                }
            }
            if(control == false)
                System.out.println("This author is not found.");
            else{
                System.out.println("Enter book title which you wants the choose.");
                String bookTitle = object.nextLine();
                System.out.println(LibrarySystem.getBooks().get(authorName).get(bookTitle));
            }
        }
    }

    /**
     * This method use for search book by using title of book.
     * If library system is empty. Prints information message.
     * If title is not found. Prints information message.
     * @param title title of book which will searching.
     */
    public void searchByTitle(String title){

        boolean control = false;

        if(LibrarySystem.getBooks().isEmpty()){
            System.out.println("Library System is Empty. There is no book.");
        }
        else{
            for(Map.Entry<String, Map<String, Set<String>>> Entry : LibrarySystem.getBooks().entrySet()){
                if(Entry.getValue().containsKey(title)){
                    System.out.println("Author Name: " + Entry.getKey());
                    System.out.println("Locations: " + Entry.getValue().get(title));
                    control = true;
                }
            }
        }

        if(control == false){
            System.out.println("Title is not found.");
        }
    }

    /**
     * This method prints map.
     */
    public void printMap(){

        for (Map.Entry<String, Map<String, Set<String>>> Entry : LibrarySystem.getBooks().entrySet())
        {
            System.out.print(Entry.getKey() + "=");
            System.out.println(Entry.getValue());
        }
    }
}
