import java.util.AbstractCollection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * This is MyDeque class which construct Deque structure.
 * @param <E> generic type.
 */
public class MyDeque <E> extends AbstractCollection <E> implements Deque <E>  {

    /**
     * Head of the list which keeps deque.
     */
    private Node <E> head1 = null;

    /**
     * Tail of the list which keeps deque.
     */
    private Node <E> tail1 = null;

    /**
     * Head of the list which keeps removed nodes.
     */
    private Node <E> head2 = null;

    /**
     * Tail of the list which keeps removed nodes.
     */
    private Node <E> tail2 = null;

    /**
     * Size of deque.
     */
    private int size ;

    /**
     * Capacity of deque.
     */
    private int capacity;

    /**
     * Keeps size of the list which keeps removed nodes.
     */
    private int nodeSize;

    /**
     * Constructor of MyDeque.
     */
    public MyDeque()
    {
        size = 0;
        capacity = 5;
        nodeSize = 0;
    }

    /**
     * This is my Node class.
     * @param <E> type E.
     */
    private static class Node<E>
    {
        /**
         * Keeps the nodes' data.
         */
        private E data;

        /**
         * Keeps a next node.
         */
        private Node<E> next;

        /**
         * Keeps a previous node.
         */
        private Node<E> prev;

        /**
         * Constructor of Node class.
         * @param newData is data.
         * @param next next node.
         * @param prev previous node.
         */
        private Node(E newData, Node <E> next, Node <E> prev)
        {
            this.data = newData;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * This is my iterator class which is implements Iterator interface.
     */
    public class MyIterator implements Iterator
    {
        /**
         * It is the next node of my list.
         */
        private Node <E> nextNode;

        /**
         * Controls iterator is forward or backward.
         */
        private int isDescending = 0;

        /**
         * Keep size of deque.
         */
        private int index = size;

        /**
         * Constructor of MyIterator.
         * @param controlDescending if you want iterate backward, set it 1.
         */
        public MyIterator(int controlDescending)
        {
            nextNode = head1;
            isDescending = controlDescending;
        }

        /**
         * This method checks if there is a next node.
         * @return true if there is a next node, otherwise return false.
         */
        @Override
        public boolean hasNext() {
            if(isDescending == 0)
                return nextNode != null;
            else
                return index != 0;
        }

        /**
         * This method returns next element and forward it.
         * @return next node.
         */
        @Override
        public Object next() {
            if(isDescending == 0)
            {
                if(!hasNext())
                    System.out.println("There is no next node");
                Node <E> tmp = nextNode;
                nextNode = nextNode.next;

                return tmp.data;
            }
            else{

                nextNode = head1;
                for(int i = 0; i < index-1; i++){
                    nextNode = nextNode.next;
                }
                Node <E> tmp2 = nextNode;

                index--;
                return tmp2.data;
            }

        }

        /**
         * This method throws UnsupportedOperationException.
         * @throws UnsupportedOperationException because of deque is not supported this operation.
         */
        @Override
        public void remove() throws UnsupportedOperationException{
            throw new UnsupportedOperationException("This operation is not supported.");
        }

        /**
         * This method throws UnsupportedOperationException.
         * @param action is the action which will be doing.
         * @throws UnsupportedOperationException because of deque is not supported this operation.
         */
        @Override
        public void forEachRemaining(Consumer action) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("This operation is not supported.");
        }
    }

    /**
     * Returns an iterator in deque.
     * @return an iterator.
     */
    @SuppressWarnings("unchecked")
    @Override
    public Iterator iterator() {

        MyIterator myIter = new MyIterator(0);

        return myIter;
    }

    /**
     * Returns an reverse iterator in deque.
     * @return an reverse iterator.
     */
    @SuppressWarnings("unchecked")
    @Override
    public Iterator descendingIterator() {
        MyIterator myIter = new MyIterator(1);

        return myIter;
    }

