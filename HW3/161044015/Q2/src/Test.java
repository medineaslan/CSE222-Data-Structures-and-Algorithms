import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This is my test class which I tested my all methods.
 */
public class Test {
    public static void main(String[] args)
    {
        LinkedList<Character> linkedList = new LinkedList();

        SimpleTextEditor textEditor = new SimpleTextEditor(linkedList);

        System.out.println();
        System.out.println("=======Reading text file in a LINKED LIST Using LOOP=======");

        System.out.println("====================Print Linked List.======================");
        System.out.println();

        long start = System.nanoTime();
        textEditor.readFromFileWithLoop("input.txt");
        long end =  System.nanoTime();

        long duration = (end- start);

        System.out.println("Time: "+ duration);

        textEditor.printList();

        System.out.println();

        System.out.println("=======Add string ' newStr' in index 5 of list Using LOOP=====" );

        start = System.currentTimeMillis();

        textEditor.addWithLoop(" newStr", 5);

        end = System.currentTimeMillis();

        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();
        textEditor.printList();

        System.out.println();
        System.out.println("==========Add char 'E' in index 1 of list Using LOOP=========" );

        System.out.println();
        start = System.currentTimeMillis();

        textEditor.addWithLoop("E", 1);

        end = System.currentTimeMillis();

        duration = (end- start);

        System.out.println("Time: "+ duration);

        textEditor.printList();

        System.out.println();

        System.out.println("============Find string 'is' in a list using LOOP=============");
        System.out.println();

        System.out.print("Index: ");
        start = System.currentTimeMillis();

        System.out.println(textEditor.findWithLoop("is"));

        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);


        System.out.println();
        System.out.println("============Find string 'HE' in a list using LOOP=============");
        System.out.println();

        System.out.print("Index: ");
        start = System.currentTimeMillis();
        System.out.println(textEditor.findWithLoop("HE"));
        end = System.currentTimeMillis();

        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();
        System.out.println("===========Replace char 'e' to char '1' Using LOOP============");

        System.out.println("===================Current version of list.===================");
        System.out.println();
        textEditor.printList();

        System.out.println();

        System.out.println("===================New version of list.=======================");
        System.out.println();

        start = System.currentTimeMillis();

        textEditor.replaceWithLoop('e','1');

        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);
        textEditor.printList();

        System.out.println();
        System.out.println("=======Reading text file in a LINKED LIST Using ITERATOR=======");
        System.out.println("====================Print Linked List.=========================");

        LinkedList<Character> linkedListIter = new LinkedList();

        SimpleTextEditor textEditor2 = new SimpleTextEditor(linkedListIter);
        start = System.currentTimeMillis();

        textEditor2.readFromFileWithIterator("input.txt");

        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();

        textEditor2.printList();

        System.out.println();
        System.out.println("=====Add string ' newStr' in index 10 of list Using ITERATOR====" );
        start = System.currentTimeMillis();

        textEditor2.addWithIterator(" newStr", 10);

        end = System.currentTimeMillis();

        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();
        textEditor2.printList();

        System.out.println();
        System.out.println("==========Add char 'A' in index 15 of list Using ITERATOR========" );

        System.out.println();
        start = System.currentTimeMillis();

        textEditor2.addWithIterator("A", 15);
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        textEditor2.printList();

        System.out.println();
        System.out.println("===========Replace char 't' to char '2' Using ITERATOR===========");

        System.out.println("===================Current version of list.======================");
        System.out.println();
        textEditor2.printList();

        System.out.println();

        System.out.println("===================New version of list.==========================");
        System.out.println();
        start = System.currentTimeMillis();

        textEditor2.replaceWithIterator('t','2');

        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);
        textEditor2.printList();

        System.out.println();

        ArrayList<Character> arrayList = new ArrayList();

        SimpleTextEditor textEditor3 = new SimpleTextEditor(arrayList);

        System.out.println("=======Reading text file in a ARRAY LIST Using LOOP=======");
        start = System.currentTimeMillis();

        textEditor3.readFromFileWithLoop("input.txt");
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println("====================Print Array List.=====================");
        System.out.println();

        textEditor3.printList();

        System.out.println();

        System.out.println("=======Add string ' newStr' in index 15 of list Using LOOP=====" );
        start = System.currentTimeMillis();

        textEditor3.addWithLoop(" newStr", 15);
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);
        System.out.println();
        textEditor3.printList();

        System.out.println();

        System.out.println();
        System.out.println("==========Add char 'H' in index 7 of list Using LOOP=========" );

        System.out.println();
        start = System.currentTimeMillis();

        textEditor3.addWithLoop("H", 7);
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);
        textEditor3.printList();

        System.out.println();

        System.out.println("============Find string 'is' in a list using LOOP=============");
        System.out.println();

        System.out.print("Index: ");
        start = System.currentTimeMillis();

        System.out.println(textEditor3.findWithLoop("is"));
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();

        System.out.println("===========Replace char 's' to char '4' Using LOOP============");

        System.out.println("===================Current version of list.===================");
        System.out.println();
        textEditor3.printList();

        System.out.println();

        System.out.println("===================New version of list.=======================");
        System.out.println();
        start = System.currentTimeMillis();

        textEditor3.replaceWithLoop('s','4');
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        textEditor3.printList();

        System.out.println();
        System.out.println("=======Reading text file in a ARRAY LIST Using ITERATOR=======");
        System.out.println("====================Print Array List.=========================");

        ArrayList<Character> arrayListIter = new ArrayList();

        SimpleTextEditor textEditor4 = new SimpleTextEditor(arrayListIter);

        start = System.currentTimeMillis();

        textEditor4.readFromFileWithIterator("input.txt");
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();

        textEditor4.printList();

        System.out.println();

        System.out.println();
        System.out.println("=====Add string ' newStr' in index 20 of list Using ITERATOR====" );
        start = System.currentTimeMillis();

        textEditor4.addWithIterator(" newStr", 20);
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();
        textEditor4.printList();

        System.out.println();
        System.out.println("==========Add char 'K' in index 3 of list Using ITERATOR========" );

        System.out.println();
        start = System.currentTimeMillis();

        textEditor4.addWithIterator("K", 3);
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);
        textEditor4.printList();

        System.out.println();

        System.out.println();
        System.out.println("==========Replace char 'i' to char '8' Using ITERATOR===========");

        System.out.println("===================Current version of list.======================");
        System.out.println();
        textEditor4.printList();

        System.out.println();

        System.out.println("===================New version of list.==========================");
        System.out.println();

        start = System.currentTimeMillis();

        textEditor4.replaceWithIterator('i','8');

        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        textEditor4.printList();

        System.out.println();

        System.out.println("==========Error checking when doing replacing.===========");
        System.out.println("=============If element is not found in list.============");
        System.out.println("==============Replace element W to 4.====================");

        System.out.println();
        start = System.currentTimeMillis();

        textEditor4.replaceWithLoop('W','4');
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

        System.out.println();
        System.out.println("========Error checking when doing add operation.=========");
        System.out.println("=============If element index is out of range.===========");
        System.out.println("==========Add string 'Medine' in index 100===============");

        System.out.println();

        start = System.currentTimeMillis();

        textEditor4.addWithLoop("Medine",100);
        end = System.currentTimeMillis();
        duration = (end- start);

        System.out.println("Time: "+ duration);

    }
}
