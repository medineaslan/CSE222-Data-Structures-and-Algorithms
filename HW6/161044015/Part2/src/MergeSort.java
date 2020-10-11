/**
 * Implements the recursive merge sort algorithm. In this version, copies of the subtables are made, sorted, and then merged.
 */
public class MergeSort {

    /**
     * Sort the array using the merge sort algorithm
     * @param table The array to be sorted
     * @param <T> type T.
     */
    public static <T extends Comparable<T>> void sort(T[] table) {
        if (table.length > 1) {
            int halfSize = table.length / 2;
            T[] leftTable = (T[]) new Comparable[halfSize];
            T[] rightTable = (T[]) new Comparable[table.length - halfSize];
            System.arraycopy(table, 0, leftTable, 0, halfSize);
            System.arraycopy(table, halfSize, rightTable, 0, table.length - halfSize);
            sort(leftTable);
            sort(rightTable);
            merge(table, leftTable, rightTable);
        }
    }

    /**
     * Merge two sequences.
     * @param outputSequence is the merged result and is sorted.
     * @param leftSequence The left input
     * @param rightSequence The right input
     * @param <T> type T.
     */
    private static <T extends Comparable<T>> void merge(T[] outputSequence,T[] leftSequence, T[] rightSequence) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftSequence.length && j < rightSequence.length) {
            if (leftSequence[i].compareTo(rightSequence[j]) < 0) {
                outputSequence[k++] = leftSequence[i++];
            }else{
                outputSequence[k++] = rightSequence[j++];
            }
        }
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
    }
}