    /**
     * Inserts the specified element at the end of the deque.
     * If there are elements in removed nodes' list. Dont create new node use them.
     * @param o element that will be added.
     * @return true if element is add succesfully.
     * @throws IllegalStateException if the capacity is full.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean add(E o) throws IllegalStateException
    {
        if(size != capacity){
            if(head1 == null){
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    head1 = temp;
                    tail1 = temp;
                    size++;
                }
                else{
                    head1 = tail2;
                    head1.next = null;
                    head1.data = o;
                    tail1 = head1;
                    size++;
                    removeLastNode();
                }
            }
            else{
                if(nodeSize == 0){
                    Node <E> temp = new Node (o,null, null);
                    tail1.next = temp;
                    temp.prev = tail1;
                    tail1 = temp;
                    size++;
                }
                else{
                    tail1.next = tail2;
                    tail2.prev = tail1;
                    tail1 = tail2;
                    tail1.data = o;
                    size++;
                    removeLastNode();
                }
            }
            return true;
        }
        else
            throw new IllegalStateException ("Capacity is full. You are not add this element.");
    }
    /**
     * Inserts the specified element at the beginning of the deque.
     * If there are elements in removed nodes' list. Dont create new node use them.
     * @param o element that will be added.
     * @throws IllegalStateException if the capacity is full.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void addFirst(E o) throws IllegalStateException{
        if(size != capacity)
        {
            if(head1 == null){
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    head1 = temp;
                    tail1 = temp;
                    size++;
                }
                else{
                    head1 = tail2;
                    head1.next = null;
                    head1.data = o;
                    tail1 = head1;
                    size++;
                    removeLastNode();
                }
            }
            else{
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    temp.next = head1;
                    temp.next.prev = temp;
                    head1 = temp;
                    size++;
                }
                else{
                    tail2.next = head1;
                    tail2.next.prev = tail2;
                    head1 = tail2;
                    head1.data = o;
                    size++;
                    removeLastNode();
                }
            }
        }
        else
            throw new IllegalStateException ("Capacity is full. You are not add this element.");

    }

    /**
     * Inserts the specified element at the end of the deque.
     * If there are elements in removed nodes' list. Dont create new node use them.
     * @param o element that will be added.
     * @throws IllegalStateException if the capacity is full.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void addLast(E o) throws IllegalStateException{
        if(size != capacity){
            if(head1 == null){
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    head1 = temp;
                    tail1 = temp;
                    size++;
                }
                else{
                    head1 = tail2;
                    head1.next = null;
                    head1.data = o;
                    tail1 = head1;
                    size++;
                    removeLastNode();
                }
            }
            else{
                if(nodeSize == 0){
                    Node <E> temp = new Node (o,null, null);
                    tail1.next = temp;
                    temp.prev = tail1;
                    tail1 = temp;
                    size++;
                }
                else{
                    tail1.next = tail2;
                    tail2.prev = tail1;
                    tail1 = tail2;
                    tail1.data = o;
                    size++;
                    removeLastNode();
                }
            }
        }
        else
            throw new IllegalStateException ("Capacity is full. You are not add this element.");
    }

    /**
     * Inserts the specified element into the head of deque.
     * If there are elements in removed nodes' list. Dont create new node use them.
     * @param o element that will be added.
     * @return true if element added succesfully otherwise return false.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean offerFirst(E o) {
        int tempSize = size;

        if(size != capacity)
        {
            if(head1 == null){
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    head1 = temp;
                    tail1 = temp;
                    size++;
                }
                else{
                    head1 = tail2;
                    head1.next = null;
                    head1.data = o;
                    tail1 = head1;
                    size++;
                    removeLastNode();
                }
            }
            else{
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    temp.next = head1;
                    temp.next.prev = temp;
                    head1 = temp;
                    size++;
                }
                else{
                    tail2.next = head1;
                    tail2.next.prev = tail2;
                    head1 = tail2;
                    head1.data = o;
                    size++;
                    removeLastNode();
                }
            }
        }

        return tempSize != size;

    }

    /**
     * Inserts the specified element into the tail of deque.
     * If there are elements in removed nodes' list. Dont create new node use them.
     * @param o element that will be added.
     * @return true if element added succesfully otherwise return false.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean offerLast(E o) {
        int tempSize = size;

        if(size != capacity){
            if(head1 == null){
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    head1 = temp;
                    tail1 = temp;
                    size++;
                }
                else{
                    head1 = tail2;
                    head1.next = null;
                    head1.data = o;
                    tail1 = head1;
                    size++;
                    removeLastNode();
                }
            }
            else{
                if(nodeSize == 0){
                    Node <E> temp = new Node (o,null, null);
                    tail1.next = temp;
                    temp.prev = tail1;
                    tail1 = temp;
                    size++;
                }
                else{
                    tail1.next = tail2;
                    tail2.prev = tail1;
                    tail1 = tail2;
                    tail1.data = o;
                    size++;
                    removeLastNode();
                }
            }
        }

        return tempSize != size;
    }

    /**
     * Retrieves and removes the first element of this deque.
     * Then assign removed node to the list which keeps removed nodes.
     * @return first element of the deque.
     * @throws NoSuchElementException if deque is empty.
     */
    @Override
    public E removeFirst() throws NoSuchElementException{
        if(head1 == null)
            throw new NoSuchElementException("Deque is empty.");
        else{
            if(head2 == null)
            {
                head2 = head1;
                head1 = head2.next;
                head1.prev = null;
                head2.next = null;
                tail2 = head2;
                nodeSize++;
                size--;
            }
            else{
                tail2.next = head1;
                head1 = tail2.next.next;
                head1.prev = null;
                tail2.next.next = null;
                tail2 = tail2.next;
                nodeSize++;
                size--;
            }

            return (E) tail2.data;
        }
    }

