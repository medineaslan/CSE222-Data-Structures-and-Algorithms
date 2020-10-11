import java.security.InvalidParameterException;

/**
 * This is my test class that I test all of my methods.
 */
public class Test {
    public static void main(String[] args)
    {
        LinkedArrayList list = new LinkedArrayList();

        try{
            System.out.println();
            System.out.println("==============Error Checking While Add First Element in List.==============");
            System.out.println("===The first element cannot be added to any other index than zero index.===");
            System.out.println("======================Add element 3 in index 5.============================");
            System.out.println();
            list.add(5,3);
        }
        catch (InvalidParameterException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("=======Add 5 element in a first node.=======");
        System.out.println();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        System.out.println();
        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.print("Number of nodes in list:");
        System.out.println(list.size());

        System.out.println();

        System.out.println("======Remove all elements in list.======");

        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);

        System.out.print("Number of nodes in list:");
        System.out.println(list.size());

        System.out.println();

        System.out.println("===========Error Checking While Removing List.===========");
        System.out.println("====Remove element when there is no element in list.=====");

        System.out.println();

        list.remove(0);

        System.out.println();

        System.out.println("========Add 5 element in a first node again.=========");
        System.out.println();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.printList();

        System.out.println();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.print("Number of nodes in list:");
        System.out.println(list.size());

        System.out.println();

        System.out.println("===When add sixth element, new node is created and other elements are added.===");
        System.out.println();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        list.printList();

        System.out.println();
        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.print("Number of nodes in list:");
        System.out.println(list.size());

        System.out.println();

        System.out.println("=========Print list iterating backward.======");
        list.printListBack();

        System.out.println();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.print("Number of nodes in list:");
        System.out.println(list.size());

        System.out.println();

        System.out.println("========Remove index 0 of List.========");
        System.out.println();

        list.remove(0);

        list.printList();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("=======Remove index 6 of List.=========");

        list.remove(6);

        list.printList();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("=======Remove last index of List.======");

        list.remove(7);

        list.printList();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("===========Error Checking While Removing List.===========");
        System.out.println("=======Remove index that is not in the bound of list=====");
        System.out.println("===============Remove index 15 of list.==================");

        System.out.println();

        list.remove(15);

        System.out.println();

        System.out.println("=============Add element 20, in index 2 of list==============");
        System.out.println();

        list.add(2,20);

        list.printList();

        System.out.println();
        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("==========Add 5 element after the last index.============");
        System.out.println();

        list.add(8,9);
        list.add(9,10);
        list.add(10,11);
        list.add(11,12);
        list.add(12,13);

        list.printList();
        System.out.println();
        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("====================Remove index 9==========================");

        list.remove(9);

        list.printList();
        System.out.println();
        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("====If the array capacity is exhausted, new node created.====");
        System.out.println("=============Add element in index 2, five times.=============");

        list.add(2,30);
        list.add(2,40);
        list.add(2,50);
        list.add(2,60);
        list.add(2,70);

        System.out.println();

        list.printList();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("===========Add 2 element end of the list============");
        System.out.println();

        list.add(14);
        list.add(15);

        list.printList();
        System.out.println();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();
        System.out.println("=======Remove last index of the list.========");
        System.out.println();

        list.remove(18);

        list.printList();

        System.out.println();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("==========Add element 3, in index 6.==========");
        System.out.println();

        list.add(6,3);
        list.printList();

        System.out.println();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("==========Add element 4, in index 7.==========");
        System.out.println();

        list.add(7,4);
        list.printList();

        System.out.println();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

        System.out.println("=========Remove index 15 in the list.=========");
        System.out.println();

        list.remove(15);

        list.printList();

        System.out.println();

        System.out.print("Number of elements in list:");
        System.out.println(list.getElementNumber());

        System.out.println();

    }
}
