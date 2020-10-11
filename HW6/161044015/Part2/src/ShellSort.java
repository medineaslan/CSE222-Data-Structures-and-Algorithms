/**
 * Implements the Shell sort algorithm.
 */
public class ShellSort {

    /**
     * Sort the table using Shell sort algorithm
     * @param table The array to be sorted
     * @param <T> type T.
     */
    public static <T extends Comparable<T>> void sort(T[] table) {
        int gap = table.length / 2;

        while (gap > 0) {
            for (int nextPos = gap; nextPos < table.length; nextPos++) {
                insert(table, nextPos, gap);
            }
            if (gap == 2) {
                gap = 1;
            }else {
                gap = (int) (gap / 2.2);
            }
        }
    }

    /**
     *  Inserts element at nextPos where it belongs in array
     * @param table The array being sorted
     * @param nextPos The position of element to insert
     * @param gap The gap between elements in the subarray
     * @param <T> type T.
     */
    private static <T extends Comparable<T>> void insert(T[] table,int nextPos, int gap) {
        T nextVal = table[nextPos];
        while ((nextPos > gap - 1) && (nextVal.compareTo(table [nextPos - gap]) < 0)){
            table[nextPos] = table[nextPos - gap];
            nextPos -= gap;
        }
            table[nextPos] = nextVal;
    }
}