    /**
     * Retrieves and removes the last element of this deque.
     * Then assign removed node to the list which keeps removed nodes.
     * @return last element of the deque.
     * @throws NoSuchElementException if deque is empty.
     */
    @Override
    public E removeLast() throws NoSuchElementException{

        if(head1 == null)
            throw new NoSuchElementException("Deque is empty.");
        else{
            if(head2 == null){
                head2 = tail1;
                tail2 = head2;
                nodeSize++;
                size--;
            }
            else{
                tail2.next = tail1;
                tail2 = tail2.next;
                nodeSize++;
                size--;
            }

            if(head1 != tail1 ) {
                Node <E> current = head1;
                while(current.next != tail1) {
                    current = current.next;
                }
                tail1 = current;
                tail1.next = null;
            }

            else {
                head1 = tail1 = null;
            }
        }
        return (E) tail2.data;
    }

    /**
     * Retrieves and removes the first element of this deque.
     * Then assign removed node to the list which keeps removed nodes.
     * @return first element of the deque, if deque is empty return null.
     */
    @Override
    public E pollFirst() {

        if(head1 == null)
            return null;
        else{
            if(head2 == null)
            {
                head2 = head1;
                head1 = head2.next;
                head1.prev = null;
                head2.next = null;
                tail2 = head2;
                nodeSize++;
                size--;
            }
            else{
                tail2.next = head1;
                head1 = tail2.next.next;
                head1.prev = null;
                tail2.next.next = null;
                tail2 = tail2.next;
                nodeSize++;
                size--;
            }
            return (E) tail2.data;
        }
    }

    /**
     * Retrieves and removes the last element of this deque.
     * Then assign removed node to the list which keeps removed nodes.
     * @return last element of the deque, if deque is empty return null.
     */
    @Override
    public E pollLast() {
        if(head1 == null)
            return null;
        else{
            if(head2 == null){
                head2 = tail1;
                tail2 = head2;
                nodeSize++;
                size--;
            }
            else{
                tail2.next = tail1;
                tail2 = tail2.next;
                nodeSize++;
                size--;
            }

            if(head1 != tail1 ) {
                Node <E> current = head1;
                while(current.next != tail1) {
                    current = current.next;
                }
                tail1 = current;
                tail1.next = null;
            }
            else {
                head1 = tail1 = null;
            }
        }
        return (E) tail2.data;
    }

    /**
     * Retrieves the first element of deque.
     * @return the first element of deque.
     * @throws NoSuchElementException if deque is empty.
     */
    @Override
    public E getFirst() throws NoSuchElementException {

        if(head1 == null)
            throw new NoSuchElementException("Deque is empty.");

        return head1.data;
    }

    /**
     * Retrieves the last element of deque.
     * @return the last element of deque.
     * @throws NoSuchElementException if deque is empty.
     */
    @Override
    public E getLast() throws NoSuchElementException {

        if(head1 == null)
            throw new NoSuchElementException("Deque is empty.");

        return tail1.data;
    }

    /**
     * Retrieves the first element of deque.
     * @return the first element of deque, if deque is empty return null.
     */
    @Override
    public E peekFirst() {
        if(head1 == null)
            return null;

        return head1.data;
    }

