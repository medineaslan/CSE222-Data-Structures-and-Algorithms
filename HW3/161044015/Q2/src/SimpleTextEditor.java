import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

/**
 * This is my SimpleTextEditor class with add, find, replace methods.
 */
public class SimpleTextEditor {

    /**
     * Keeps list of elements.
     */
    private List<Character> myList;

    /**
     * SimpleTextEditor constructor.
     * @param list is list which is array list or linked list.
     */
    public SimpleTextEditor(List <Character> list){
        myList = list;
    }

    /**
     * This method reads a file using simple loop. And construct the list.
     * @param fileName is a file name to be read.
     */
    public void readFromFileWithLoop(String fileName)
    {
        String line;
        int i=0;

        try{
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null){
                for(i = 0; i < line.length(); ++i){
                    myList.add(line.charAt(i));
                }
            }
            br.close();
        }
        catch (IOException E){
            E.getStackTrace();
        }
    }

    /**
     * This method read a file using ListIterator.
     * @param fileName is a file name to be read.
     */
    public void readFromFileWithIterator(String fileName)
    {
        String line;
        int i=0;

        ListIterator<Character> iterator = myList.listIterator();

        try{
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null){
                for(i = 0; i < line.length(); ++i){
                    iterator.add(line.charAt(i));
                }
            }
            br.close();
        }
        catch (IOException E){
            E.getStackTrace();
        }
    }

    /**
     * This method prints a list.
     */
    public void printList(){
        for(int j = 0; j < myList.size(); j++){
            System.out.print(myList.get(j));
        }
        System.out.println();
    }

    /**
     * This method adds one or more characters at the specified position in my text using simple loop.
     * @param str is string to be added.
     * @param index is index to be added in this position.
     */
    public void addWithLoop(String str, int index)
    {

        if(index > myList.size())
            System.out.println("Index out of range.You ara not add in this index.");

        for(int i = 0; i < myList.size(); i++)
        {
            if(i == index){
                for(int j = str.length()-1; j >= 0; j-- ){
                    myList.add(index,str.charAt(j));
                }
            }
        }
    }

    /**
     * This method returns the start index of the first occurrence of the searched group of characters using loop.
     * @param str is string to be finding.
     * @return start index of the first occurence of string.
     */
    public int findWithLoop(String str)
    {
        int isSame = 0;
        int startIndex = 0;
        int j=0;

        for(int i = 0; i < myList.size(); i++)
        {
            if(myList.get(i) == str.charAt(j))
            {
                startIndex = i;
                for(int k = i; k < myList.size(); k++)
                {
                    if(j < str.length() && myList.get(k) == str.charAt(j))
                    {
                        isSame++;
                        j++;
                    }
                    else
                    {
                        if(isSame == str.length())
                            return startIndex;

                        isSame=0;
                        j=0;
                        break;
                    }
                }
            }
        }
        return -1;

    }

    /**
     * This method  replaces all occurrences of a character with another character using simple loop.
     * @param oldChar is char to be changed.
     * @param newChar is char for change oldChar.
     */
    public void replaceWithLoop(char oldChar, char newChar)
    {
        int isFound = 0;
        for(int i=0; i < myList.size(); i++){
            if(myList.get(i) == oldChar){
                myList.remove(i);
                myList.add(i,newChar);
                isFound = 1;
            }

        }
        if(isFound == 0)
            System.out.println("This list is not contain this element.");
    }

    /**
     * This method adds one or more characters at the specified position in my text using ListIterator..
     * @param str is string to be added.
     * @param index is index to be added in this position.
     */
    public void addWithIterator(String str, int index){

        ListIterator<Character> iterator = myList.listIterator(index);

        for(int i = 0 ; i < str.length(); i++)
            iterator.add(str.charAt(i));

    }

    /**
     * This method  replaces all occurrences of a character with another character using ListIterator.
     * @param oldChar is char to be changed.
     * @param newChar is char for change oldChar.
     */
    public void replaceWithIterator(char oldChar, char newChar)
    {

        ListIterator<Character> iterator = myList.listIterator();

        int isFound= 0;
        while(iterator.hasNext()){
            if (iterator.next() == oldChar){
                iterator.set(newChar);
                iterator.next();
                isFound = 1;
            }
        }
        if(isFound == 0)
        {
            System.out.println("This list is not contain this element.");

        }
    }

}
