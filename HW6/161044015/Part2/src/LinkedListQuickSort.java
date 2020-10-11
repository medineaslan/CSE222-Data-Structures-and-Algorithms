import java.util.LinkedList;

/**
 * Implements the quick sort algorithm using linked list.
 */
public class LinkedListQuickSort {

    /**
     * Sort the list using the linkedListQuickSort method.
     * @param list The list to be sorted
     * @param <T> type T
     */
    public static <T extends Comparable<T>> void quickSort(LinkedList <T> list) {
        linkedListQuickSort(list, 0, list.size() - 1);
    }

    /**
     * Sort a part of the list using the quicksort algorithm with linked list.
     * @param list the list to be sorted.
     * @param start start index.
     * @param end end index.
     * @param <T> type T.
     */
    public static <T extends Comparable<T>>  void linkedListQuickSort(LinkedList <T> list, int start, int end)
    {
        if(start < end)
        {
            int returnPartition = partition(list, start, end);
            linkedListQuickSort(list, start, returnPartition - 1);
            linkedListQuickSort(list,returnPartition + 1, end);
        }
    }

    /**
     *This method used for linkedListQuickSort method.
     * Partitioned the list.
     * @param list list which will be partition.
     * @param start start index.
     * @param end last index.
     * @param <T> type T
     * @return location of pivot.
     */
    private static <T extends Comparable<T>> int partition(LinkedList <T> list, int start, int end){

        T pivot = list.get(end);
        int i = start - 1;

        for(int j = start; j < end; j++) {
            if(list.get(j).compareTo(pivot) <= 0){
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i+1, end);

        return i+1;
    }

    /**
     * This method using for swapping linked lists elements.
     * @param list list to be swapped.
     * @param index1 first index
     * @param index2 second index
     * @param <T> type T
     */
    private static <T extends Comparable<T>> void swap(LinkedList <T> list, int index1, int index2){

        T temp;

        temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2, temp);

    }
}