    /**
     * Retrieves the last element of deque.
     * @return the last element of deque, if deque is empty return null.
     */
    @Override
    public E peekLast() {
        if(head1 == null)
            return null;

        return tail1.data;
    }

    /**
     * Removes the first occurrence of the specified element from this deque.
     * Then assign removed node to the list which keeps removed nodes.
     * @param o element to be removed from deque.
     * @return true if element removed succesfully.
     * @throws NullPointerException if element to be removed is null.
     */
    @Override
    public boolean removeFirstOccurrence(Object o) throws NullPointerException{

        if(o == null)
            throw new NullPointerException("This element is null.");

        Node <E> current = head1;

        while(current.next != null){
            if(current.next.data == o){
                if(head2 == null)
                {
                    head2 = current.next;
                    current.next = head2.next;
                    head2.next = null;
                    tail2 = head2;
                    nodeSize++;
                    size--;
                }
                else{
                    tail2.next = current.next;
                    current.next = tail2.next.next;
                    tail2.next.next = null;
                    tail2 = tail2.next;
                    nodeSize++;
                    size--;
                }
                return true;
            }
            else
                current = current.next;
        }
        return false;
    }

    /**
     * Removes the last occurrence of the specified element from this deque.
     * Then assign removed node to the list which keeps removed nodes.
     * @param o  o element to be removed from deque.
     * @return  true if element removed succesfully.
     * @throws NullPointerException if element to be removed is null.
     */
    @Override
    public boolean removeLastOccurrence(Object o) throws NullPointerException {

        if(o == null)
            throw new NullPointerException("This element is null.");

        Node <E> temp = head1;

        int index = 0;
        int i = 0;

        if(temp == null)
            return false;

        while(temp.next != null) {
            i++;
            if(temp.next.data == o){
                index = i;
            }
            temp = temp.next;
        }

        temp = head1;

        for(int j = 0; j < index - 1 ; j++){
            temp = temp.next;
        }

        if(head2 == null)
        {
            head2 = temp.next;
            temp.next = head2.next;
            head2.next = null;
            tail2 = head2;
            nodeSize++;
            size--;
        }
        else{
            tail2.next = temp.next;
            temp.next = tail2.next.next;
            tail2.next.next = null;
            tail2 = tail2.next;
            nodeSize++;
            size--;
        }
        return true;

    }

    /**
     * Inserts the specified element into the tail of deque.
     * If there are elements in removed nodes' list. Dont create new node use them.
     * @param o element which will be added.
     * @return true if element added succesfully otherwise return false.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean offer(E o) {

        int tempSize = size;

        if(size != capacity){
            if(head1 == null){
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    head1 = temp;
                    tail1 = temp;
                    size++;
                }
                else{
                    head1 = tail2;
                    head1.next = null;
                    head1.data = o;
                    tail1 = head1;
                    size++;
                    removeLastNode();
                }
            }
            else{
                if(nodeSize == 0){
                    Node <E> temp = new Node (o,null, null);
                    tail1.next = temp;
                    temp.prev = tail1;
                    tail1 = temp;
                    size++;
                }
                else{
                    tail1.next = tail2;
                    tail2.prev = tail1;
                    tail1 = tail2;
                    tail1.data = o;
                    size++;
                    removeLastNode();
                }
            }
        }

        return tempSize != size;
    }

    /**
     * Retrieves and removes the first element of the deque.
     * Then assign removed node to the list which keeps removed nodes.
     * @return first element of the deque.
     * @throws NoSuchElementException if deque is empty.
     */
    @Override
    public E remove() throws NoSuchElementException{
        if(head1 == null)
            throw new NoSuchElementException("Deque is empty.");
        else{
            if(head2 == null)
            {
                head2 = head1;
                head1 = head2.next;
                head1.prev = null;
                head2.next = null;
                tail2 = head2;
                nodeSize++;
                size--;
            }
            else{
                tail2.next = head1;
                head1 = tail2.next.next;
                head1.prev = null;
                tail2.next.next = null;
                tail2 = tail2.next;
                nodeSize++;
                size--;
            }

            return (E) tail2.data;
        }
    }

