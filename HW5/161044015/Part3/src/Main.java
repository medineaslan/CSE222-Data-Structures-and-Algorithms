/**
 * This my test class which I tested all of AgeSearchTree class.
 */
public class Main {
    public static void main(String[] args){

        AgeSearchTree<AgeData> ageTree = new AgeSearchTree<AgeData>();

        System.out.println();
        System.out.println("=============================Add nodes for some ages.=============================");

        ageTree.add(new AgeData(10));
        ageTree.add(new AgeData(20));
        ageTree.add(new AgeData(5));
        ageTree.add(new AgeData(15));
        ageTree.add(new AgeData(10));

        String str;

        System.out.println("=========================Print String Which Represents Tree=======================");
        System.out.println();
        str = ageTree.toString();

        System.out.println(str);

        System.out.println("======================Test 'find' method with age '10'============================");
        System.out.println();

        System.out.println(ageTree.find(new AgeData(10)).toString());

        System.out.println("=====Print number of people younger than age '15' using 'youngerThan' method.=====");
        System.out.println();
        System.out.println(ageTree.youngerThan(15));
        System.out.println();
        System.out.println("=======Print number of people older than age '15' using 'olderThan' method.=======");
        System.out.println();
        System.out.println(ageTree.olderThan(15));
        System.out.println();

        System.out.println("=====================Remove age '10' with using remove method.====================");

        ageTree.remove(new AgeData(10));

        System.out.println("=========================Print String Which Represents Tree=======================");

        System.out.println();
        str = ageTree.toString();

        System.out.println(str);

        System.out.println("===================Remove age '5' with using remove method.=======================");

        ageTree.remove(new AgeData(5));

        System.out.println("=========================Print String Which Represents Tree=======================");

        System.out.println();
        str = ageTree.toString();

        System.out.println(str);

        System.out.println("================Remove element '5' which is not into the tree.====================");
        System.out.println();

        System.out.println(ageTree.remove(new AgeData(5)));

        System.out.println();

        System.out.println("=======================Add ages again with add method=============================");

        ageTree.add(new AgeData(30));
        ageTree.add(new AgeData(30));
        ageTree.add(new AgeData(25));
        ageTree.add(new AgeData(35));

        System.out.println("=========================Print String Which Represents Tree=======================");
        System.out.println();
        str = ageTree.toString();

        System.out.println(str);

        System.out.println("======================Test 'find' method with age '35'============================");
        System.out.println();

        System.out.println(ageTree.find(new AgeData(35)).toString());

        System.out.println();

        System.out.println("==================Test 'find' method with age is not in tree======================");
        System.out.println("====While testing this situation,I did not use toString to printing null value==== ");
        System.out.println();

        System.out.println(ageTree.find(new AgeData(5)));

        System.out.println();

        System.out.println("=====Print number of people younger than age '35' using 'youngerThan' method.=====");
        System.out.println();
        System.out.println(ageTree.youngerThan(35));
        System.out.println();
        System.out.println("=======Print number of people older than age '15' using 'olderThan' method.=======");
        System.out.println();
        System.out.println(ageTree.olderThan(15));
        System.out.println();

    }
}
