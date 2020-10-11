import java.util.LinkedList;

/**
 * Implements the merge sort algorithm using linked list.
 */
public class LinkedListMergeSort {

    /**
     * Sort the linked list using the merge sort algorithm.
     * @param list the list which will be sorted.
     * @param <T> type T
     */
    public static <T extends Comparable<T>> void linkedListMergeSort(LinkedList<T> list) {

        int listSize = list.size();

        if(listSize < 2)
            return;

        int middle = listSize / 2;

        LinkedList <T> left = new LinkedList<T>();
        LinkedList <T> right = new LinkedList<T>();

        for(int i = 0; i < middle; i++)
            left.set(i,list.get(i));

        for(int i = middle; i < listSize; i++)
            right.set(i-middle, list.get(i));

        linkedListMergeSort(left);
        linkedListMergeSort(right);
        merge(list, left, right);
    }

    /**
     * Merge two lists.
     * @param list the list which is merged and sorted.
     * @param left The left part of list.
     * @param right The right part of list.
     * @param <T> type T
     */
    private static <T extends Comparable<T>> void merge(LinkedList<T> list, LinkedList<T> left, LinkedList<T> right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                list.set(k,left.get(i));
                i++;
                k++;
            } else {
                list.set(k, right.get(j));
                j++;
                k++;
            }
        }
        while (i < left.size()) {
            list.set(k,left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            list.set(k, right.get(j));
            j++;
            k++;
        }
    }
}