    /**
     * Retrieves and removes the first element of the deque.Then assign removed node to the list which keeps removed nodes.
     * @return first element of the deque, if deque is empty returns null.
     */
    @Override
    public E poll() {
        if(head1 == null)
            return null;
        else{
            if(head2 == null)
            {
                head2 = head1;
                head1 = head2.next;
                head1.prev = null;
                head2.next = null;
                tail2 = head2;
                nodeSize++;
                size--;
            }
            else{
                tail2.next = head1;
                head1 = tail2.next.next;
                head1.prev = null;
                tail2.next.next = null;
                tail2 = tail2.next;
                nodeSize++;
                size--;
            }
            return (E) tail2.data;
        }
    }

    /**
     * Retrieve the first element of deque.
     * @return first element of deque.
     * @throws NoSuchElementException if deque is empty.
     */
    @Override
    public E element() throws NoSuchElementException {
        if(head1 == null)
            throw new NoSuchElementException("Deque is empty.");
        else
            return head1.data;
    }

    /**
     * Retrieve the first element of deque.
     * @return first element of deque but if deque is empty return null.
     */
    @Override
    public E peek() {
        if(head1 == null)
            return null;

        return head1.data;
    }

    /**
     *This method equals to addFirst method.Take element and add the beginning of the deque.
     * If there are elements in removed nodes' list. Dont create new node use them.
     * @param o element which will be added.
     * @throws IllegalStateException if the element cannot be added because of capacity restriction.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void push(E o) throws IllegalStateException{

        if(size != capacity)
        {
            if(head1 == null){
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    head1 = temp;
                    tail1 = temp;
                    size++;
                }
                else{
                    head1 = tail2;
                    head1.next = null;
                    head1.data = o;
                    tail1 = head1;
                    size++;
                    removeLastNode();
                }
            }
            else{
                if(nodeSize == 0){
                    Node <E> temp = new Node(o,null, null);
                    temp.next = head1;
                    temp.next.prev = temp;
                    head1 = temp;
                    size++;
                }
                else{
                    tail2.next = head1;
                    tail2.next.prev = tail2;
                    head1 = tail2;
                    head1.data = o;
                    size++;
                    removeLastNode();
                }
            }
        }
        else
            throw new IllegalStateException ("Capacity is full. You are not add this element.");
    }

    /**
     * This method removes a first node of the list.
     * Then assign removed node to the list which keeps removed nodes.
     * @return first element of the list.
     * @throws NoSuchElementException if there is no element in the list.
     */
    @Override
    public E pop() throws NoSuchElementException{
        if(head1 == null)
            throw new NoSuchElementException("Deque is empty.");
        else{
            if(head2 == null)
            {
                head2 = head1;
                head1 = head2.next;
                head1.prev = null;
                head2.next = null;
                tail2 = head2;
                nodeSize++;
                size--;
            }
            else{
                tail2.next = head1;
                head1 = tail2.next.next;
                head1.prev = null;
                tail2.next.next = null;
                tail2 = tail2.next;
                nodeSize++;
                size--;
            }
            return (E) tail2.data;
        }
    }

    /**
     * Overriding size method.
     * @return size of the deque list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if this deque contains the specified element.
     * @param o is the element to be searching.
     * @return true if element is in deque.
     * @throws NullPointerException if element is null.
     */
    @Override
    public boolean contains(Object o) throws NullPointerException
    {
        if(o == null)
            throw new NullPointerException("This element is null.");

        Node <E> temp = head1;

        while(temp != null)
        {
            if(temp.data == o)
                return true;
            temp = temp.next;
        }
        return false;
    }

    /**
     * This method prints a list which keeps the removed nodes.
     */
    public void printRemovedNodes()
    {
        System.out.println("List2: Keeps removed nodes.");
        Node <E> temp = head2;

        if(temp == null)
            System.out.print("This list is empty.");

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("Size: "+ nodeSize);
        System.out.println();
    }

    /**
     * This method prints deque list.
     */
    public void printDeque()
    {

        System.out.println("List1: Keeps deque.");
        Node <E> temp = head1;

        if(temp == null)
            System.out.print("This list is empty.");

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("Size: "+ size);
        System.out.println();
    }

    /**
     * This method removes the last node of the list which keeps removed nodes.
     * If you need a new node, use removed node and then remove this node from list which keeps removed nodes.
     */
    public void removeLastNode()
    {
        if(head2 != tail2 ) {
            Node <E> current = head2;
            while(current.next != tail2) {
                current = current.next;
            }
            tail2 = current;
            tail2.next = null;
        }

        else {
            head2 = tail2 = null;
        }
        nodeSize--;
    }
}
