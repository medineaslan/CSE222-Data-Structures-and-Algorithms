/**
 * This is my test class.
 */
public class Main {

    public static void main(String[] args){

        MaxHeap<AgeData> heap = new MaxHeap <AgeData>();
        System.out.println();
        System.out.println("=============================Add nodes for some ages.=============================");
        heap.add(new AgeData(10));
        heap.add(new AgeData(5));
        heap.add(new AgeData(70));
        heap.add(new AgeData(10));
        heap.add(new AgeData(50));
        heap.add(new AgeData(5));
        heap.add(new AgeData(15));

        String heapStr;

        System.out.println("=========================Print String Which Represents Tree=======================");
        System.out.println();
        heapStr= heap.toString();
        System.out.println(heapStr);

        System.out.println("======================Test 'find' method with age '10'============================");
        System.out.println();
        System.out.println(heap.find(new AgeData(10)).toString());

        System.out.println("=====Print number of people younger than age '10' using 'youngerThan' method.=====");
        System.out.println();

        System.out.println(heap.youngerThan(10));

        System.out.println();
        System.out.println("=======Print number of people older than age '50' using 'olderThan' method.=======");
        System.out.println();

        System.out.println(heap.olderThan(50));

        System.out.println();

        System.out.println("=====================Remove age '10' with using remove method.====================");

        heap.remove(new AgeData(10));

        System.out.println("=========================Print String Which Represents Tree=======================");

        System.out.println();
        heapStr= heap.toString();
        System.out.println(heapStr);

        System.out.println();

        System.out.println("=====================Remove age '10' with using remove method.====================");

        heap.remove(new AgeData(10));

        System.out.println("=========================Print String Which Represents Tree=======================");

        System.out.println();
        heapStr= heap.toString();
        System.out.println(heapStr);

        System.out.println();

        System.out.println("==================Test 'find' method with age is not in tree======================");
        System.out.println("====While testing this situation,I did not use toString to printing null value==== ");
        System.out.println();

        System.out.println(heap.find(new AgeData(500)));

        System.out.println();

        System.out.println("================Remove element '500' which is not into the tree.====================");
        System.out.println();

        System.out.println(heap.remove(new AgeData(500)));

        System.out.println();

        System.out.println();
        System.out.println("=============================Add nodes for some ages.=============================");

        heap.add(new AgeData(70));
        heap.add(new AgeData(70));
        heap.add(new AgeData(70));
        heap.add(new AgeData(50));
        heap.add(new AgeData(15));

        System.out.println("=========================Print String Which Represents Tree=======================");
        System.out.println();
        heapStr= heap.toString();
        System.out.println(heapStr);

        System.out.println("=====Print number of people younger than age '15' using 'youngerThan' method.=====");
        System.out.println();

        System.out.println(heap.youngerThan(15));

        System.out.println();
        System.out.println("=======Print number of people older than age '15' using 'olderThan' method.=======");
        System.out.println();

        System.out.println(heap.olderThan(15));

        System.out.println();

    }
}
