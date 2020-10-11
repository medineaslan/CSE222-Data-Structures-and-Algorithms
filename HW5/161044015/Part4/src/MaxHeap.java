import java.util.ArrayList;
import java.util.Comparator;

/**
 * MaxHeap class.
 */
public class MaxHeap <E> {

    /**
     * Keep ages into the array list.
     */
    private ArrayList<AgeData> heap_list = new ArrayList<AgeData>();

    /**
     * This is MyComparator class. Its compare method compares the heaps objects.
     */
    private static class MyComparator implements Comparator<AgeData>{

        /**
         * Overriding compare method.
         * @param o1 first object.
         * @param o2 second object.
         * @return 0 if objects are equal, -1 if first object less than second, otherwise return 1.
         */
        @Override
        public int compare(AgeData o1, AgeData o2) {
            if(o1.numberOfPeople == o2.numberOfPeople)
                return 0;
            else if(o1.numberOfPeople > o2.numberOfPeople)
                return -1;
            else
                return 1;
        }
    }

    /**
     * Keeps my comparator.
     */
    private MyComparator comparator = new MyComparator();

    /**
     * Add a new record. Check if AgeData object in that age exists in ArrayList.
     * If it exists, the number of people field of the AgeData object increased 1.
     *  Otherwise a new heap record with the AgeData object will be inserted.
     * @param item item which will be added.
     * @return true if add succesfully.
     */
    public boolean add(AgeData item){

        boolean isFound = false;
        int child;
        int parent;
        int index = 0;

        for(int i=0; i < heap_list.size(); i++){
            if(heap_list.get(i).compareTo(item) ==0){
                heap_list.get(i).numberOfPeople++;
                isFound = true;
                index = i;
                break;
            }
        }
        if(!isFound){
            item.numberOfPeople++;
            heap_list.add(item);
            child = heap_list.size() - 1;
            parent = (child - 1) / 2;
        }
        else{
            child = index;
            parent = (child-1)/2;
        }
        while(parent >= 0 && comparator.compare(heap_list.get(parent),heap_list.get(child)) == 1){
            AgeData temp = heap_list.get(parent);
            heap_list.set(parent, heap_list.get(child));
            heap_list.set(child, temp);
            child = parent;
            parent = (child - 1) / 2;
        }
        return true;
    }

    /**
     * Check if a node in that age exists.
     * If it exists the number of people field of AgeData object is greater than 1, decrease the number of people field 1.
     * If the number of people field is 1, it will remove the node.
     * @param target value which will be removed.
     * @return true if removed succesfully.
     */
    public boolean remove(AgeData target) {

        boolean isFound = false;
        int index = 0;

        for(int i=0; i < heap_list.size(); i++){
            if(heap_list.get(i).compareTo(target) == 0){
                isFound = true;
                index = i;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element is not found.");
        }
        else{
            int parent;

            if(heap_list.get(index).numberOfPeople > 1){
                heap_list.get(index).numberOfPeople--;
                parent = index;
            }
            else{
                AgeData temp = heap_list.get(index);
                heap_list.set(index, heap_list.get(heap_list.size()-1));
                heap_list.set(heap_list.size()-1, temp);
                heap_list.remove(heap_list.size()-1);
                parent = 0;
            }
            while(true){
                int leftChild = (2 * parent) + 1;
                int rightChild =  leftChild + 1;

                if(leftChild >= heap_list.size())
                    break;
                int minChild = leftChild;

                if(rightChild < heap_list.size() && comparator.compare(heap_list.get(rightChild),heap_list.get(leftChild)) == -1)
                    minChild = rightChild;
                if(comparator.compare(heap_list.get(parent),heap_list.get(minChild)) == 1){
                    AgeData temp = heap_list.get(parent);
                    heap_list.set(parent, heap_list.get(minChild));
                    heap_list.set(minChild, temp);
                    parent = minChild;
                }
                else
                    break;
            }
        }
        return isFound;
    }

    /**
     * Returns heap as a string for printing.
     * @return string which represent heap.
     */
    public String toString(){

        String str = "";

        for(int i=0; i < heap_list.size(); i++){
            str += heap_list.get(i).age + "-" + heap_list.get(i).numberOfPeople + "\n";
        }
        return str;
    }

    /**
     * Find the AgeData object with the same age and return it.
     * @param target which will be searching.
     * @return AgeData object.
     */
    public AgeData find(AgeData target) {

        boolean isFound = false;

        for(int i = 0; i < heap_list.size(); i++){
            if(heap_list.get(i).compareTo(target) == 0){
                isFound = true;
                return heap_list.get(i);
            }
        }
        return null;
    }

    /**
     * Returns the number of people younger than an age.
     * @param item represents current age.
     * @return number of people younger than that age.
     */
    public int youngerThan(int item){

        int num = 0;

        for(int i=0; i < heap_list.size(); i++){
            if(heap_list.get(i).age < item){
                num += heap_list.get(i).numberOfPeople;
            }
        }
        return num;
    }

    /**
     * Returns the number of people older than an age.
     * @param item represents current age.
     * @return number of people older than that age.
     */
    public int olderThan(int item){

        int num = 0;

        for(int i=0; i < heap_list.size(); i++){
            if(heap_list.get(i).age > item){
                num += heap_list.get(i).numberOfPeople;
            }
        }
        return num;
    }
}
