import java.util.NoSuchElementException;

/**
 * This is my test class which I test all of MyDeque class methods.
 */
public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        MyDeque deque = new MyDeque();

        System.out.println();
        System.out.println("======================Capacity of deque is 5=======================");
        System.out.println();

        System.out.println("============================Error check============================");
        System.out.println("======Remove element when deque is empty using 'remove' method=====");
        System.out.println();

        try{
            deque.remove();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("============================Error check============================");
        System.out.println("===Remove element when deque is empty using 'removeFirst' method===");
        System.out.println();

        try{
            deque.removeFirst();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("============================Error check===========================");
        System.out.println("===Remove element when deque is empty using 'removeLast' method===");
        System.out.println();

        try{
            deque.removeLast();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("============================Error check===========================");
        System.out.println("===Get first element when deque is empty using 'getFirst' method==");
        System.out.println();

        try{
            deque.getFirst();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("============================Error check===========================");
        System.out.println("===Get last element when deque is empty using 'getLast' method====");
        System.out.println();

        try{
            deque.getLast();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("============================Error check===========================");
        System.out.println("=Peek first element when deque is empty using 'peekFirst' method==");
        System.out.println();
        System.out.println("Return: "+deque.peekFirst());
        System.out.println();

        System.out.println("============================Error check===========================");
        System.out.println("==Peek last element when deque is empty using 'peekLast' method===");
        System.out.println();
        System.out.println("Return: "+deque.peekLast());
        System.out.println();

        System.out.println("============================Error check===========================");
        System.out.println("===Get first element when deque is empty using 'element' method===");
        System.out.println();

        try{
            deque.element();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("============================Error check===========================");
        System.out.println("====Peek first element when deque is empty using 'peek' method====");
        System.out.println();
        System.out.println("Return: "+deque.peek());
        System.out.println();

        System.out.println("=======Add 5 element using 'add' method.=======");
        System.out.println();
        try{
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            deque.add(5);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("====================Error check====================");
        System.out.println("=========Add 1 element using 'add' method.=========");
        System.out.println();

        try{
            deque.add(1);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("========Remove element using 'remove' method.=======");

        try{
            deque.remove();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println();
        System.out.println("===Remove first element using 'removeFirst' method.===");

        try{
            deque.removeFirst();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println();
        System.out.println("=====Remove last element using 'removeLast' method.====");

        try{
            deque.removeLast();
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println();

        System.out.println("=====Remove first element using 'pollFirst' method.====");

        System.out.println("==This method retrives and removes first element: "+deque.pollFirst()+" ==");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("====Add element beginning of deque using 'addFirst' method.====");

        try{
            deque.addFirst(8);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("=====Remove last element using 'pollLast' method.=====");

        System.out.println("==This method retrives and removes first element: "+deque.pollLast()+" ==");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("====Add element end of deque using 'addLast' method.====");

        try{
            deque.addLast(9);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("=====Add element beginning of deque using 'offerFirst' method.=====");

        System.out.println("====This method return true if element added succesfully: "+deque.offerFirst(9)+" ====");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("=========Add element end of deque using 'offerLast' method.========");

        System.out.println("====This method return true if element added succesfully: "+deque.offerLast(8)+" ====");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("========Add element beginning of deque using 'push' method.=========");

        try{
            deque.push(7);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("====================Error check====================");
        System.out.println("=========Add 1 element using 'push' method.========");
        System.out.println();

        try{
            deque.push(20);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("==Remove first occurence of element '9' using 'removeFirstOccurrence' method==");

        System.out.print("=========This method return true if element removed succesfully: ");

        try{
            System.out.println(deque.removeFirstOccurrence(9)+" ========");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("===========Add element end of deque using 'offer' method.==========");

        System.out.println("====This method return true if element added succesfully: "+deque.offer(10)+" ====");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println();

        System.out.println("==Remove last occurence of element '8' using 'removeLastOccurrence' method==");

        System.out.print("========This method return true if element removed succesfully: ");

        try{
            System.out.println(deque.removeLastOccurrence(8)+" =======");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println();

        System.out.println("========Remove first element using 'poll' method.======");

        System.out.println("==This method retrives and removes first element: "+deque.poll()+" ==");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("========Remove first element using 'pop' method.=======");

        System.out.println("==This method returns and removes first element: "+deque.pop()+" ==");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("====================Error check====================");
        System.out.println("=====Remove first occurence of element 'null'.=====");
        System.out.println();

        try{
            System.out.println(deque.removeFirstOccurrence(null)+" ========");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("====================Error check====================");
        System.out.println("=====Remove last occurence of element 'null'.======");
        System.out.println();

        try{
            System.out.println(deque.removeLastOccurrence(null)+" ========");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("====Add element beginning of deque using 'addFirst' method.====");

        try{
            deque.addFirst(8);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("====Add element end of deque using 'addLast' method.====");

        try{
            deque.addLast(11);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("=====Add element beginning of deque using 'offerFirst' method.=====");

        System.out.println("====This method return true if element added succesfully: "+deque.offerFirst(7)+" ====");
        System.out.println();

        deque.printDeque();
        deque.printRemovedNodes();

        System.out.println("======================Error check=======================");
        System.out.println("=========Add 1 element using 'addFirst' method.=========");
        System.out.println();

        try{
            deque.addFirst(1);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("======================Error check=======================");
        System.out.println("=========Add 1 element using 'addLast' method.==========");
        System.out.println();

        try{
            deque.addLast(1);
        }
        catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("=================Print Deque====================");

        deque.printDeque();

        System.out.println("====Print size of deque using 'size' method.====");
        System.out.println("Size of deque: "+ deque.size() );
        System.out.println();

        System.out.println("===========Test 'contains' method.==============");
        System.out.println();
        System.out.println("=======Is the list contains element '7' ?=======");
        System.out.println(deque.contains(7));
        System.out.println("=======Is the list contains element '15' ?======");
        System.out.println(deque.contains(15));

        System.out.println();
        System.out.println("============Test 'getFirst' method==============");
        System.out.println();
        System.out.println("First element of deque: "+deque.getFirst());
        System.out.println();
        System.out.println("============Test 'getLast' method===============");
        System.out.println();
        System.out.println("Last element of deque: "+deque.getLast());

        System.out.println();
        System.out.println("============Test 'peekFirst' method=============");
        System.out.println();
        System.out.println("First element of deque: "+deque.peekFirst());
        System.out.println();
        System.out.println("============Test 'peekLast' method==============");
        System.out.println();
        System.out.println("Last element of deque: "+deque.peekLast());
        System.out.println();
        System.out.println("===============Test 'peek' method===============");
        System.out.println();
        System.out.println("First element of deque: "+deque.peek());
        System.out.println();
        System.out.println("==============Test 'element' method=============");
        System.out.println();
        System.out.println("First element of deque: "+deque.element());
        System.out.println();

        System.out.println("==================Test 'iterator' method================");
        System.out.println("==========Print list using 'iterator' method============");
        System.out.println();

        var iter = deque.iterator();

        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
        System.out.println();

        System.out.println();
        System.out.println("=============Test 'descendingIterator' method===========");
        System.out.println("======Print list using 'descendingIterator' method======");
        System.out.println();

        var ite = deque.descendingIterator();

        while(ite.hasNext())
        {
            System.out.print(ite.next()+" ");
        }
        System.out.println();

    }
}
