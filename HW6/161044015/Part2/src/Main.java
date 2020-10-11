import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

/**
 * This is my Main class which I did my tests.
 */
public class Main {
    public static void main(String[] args){

        Integer [][] array10k = new Integer[20][10000];
        Integer [][] temp10k = new Integer[20][10000];

        createRandomArray(array10k);
        createTempArray(array10k, temp10k);
        System.out.println("==============Selection Sort Results for 10.000 Random Array==============");
        calculateSelectionSort(array10k);

        createTempArray(temp10k, array10k);
        System.out.println("===============Bubble Sort Results for 10.000 Random Array================");
        calculateBubbleSort(array10k);

        createTempArray(temp10k, array10k);
        System.out.println("===============Insertion Sort Results for 10.000 Random Array=============");
        calculateInsertionSort(array10k);

        createTempArray(temp10k, array10k);
        System.out.println("================Shell Sort Results for 10.000 Random Array================");
        calculateShellSort(array10k);

        createTempArray(temp10k, array10k);
        System.out.println("================Merge Sort Results for 10.000 Random Array================");
        calculateMergeSort(array10k);

        createTempArray(temp10k, array10k);
        System.out.println("================Heap Sort Results for 10.000 Random Array================");
        calculateHeapSort(array10k);

//        createTempArray(temp10k, array10k);
//        System.out.println("================Quick Sort Results for 10.000 Random Array================");
//        calculateQuickSort(array10k);

        Integer[] arr10k = new Integer[10000];

        createSortedArray(arr10k);
        System.out.println("==============Selection Sort Results for 10.000 Sorted Array==============");
        calculateSelectionSort1D(arr10k);

        System.out.println("===============Bubble Sort Results for 10.000 Sorted Array================");
        calculateBubbleSort1D(arr10k);

        System.out.println("===============Insertion Sort Results for 10.000 Sorted Array=============");
        calculateInsertionSort1D(arr10k);

        System.out.println("================Shell Sort Results for 10.000 Sorted Array================");
        calculateShellSort1D(arr10k);

        System.out.println("================Merge Sort Results for 10.000 Sorted Array================");
        calculateMergeSort1D(arr10k);

        System.out.println("================Heap Sort Results for 10.000 Sorted Array================");
        calculateHeapSort1D(arr10k);

//        System.out.println("================Quick Sort Results for 10.000 Sorted Array================");
//        calculateQuickSort1D(arr10k);


        Integer[][] array40k = new Integer[20][40000];
        Integer [][] temp40k = new Integer[20][40000];

        createRandomArray(array40k);
        createTempArray(array40k, temp40k);
        System.out.println("==============Selection Sort Results for 40.000 Random Array==============");
        calculateSelectionSort(array40k);

        createTempArray(temp40k, array40k);
        System.out.println("===============Bubble Sort Results for 40.000 Random Array================");
        calculateBubbleSort(array40k);

        createTempArray(temp40k, array40k);
        System.out.println("===============Insertion Sort Results for 40.000 Random Array=============");
        calculateInsertionSort(array40k);

        createTempArray(temp40k, array40k);
        System.out.println("================Shell Sort Results for 40.000 Random Array================");
        calculateShellSort(array40k);

        createTempArray(temp40k, array40k);
        System.out.println("================Merge Sort Results for 40.000 Random Array================");
        calculateMergeSort(array40k);

        createTempArray(temp40k, array40k);
        System.out.println("================Heap Sort Results for 40.000 Random Array================");
        calculateHeapSort(array40k);

//        createTempArray(temp40k, array40k);
//        System.out.println("================Quick Sort Results for 40.000 Random Array================");
//        calculateQuickSort(array40k);

        Integer[] arr40k = new Integer[40000];

        createSortedArray(arr40k);
        System.out.println("==============Selection Sort Results for 40.000k Sorted Array==============");
        calculateSelectionSort1D(arr40k);

        System.out.println("===============Bubble Sort Results for 40.000k Sorted Array================");
        calculateBubbleSort1D(arr40k);

        System.out.println("===============Insertion Sort Results for 40.000k Sorted Array=============");
        calculateInsertionSort1D(arr40k);

        System.out.println("================Shell Sort Results for 40.000k Sorted Array================");
        calculateShellSort1D(arr40k);

        System.out.println("================Merge Sort Results for 40.000k Sorted Array================");
        calculateMergeSort1D(arr40k);

        System.out.println("================Heap Sort Results for 40.000k Sorted Array================");
        calculateHeapSort1D(arr40k);

//        System.out.println("================Quick Sort Results for 40.000k Sorted Array================");
//        calculateQuickSort1D(arr40k);


        Integer[][] array100k = new Integer[20][100000];

        Integer [][] temp100k = new Integer[20][100000];

        createRandomArray(array100k);
        createTempArray(array100k, temp100k);

        System.out.println("==============Selection Sort Results for 100.000 Random Array==============");
        calculateSelectionSort(array100k);

        createTempArray(temp100k, array100k);
        System.out.println("===============Bubble Sort Results for 100.000 Random Array================");
        calculateBubbleSort(array100k);

        createTempArray(temp100k, array100k);
        System.out.println("===============Insertion Sort Results for 100.000 Random Array=============");
        calculateInsertionSort(array100k);

        createTempArray(temp100k, array100k);
        System.out.println("================Shell Sort Results for 100.000 Random Array================");
        calculateShellSort(array100k);

        createTempArray(temp100k, array100k);
        System.out.println("================Merge Sort Results for 100.000 Random Array================");
        calculateMergeSort(array100k);

        createTempArray(temp100k, array100k);
        System.out.println("================Heap Sort Results for 100.000 Random Array================");
        calculateHeapSort(array100k);

//        createTempArray(temp100k, array100k);
//        System.out.println("================Quick Sort Results for 100.000 Random Array================");
//        calculateQuickSort(array100k);


        Integer[] arr100k = new Integer[100000];

        createSortedArray(arr100k);
        System.out.println("==============Selection Sort Results for 100.000 Sorted Array==============");
        calculateSelectionSort1D(arr100k);

        System.out.println("===============Bubble Sort Results for 100.000 Sorted Array================");
        calculateBubbleSort1D(arr100k);

        System.out.println("===============Insertion Sort Results for 100.000 Sorted Array=============");
        calculateInsertionSort1D(arr100k);

        System.out.println("================Shell Sort Results for 100.000 Sorted Array================");
        calculateShellSort1D(arr100k);

        System.out.println("================Merge Sort Results for 100.000 Sorted Array================");
        calculateMergeSort1D(arr100k);

        System.out.println("================Heap Sort Results for 100.000 Sorted Array================");
        calculateHeapSort1D(arr100k);

//        System.out.println("================Quick Sort Results for 100.000 Sorted Array================");
//        calculateQuickSort1D(arr100k);


        Integer[][] array150k = new Integer[20][150000];
        Integer [][] temp150k = new Integer[20][150000];

        createRandomArray(array150k);
        createTempArray(array150k, temp150k);
        System.out.println("==============Selection Sort Results for 150.000 Random Array==============");
        calculateSelectionSort(array150k);

        createTempArray(temp150k, array150k);
        System.out.println("===============Bubble Sort Results for 150.000 Random Array================");
        calculateBubbleSort(array150k);

        createTempArray(temp150k, array150k);
        System.out.println("===============Insertion Sort Results for 150.000 Random Array=============");
        calculateInsertionSort(array150k);

        createTempArray(temp150k, array150k);
        System.out.println("================Shell Sort Results for 150.000 Random Array================");
        calculateShellSort(array150k);

        createTempArray(temp150k, array150k);
        System.out.println("================Merge Sort Results for 150.000 Random Array================");
        calculateMergeSort(array150k);

        createTempArray(temp150k, array150k);
        System.out.println("================Heap Sort Results for 150.000 Random Array================");
        calculateHeapSort(array150k);

//        createTempArray(temp150k, array150k);
//        System.out.println("================Quick Sort Results for 150.000 Random Array================");
//        calculateQuickSort(array150k);

        Integer[] arr150k = new Integer[150000];
        createSortedArray(arr150k);
        System.out.println("==============Selection Sort Results for 150.000 Sorted Array==============");
        calculateSelectionSort1D(arr150k);

        System.out.println("===============Bubble Sort Results for 150.000 Sorted Array================");
        calculateBubbleSort1D(arr150k);

        System.out.println("===============Insertion Sort Results for 150.000 Sorted Array=============");
        calculateInsertionSort1D(arr150k);

        System.out.println("================Shell Sort Results for 150.000 Sorted Array================");
        calculateShellSort1D(arr150k);

        System.out.println("================Merge Sort Results for 150.000 Sorted Array================");
        calculateMergeSort1D(arr150k);

        System.out.println("================Heap Sort Results for 150.000 Sorted Array================");
        calculateHeapSort1D(arr150k);

//        System.out.println("================Quick Sort Results for 150.000 Sorted Array================");
//        calculateQuickSort1D(arr150k);

        Integer[][] array180k = new Integer[20][180000];
        Integer [][] temp180k = new Integer[20][180000];

        createRandomArray(array180k);
        createTempArray(array180k, temp180k);
        System.out.println("==============Selection Sort Results for 180.000 Random Array==============");
        calculateSelectionSort(array180k);

        createTempArray(temp180k, array180k);
        System.out.println("===============Bubble Sort Results for 180.000 Random Array================");
        calculateBubbleSort(array180k);

        createTempArray(temp180k, array180k);
        System.out.println("===============Insertion Sort Results for 180.000 Random Array=============");
        calculateInsertionSort(array180k);

         createTempArray(temp180k, array180k);
        System.out.println("================Shell Sort Results for 180.000 Random Array================");
        calculateShellSort(array180k);

        createTempArray(temp180k, array180k);
        System.out.println("================Merge Sort Results for 180.000 Random Array================");
        calculateMergeSort(array180k);

        createTempArray(temp180k, array180k);
        System.out.println("================Heap Sort Results for 180.000 Random Array================");
        calculateHeapSort(array180k);

//        createTempArray(temp180k, array180k);
//        System.out.println("================Quick Sort Results for 180.000 Random Array================");
//        calculateQuickSort(array180k);

        Integer[] arr180k = new Integer[180000];
        createSortedArray(arr180k);

        System.out.println("==============Selection Sort Results for 180.000 Sorted Array==============");
        calculateSelectionSort1D(arr180k);

        System.out.println("===============Bubble Sort Results for 180.000 Sorted Array================");
        calculateBubbleSort1D(arr180k);

        System.out.println("===============Insertion Sort Results for 180.000 Sorted Array=============");
        calculateInsertionSort1D(arr180k);

        System.out.println("================Shell Sort Results for 180.000 Sorted Array================");
        calculateShellSort1D(arr180k);

        System.out.println("================Merge Sort Results for 180.000 Sorted Array================");
        calculateMergeSort1D(arr180k);

        System.out.println("================Heap Sort Results for 180.000 Sorted Array================");
        calculateHeapSort1D(arr180k);

//        System.out.println("================Quick Sort Results for 180.000 Sorted Array================");
//        calculateQuickSort1D(arr180k);

        LinkedList<Integer> list1 = new LinkedList<Integer>();

        createSortedLinkedList(list1,10000);

        System.out.println("Quick Sort 10000 Size Sorted Linked List ");

        LinkedListQuickSort linkedListQuickSort = new LinkedListQuickSort();
        Instant start = Instant.now();
        linkedListQuickSort.quickSort(list1);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list2 = new LinkedList<Integer>();

        createSortedLinkedList(list2,40000);

        System.out.println("Quick Sort 40000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListQuickSort.quickSort(list2);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list3 = new LinkedList<Integer>();

        createSortedLinkedList(list3,100000);

        System.out.println("Quick Sort 100000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListQuickSort.quickSort(list3);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list4 = new LinkedList<Integer>();

        createSortedLinkedList(list4,150000);

        System.out.println("Quick Sort 150000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListQuickSort.quickSort(list4);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list5 = new LinkedList<Integer>();

        createSortedLinkedList(list5,180000);

        System.out.println("Quick Sort 180000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListQuickSort.quickSort(list5);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list6 = new LinkedList<Integer>();

        createSortedLinkedList(list6,10000);

        System.out.println("Merge Sort 10000 Size Sorted Linked List ");

        LinkedListMergeSort linkedListMergeSort = new LinkedListMergeSort();
        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list6);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list7 = new LinkedList<Integer>();

        createSortedLinkedList(list7,40000);

        System.out.println("Merge Sort 40000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list7);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list8 = new LinkedList<Integer>();

        createSortedLinkedList(list8,100000);

        System.out.println("Merge Sort 100000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list8);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list9 = new LinkedList<Integer>();

        createSortedLinkedList(list9,150000);

        System.out.println("Merge Sort 150000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list9);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list10 = new LinkedList<Integer>();

        createSortedLinkedList(list10,180000);

        System.out.println("Merge Sort 180000 Size Sorted Linked List ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list10);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");


        LinkedList<Integer> list11 = new LinkedList<Integer>();

        createRandomLinkedList(list11,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list12 = new LinkedList<Integer>();

        createRandomLinkedList(list12,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list13 = new LinkedList<Integer>();

        createRandomLinkedList(list13,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list14 = new LinkedList<Integer>();

        createRandomLinkedList(list14,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list15 = new LinkedList<Integer>();

        createRandomLinkedList(list15,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list16 = new LinkedList<Integer>();

        createRandomLinkedList(list16,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list17 = new LinkedList<Integer>();

        createRandomLinkedList(list17,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list18 = new LinkedList<Integer>();

        createRandomLinkedList(list18,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list19 = new LinkedList<Integer>();

        createRandomLinkedList(list19,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list20 = new LinkedList<Integer>();

        createRandomLinkedList(list20,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list21 = new LinkedList<Integer>();

        createRandomLinkedList(list21,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list22 = new LinkedList<Integer>();

        createRandomLinkedList(list22,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list23 = new LinkedList<Integer>();

        createRandomLinkedList(list23,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list24 = new LinkedList<Integer>();

        createRandomLinkedList(list24,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list25 = new LinkedList<Integer>();

        createRandomLinkedList(list25,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list26 = new LinkedList<Integer>();

        createRandomLinkedList(list26,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list27 = new LinkedList<Integer>();

        createRandomLinkedList(list27,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list28 = new LinkedList<Integer>();

        createRandomLinkedList(list28,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list29 = new LinkedList<Integer>();

        createRandomLinkedList(list29,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        LinkedList<Integer> list30 = new LinkedList<Integer>();

        createRandomLinkedList(list30,10000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

         list11 = new LinkedList<Integer>();

        createRandomLinkedList(list11,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list12 = new LinkedList<Integer>();

        createRandomLinkedList(list12,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

       list13 = new LinkedList<Integer>();

        createRandomLinkedList(list13,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list14 = new LinkedList<Integer>();

        createRandomLinkedList(list14,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

         list15 = new LinkedList<Integer>();

        createRandomLinkedList(list15,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list16 = new LinkedList<Integer>();

        createRandomLinkedList(list16,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list17 = new LinkedList<Integer>();

        createRandomLinkedList(list17,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list18 = new LinkedList<Integer>();

        createRandomLinkedList(list18,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

         list19 = new LinkedList<Integer>();

        createRandomLinkedList(list19,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list20 = new LinkedList<Integer>();

        createRandomLinkedList(list20,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list21 = new LinkedList<Integer>();

        createRandomLinkedList(list21,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

      list22 = new LinkedList<Integer>();

        createRandomLinkedList(list22,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list23 = new LinkedList<Integer>();

        createRandomLinkedList(list23,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list24 = new LinkedList<Integer>();

        createRandomLinkedList(list24,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list25 = new LinkedList<Integer>();

        createRandomLinkedList(list25,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

       list26 = new LinkedList<Integer>();

        createRandomLinkedList(list26,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list27 = new LinkedList<Integer>();

        createRandomLinkedList(list27,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list28 = new LinkedList<Integer>();

        createRandomLinkedList(list28,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

         list29 = new LinkedList<Integer>();

        createRandomLinkedList(list29,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list30 = new LinkedList<Integer>();

        createRandomLinkedList(list30,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list11 = new LinkedList<Integer>();

        createRandomLinkedList(list11,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list12 = new LinkedList<Integer>();

        createRandomLinkedList(list12,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list13 = new LinkedList<Integer>();

        createRandomLinkedList(list13,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list14 = new LinkedList<Integer>();

        createRandomLinkedList(list14,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list15 = new LinkedList<Integer>();

        createRandomLinkedList(list15,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list16 = new LinkedList<Integer>();

        createRandomLinkedList(list16,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list17 = new LinkedList<Integer>();

        createRandomLinkedList(list17,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list18 = new LinkedList<Integer>();

        createRandomLinkedList(list18,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list19 = new LinkedList<Integer>();

        createRandomLinkedList(list19,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list20 = new LinkedList<Integer>();

        createRandomLinkedList(list20,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list21 = new LinkedList<Integer>();

        createRandomLinkedList(list21,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list22 = new LinkedList<Integer>();

        createRandomLinkedList(list22,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list23 = new LinkedList<Integer>();

        createRandomLinkedList(list23,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list24 = new LinkedList<Integer>();

        createRandomLinkedList(list24,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list25 = new LinkedList<Integer>();

        createRandomLinkedList(list25,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list26 = new LinkedList<Integer>();

        createRandomLinkedList(list26,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list27 = new LinkedList<Integer>();

        createRandomLinkedList(list27,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list28 = new LinkedList<Integer>();

        createRandomLinkedList(list28,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list29 = new LinkedList<Integer>();

        createRandomLinkedList(list29,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list30 = new LinkedList<Integer>();

        createRandomLinkedList(list30,100000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list11 = new LinkedList<Integer>();

        createRandomLinkedList(list11,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list12 = new LinkedList<Integer>();

        createRandomLinkedList(list12,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list13 = new LinkedList<Integer>();

        createRandomLinkedList(list13,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list14 = new LinkedList<Integer>();

        createRandomLinkedList(list14,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list15 = new LinkedList<Integer>();

        createRandomLinkedList(list15,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list16 = new LinkedList<Integer>();

        createRandomLinkedList(list16,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list17 = new LinkedList<Integer>();

        createRandomLinkedList(list17,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list18 = new LinkedList<Integer>();

        createRandomLinkedList(list18,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list19 = new LinkedList<Integer>();

        createRandomLinkedList(list19,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list20 = new LinkedList<Integer>();

        createRandomLinkedList(list20,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list21 = new LinkedList<Integer>();

        createRandomLinkedList(list21,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list22 = new LinkedList<Integer>();

        createRandomLinkedList(list22,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list23 = new LinkedList<Integer>();

        createRandomLinkedList(list23,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list24 = new LinkedList<Integer>();

        createRandomLinkedList(list24,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list25 = new LinkedList<Integer>();

        createRandomLinkedList(list25,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list26 = new LinkedList<Integer>();

        createRandomLinkedList(list26,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list27 = new LinkedList<Integer>();

        createRandomLinkedList(list27,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list28 = new LinkedList<Integer>();

        createRandomLinkedList(list28,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list29 = new LinkedList<Integer>();

        createRandomLinkedList(list29,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list30 = new LinkedList<Integer>();

        createRandomLinkedList(list30,150000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list11 = new LinkedList<Integer>();

        createRandomLinkedList(list11,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list11);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list12 = new LinkedList<Integer>();

        createRandomLinkedList(list12,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list12);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list13 = new LinkedList<Integer>();

        createRandomLinkedList(list13,40000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list13);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list14 = new LinkedList<Integer>();

        createRandomLinkedList(list14,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list14);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list15 = new LinkedList<Integer>();

        createRandomLinkedList(list15,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list15);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list16 = new LinkedList<Integer>();

        createRandomLinkedList(list16,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list16);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list17 = new LinkedList<Integer>();

        createRandomLinkedList(list17,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list17);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list18 = new LinkedList<Integer>();

        createRandomLinkedList(list18,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list18);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list19 = new LinkedList<Integer>();

        createRandomLinkedList(list19,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list19);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list20 = new LinkedList<Integer>();

        createRandomLinkedList(list20,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list20);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list21 = new LinkedList<Integer>();

        createRandomLinkedList(list21,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list21);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list22 = new LinkedList<Integer>();

        createRandomLinkedList(list22,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list22);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list23 = new LinkedList<Integer>();

        createRandomLinkedList(list23,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list23);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list24 = new LinkedList<Integer>();

        createRandomLinkedList(list24,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list24);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list25 = new LinkedList<Integer>();

        createRandomLinkedList(list25,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list25);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list26 = new LinkedList<Integer>();

        createRandomLinkedList(list26,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list26);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list27 = new LinkedList<Integer>();

        createRandomLinkedList(list27,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list27);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list28 = new LinkedList<Integer>();

        createRandomLinkedList(list28,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list28);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list29 = new LinkedList<Integer>();

        createRandomLinkedList(list29,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list29);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        list30 = new LinkedList<Integer>();

        createRandomLinkedList(list30,180000);

        start = Instant.now();
        linkedListQuickSort.quickSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

        start = Instant.now();
        linkedListMergeSort.linkedListMergeSort(list30);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");


    }

    public static void createRandomLinkedList(LinkedList<Integer> list, int size){
        for(int i = 0; i < size; i++){
            list.add((int)(Math.random() * 10));
        }
    }

    public static void createSortedLinkedList(LinkedList<Integer> list, int size){
        for(int i = 0; i < size; i++){
            list.add(i);
        }
    }

    public static void createRandomArray(Comparable[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
    }
    public static void createTempArray(Comparable[][] arr, Comparable[][] temp){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[i][j] = arr[i][j];
            }
        }
    }
    public static void createSortedArray(Comparable[] arr){

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            num++;
        }
    }

    public static void calculateSelectionSort(Comparable[][] arr){

        for(int i = 0; i < arr.length; i++){
            Instant start = Instant.now();

            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sort(arr[i]);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.print(timeElapsed+" ");
        }
        System.out.println();
    }
    public static void calculateSelectionSort1D(Comparable[] arr){

            Instant start = Instant.now();

            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sort(arr);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.println(timeElapsed+" ");

    }
    public static void calculateBubbleSort(Comparable[][] arr){

        for(int i = 0; i < arr.length; i++){
            Instant start = Instant.now();

            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.sort(arr[i]);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.print(timeElapsed+" ");
        }
        System.out.println();
    }
    public static void calculateBubbleSort1D(Comparable[] arr){

        Instant start = Instant.now();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

    }
    public static void calculateInsertionSort(Comparable[][] arr){

        for(int i = 0; i < arr.length; i++){
            Instant start = Instant.now();

            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(arr[i]);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.print(timeElapsed+" ");
        }
        System.out.println();
    }
    public static void calculateInsertionSort1D(Comparable[] arr){

        Instant start = Instant.now();

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

    }
    public static void calculateShellSort(Comparable[][] arr){

        for(int i = 0; i < arr.length; i++){
            Instant start = Instant.now();

            ShellSort shellSort = new ShellSort();
            shellSort.sort(arr[i]);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.print(timeElapsed+" ");
        }
        System.out.println();
    }
    public static void calculateShellSort1D(Comparable[] arr){

        Instant start = Instant.now();

        ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

    }
    public static void calculateMergeSort(Comparable[][] arr){

        for(int i = 0; i < arr.length; i++){
            Instant start = Instant.now();

            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr[i]);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.print(timeElapsed+" ");
        }
        System.out.println();
    }
    public static void calculateMergeSort1D(Comparable[] arr){

        Instant start = Instant.now();

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

    }
    public static void calculateHeapSort(Comparable[][] arr){

        for(int i = 0; i < arr.length; i++){
            Instant start = Instant.now();

            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr[i]);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.print(timeElapsed+" ");
        }
        System.out.println();
    }
    public static void calculateHeapSort1D(Comparable[] arr){

        Instant start = Instant.now();

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

    }
    public static void calculateQuickSort(Comparable[][] arr){

        for(int i = 0; i < arr.length; i++){
            Instant start = Instant.now();

            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr[i]);

            Instant finish = Instant.now();

            long timeElapsed = Duration.between(start, finish).toMillis();

            System.out.print(timeElapsed+" ");
        }
        System.out.println();
    }
    public static void calculateQuickSort1D(Comparable[] arr){

        Instant start = Instant.now();

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println(timeElapsed+" ");

    }
}
