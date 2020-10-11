import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This is Administrators class which extends Users class. For search methods this class extends the Users class.
 */
public class Administrators extends Users {

    /**
     * This method adds book in library system.
     * @param book Books object which will add the library system.
     */
    public void addBook(Books book){

        if(LibrarySystem.getBooks().containsKey(book.getAuthorName())){
            if(LibrarySystem.getBooks().get(book.getAuthorName()).containsKey(book.getTitle())){
                LibrarySystem.getBooks().get(book.getAuthorName()).get(book.getTitle()).add(book.getLocation());
            }
            else{
                Set<String> bookLocation = new HashSet<String>();

                bookLocation.add(book.getLocation());

                LibrarySystem.getBooks().get(book.getAuthorName()).put(book.getTitle(),bookLocation);
            }
        }
        else{
            Set<String> bookLocation = new HashSet<String>();
            Map<String, Set<String>> inner = new HashMap<>();

            bookLocation.add(book.getLocation());
            inner.put(book.getTitle(), bookLocation);

            LibrarySystem.getBooks().put(book.getAuthorName(), inner);
        }

        printMap();

    }

    /**
     * This method delete book in library system.
     * If book is not found, prints information message.
     * @param book Books object which will delete the library system.
     */
    public void deleteBook(Books book){

        boolean isContains = false;

        for(Map.Entry<String, Map<String,Set<String>>> Entry : LibrarySystem.getBooks().entrySet()){
            if(Entry.getKey().equals(book.getAuthorName())){
                if(Entry.getValue().containsKey(book.getTitle())){
                    if(Entry.getValue().get(book.getTitle()).contains(book.getLocation())){
                        isContains = true;
                    }
                }
            }
        }
        if(isContains){
            //If there is one more than a book.
            if(LibrarySystem.getBooks().get(book.getAuthorName()).get(book.getTitle()).size() > 1 ){
                LibrarySystem.getBooks().get(book.getAuthorName()).get(book.getTitle()).remove(book.getLocation());
            }
            else{
                //Author has 1 book.
                if(LibrarySystem.getBooks().get(book.getAuthorName()).size() == 1){
                    LibrarySystem.getBooks().remove(book.getAuthorName());
                }
                else{
                    LibrarySystem.getBooks().get(book.getAuthorName()).remove(book.getTitle());
                }
            }
            printMap();
        }
        else
            System.out.println("This book is not found.");

    }

    /**
     * This method update author name of book.
     * If book is not found, prints information message.
     * @param book Books object which which will be updated.
     * @param authorName new author name.
     */
    public void updateAuthorName(Books book, String authorName){

        boolean control = false;

        for(Map.Entry<String, Map<String,Set<String>>> Entry : LibrarySystem.getBooks().entrySet()){
            if(Entry.getKey().equals(book.getAuthorName())){
                if(Entry.getValue().containsKey(book.getTitle())){
                    if(Entry.getValue().get(book.getTitle()).contains(book.getLocation())){
                        Map<String, Set<String>> temp = LibrarySystem.getBooks().remove(book.getAuthorName());
                        LibrarySystem.getBooks().put(authorName,temp);
                        control = true;
                        break;
                    }
                }
            }
        }
        if(control == false)
            System.out.println("This book is not found.");
        else
            printMap();

    }

    /**
     * This method update title of book.
     * If book is not found, prints information message.
     * @param book Books object which which will be updated.
     * @param title new title.
     */
    public void updateTitle(Books book, String title){

        boolean control = false;

        for(Map.Entry<String, Map<String,Set<String>>> Entry : LibrarySystem.getBooks().entrySet()){
            if(Entry.getKey().equals(book.getAuthorName())){
                if(Entry.getValue().containsKey(book.getTitle())){
                    if(Entry.getValue().get(book.getTitle()).contains(book.getLocation())){
                        Set<String> temp = LibrarySystem.getBooks().get(book.getAuthorName()).remove(book.getTitle());
                        LibrarySystem.getBooks().get(book.getAuthorName()).put(title,temp);
                        control = true;
                        break;
                    }
                }
            }
        }
        if(control == false)
            System.out.println("This book is not found.");
        else
            printMap();
    }

    /**
     * This method update location of book.
     * If book is not found, prints information message.
     * @param book Books object which which will be updated.
     * @param location new location.
     */
    public void updateLocation(Books book, String location){

        boolean control = false;

        for(Map.Entry<String, Map<String,Set<String>>> Entry : LibrarySystem.getBooks().entrySet()){
            if(Entry.getKey().equals(book.getAuthorName())){
                if(Entry.getValue().containsKey(book.getTitle())){
                    if(Entry.getValue().get(book.getTitle()).contains(book.getLocation())){
                        LibrarySystem.getBooks().get(book.getAuthorName()).get(book.getTitle()).remove(book.getLocation());
                        LibrarySystem.getBooks().get(book.getAuthorName()).get(book.getTitle()).add(location);
                        control = true;

                        break;
                    }
                }
            }
        }
        if(control == false)
            System.out.println("This book is not found.");
        else
            printMap();
    }
}
