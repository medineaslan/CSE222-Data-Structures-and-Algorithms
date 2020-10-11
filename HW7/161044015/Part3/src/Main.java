import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * This is my Main class.
 */
public class Main {

    public static void main(String[] args){

        System.out.println();
        System.out.println("==============Skip List in Book Results=================");
        System.out.println();

        int sum = 0;
        int delete = 0;

        int[] myArray ;

        for(int i = 0; i < 10; i++){
            myArray = calculateSkipList(10000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 10k: " + sum / 10);
        System.out.println("Deletion Average 10k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateSkipList(20000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 20k: " + sum / 10);
        System.out.println("Deletion Average 20k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateSkipList(40000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 40k: " + sum / 10);
        System.out.println("Deletion Average 40k: " + delete / 10);
        System.out.println();

        sum = 0;
        delete = 0;
        for(int i = 0; i < 10; i++){
            myArray = calculateSkipList(80000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 80k: " + sum / 10);
        System.out.println("Deletion Average 80k: " + delete / 10);
        System.out.println();

        System.out.println();
        System.out.println("==============Skip List in Java Results=================");
        System.out.println();

        sum = 0;
        delete = 0;

        myArray = new int[2];

        for(int i = 0; i < 10; i++){
            myArray = calculateSkipListJava(10000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 10k: " + sum / 10);
        System.out.println("Deletion Average 10k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateSkipListJava(20000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 20k: " + sum / 10);
        System.out.println("Deletion Average 20k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateSkipListJava(40000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 40k: " + sum / 10);
        System.out.println("Deletion Average 40k: " + delete / 10);
        System.out.println();

        sum = 0;
        delete = 0;
        for(int i = 0; i < 10; i++){
            myArray = calculateSkipListJava(80000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 80k: " + sum / 10);
        System.out.println("Deletion Average 80k: " + delete / 10);
        System.out.println();

        System.out.println("==============Red Black Tree in Book Results=================");
        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTree(10000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 10k: " + sum / 10);
        System.out.println("Deletion Average 10k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTree(20000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 20k: " + sum / 10);
        System.out.println("Deletion Average 20k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTree(40000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 40k: " + sum / 10);
        System.out.println("Deletion Average 40k: " + delete / 10);
        System.out.println();

        sum = 0;
        delete = 0;
        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTree(80000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 80k: " + sum / 10);
        System.out.println("Deletion Average 80k: " + delete / 10);
        System.out.println();

        System.out.println("==============Red Black Tree in Java Results=================");
        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTreeJava(10000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 10k: " + sum / 10);
        System.out.println("Deletion Average 10k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTreeJava(20000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 20k: " + sum / 10);
        System.out.println("Deletion Average 20k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTreeJava(40000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 40k: " + sum / 10);
        System.out.println("Deletion Average 40k: " + delete / 10);
        System.out.println();

        sum = 0;
        delete = 0;
        for(int i = 0; i < 10; i++){
            myArray = calculateRedBlackTreeJava(80000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 80k: " + sum / 10);
        System.out.println("Deletion Average 80k: " + delete / 10);
        System.out.println();

        System.out.println("==============Regular Binary Search Tree Results=================");
        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateBinarySearchTree(10000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 10k: " + sum / 10);
        System.out.println("Deletion Average 10k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateBinarySearchTree(20000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 20k: " + sum / 10);
        System.out.println("Deletion Average 20k: " + delete / 10);

        System.out.println();

        sum = 0;
        delete = 0;

        for(int i = 0; i < 10; i++){
            myArray = calculateBinarySearchTree(40000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 40k: " + sum / 10);
        System.out.println("Deletion Average 40k: " + delete / 10);
        System.out.println();

        sum = 0;
        delete = 0;
        for(int i = 0; i < 10; i++){
            myArray = calculateBinarySearchTree(80000);
            sum += myArray[0];
            delete += myArray[1];
        }

        System.out.println();
        System.out.println("Extra Insertion Average 80k: " + sum / 10);
        System.out.println("Deletion Average 80k: " + delete / 10);
        System.out.println();

        System.out.println("=======================BTree Results==========================");
        System.out.println();

        sum = 0;

        for(int i = 0; i < 10; i++){
            sum += calculateBTree(10000);
        }

        System.out.println();
        System.out.println("Extra Insertion Average 10k: " + sum / 10);
        System.out.println();

        sum = 0;

        for(int i = 0; i < 10; i++){
            sum += calculateBTree(20000);
        }

        System.out.println();
        System.out.println("Extra Insertion Average 20k: " + sum / 10);
        System.out.println();

        sum = 0;

        for(int i = 0; i < 10; i++){
            sum += calculateBTree(40000);
        }

        System.out.println();
        System.out.println("Extra Insertion Average 40k: " + sum / 10);
        System.out.println();

        sum = 0;
        for(int i = 0; i < 10; i++){
            sum += calculateBTree(80000);
        }

        System.out.println();
        System.out.println("Extra Insertion Average 80k: " + sum / 10);
        System.out.println();
    }

    /**
     * This method calculated SkipList in book results.
     * @param size 10.000, 20.000, 40.000 or 80.000
     * @return an array which keeps inserting extra 10 elements and deleting run times.
     */
    public static int [] calculateSkipList( int size){

        SkipList<Integer> list = new SkipList<>();

        int[] arr = new int[2];

        long start = System.nanoTime();
        for(int i=0;  i < size; i++){
            list.add((int)(Math.random() * size));
        }
        long finish = System.nanoTime();

        System.out.print("Insertion Run Time " + size +"k: ");

        System.out.println(finish - start);

        start = System.nanoTime();
        for(int i=0;  i < 10; i++){
            list.add((int)(Math.random() * size));
        }
        finish = System.nanoTime();

        System.out.print("Extra Insertion Run Time: ");

        System.out.println(finish - start);

        int result = (int) (finish - start);

        arr[0] = result;

        int flag =0;
        start = System.nanoTime();

        while(flag < 10){

            boolean isRemoved = list.remove((int)(Math.random() * size));

            if(isRemoved)
                flag++;

        }
        finish = System.nanoTime();

        System.out.print("Removing Run Time: ");

        System.out.println(finish - start);

        int resultRemove = (int) (finish - start);

        arr[1] = resultRemove;

        return arr;
    }

    /**
     * This method calculated SkipList in Java results.
     * @param size 10.000, 20.000, 40.000 or 80.000
     * @return an array which keeps inserting extra 10 elements and deleting run times.
     */
    public static int [] calculateSkipListJava( int size){

        ConcurrentSkipListSet<Integer> list = new ConcurrentSkipListSet<Integer>();

        int[] arr = new int[2];

        long start = System.nanoTime();
        for(int i=0;  i < size; i++){
            list.add((int)(Math.random() * size));
        }
        long finish = System.nanoTime();

        System.out.print("Insertion Run Time " + size +"k: ");

        System.out.println(finish - start);

        start = System.nanoTime();
        for(int i=0;  i < 10; i++){
            list.add((int)(Math.random() * size));
        }
        finish = System.nanoTime();

        System.out.print("Extra Insertion Run Time: ");

        System.out.println(finish - start);

        int result = (int) (finish - start);

        arr[0] = result;

        int flag =0;
        start = System.nanoTime();

        while(flag < 10){

            boolean isRemoved = list.remove((int)(Math.random() * size));

            if(isRemoved)
                flag++;

        }
        finish = System.nanoTime();

        System.out.print("Removing Run Time: ");

        System.out.println(finish - start);

        int resultRemove = (int) (finish - start);

        arr[1] = resultRemove;

        return arr;
    }

    /**
     * This method calculated Red Black Tree in book results.
     * @param size 10.000, 20.000, 40.000 or 80.000
     * @return an array which keeps inserting extra 10 elements and deleting run times.
     */
    public static int [] calculateRedBlackTree( int size){

        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>();

        int[] arr = new int[2];

        long start = System.nanoTime();
        for(int i=0;  i < size; i++){
            redBlackTree.add((int)(Math.random() * size));
        }
        long finish = System.nanoTime();

        System.out.print("Insertion Run Time " + size +"k: ");

        System.out.println(finish - start);

        start = System.nanoTime();
        for(int i=0;  i < 10; i++){
            redBlackTree.add((int)(Math.random() * size));
        }
        finish = System.nanoTime();

        System.out.print("Extra Insertion Run Time: ");

        System.out.println(finish - start);

        int result = (int) (finish - start);

        arr[0] = result;

        int flag =0;


        int[] tempArr = new int[10];
        int j=0;

        while(flag < 10){
            int num = (int)(Math.random() * size);
            if(redBlackTree.contains(num)){
                tempArr[j] = num;
                flag++;
                j++;
            }
        }

        start = System.nanoTime();
        for(int i=0; i < 10; i++){
            redBlackTree.remove(tempArr[i]);
        }
        finish = System.nanoTime();

        System.out.print("Removing Run Time: ");

        System.out.println(finish - start);

        int resultRemove = (int) (finish - start);

        arr[1] = resultRemove;

        return arr;
    }

    /**
     * This method calculated Red Black Tree in Java results.
     * @param size 10.000, 20.000, 40.000 or 80.000
     * @return an array which keeps inserting extra 10 elements and deleting run times.
     */
    public static int [] calculateRedBlackTreeJava( int size){

        TreeSet<Integer> redBlackTree = new TreeSet<Integer>();

        int[] arr = new int[2];

        long start = System.nanoTime();
        for(int i=0;  i < size; i++){
            redBlackTree.add((int)(Math.random() * size));
        }
        long finish = System.nanoTime();

        System.out.print("Insertion Run Time " + size +"k: ");

        System.out.println(finish - start);

        start = System.nanoTime();
        for(int i=0;  i < 10; i++){
            redBlackTree.add((int)(Math.random() * size));
        }
        finish = System.nanoTime();

        System.out.print("Extra Insertion Run Time: ");

        System.out.println(finish - start);

        int result = (int) (finish - start);

        arr[0] = result;

        int flag =0;


        int[] tempArr = new int[10];
        int j=0;

        while(flag < 10){
            int num = (int)(Math.random() * size);
            if(redBlackTree.contains(num)){
                tempArr[j] = num;
                flag++;
                j++;
            }
        }

        start = System.nanoTime();
        for(int i=0; i < 10; i++){
            redBlackTree.remove(tempArr[i]);
        }
        finish = System.nanoTime();

        System.out.print("Removing Run Time: ");

        System.out.println(finish - start);

        int resultRemove = (int) (finish - start);

        arr[1] = resultRemove;

        return arr;
    }

    /**
     * This method calculated BinarySearchTree in book results.
     * @param size 10.000, 20.000, 40.000 or 80.000
     * @return an array which keeps inserting extra 10 elements and deleting run times.
     */
    public static int [] calculateBinarySearchTree( int size){

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        int[] arr = new int[2];

        long start = System.nanoTime();
        for(int i=0;  i < size; i++){
            binarySearchTree.add((int)(Math.random() * size));
        }
        long finish = System.nanoTime();

        System.out.print("Insertion Run Time " + size +"k: ");

        System.out.println(finish - start);

        start = System.nanoTime();
        for(int i=0;  i < 10; i++){
            binarySearchTree.add((int)(Math.random() * size));
        }
        finish = System.nanoTime();

        System.out.print("Extra Insertion Run Time: ");

        System.out.println(finish - start);

        int result = (int) (finish - start);

        arr[0] = result;

        int flag =0;


        int[] tempArr = new int[10];
        int j=0;

        while(flag < 10){
            int num = (int)(Math.random() * size);
            if(binarySearchTree.contains(num)){
                tempArr[j] = num;
                flag++;
                j++;
            }
        }

        start = System.nanoTime();
        for(int i=0; i < 10; i++){
            binarySearchTree.remove(tempArr[i]);
        }
        finish = System.nanoTime();

        System.out.print("Removing Run Time: ");

        System.out.println(finish - start);

        int resultRemove = (int) (finish - start);

        arr[1] = resultRemove;

        return arr;
    }

    /**
     * This method calculated BTree in book results.
     * @param size 10.000, 20.000, 40.000 or 80.000
     * @return an array which keeps inserting extra 10 elements and deleting run times.
     */
    public static int calculateBTree( int size){

        BTree<Integer> bTree = new BTree<>(3);

        int[] arr = new int[2];

        long start = System.nanoTime();
        for(int i=0;  i < size; i++){
            bTree.add((int)(Math.random() * size));
        }
        long finish = System.nanoTime();

        System.out.print("Insertion Run Time " + size +"k: ");

        System.out.println(finish - start);

        start = System.nanoTime();
        for(int i=0;  i < 10; i++){
            bTree.add((int)(Math.random() * size));
        }
        finish = System.nanoTime();

        System.out.print("Extra Insertion Run Time: ");

        System.out.println(finish - start);

        int result = (int) (finish - start);

        return result;
    }

}
