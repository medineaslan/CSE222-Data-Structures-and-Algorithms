import java.security.InvalidParameterException;
import java.util.AbstractList;
import java.util.List;

/**
 * This is a LinkedArrayList class which extends AbstractList class and implements List interface.
 * @param <E> type E.
 */
public class LinkedArrayList <E> extends AbstractList <E> implements List <E>{

    /**
     * Constructor of LinkedArrayList.
     */
    public LinkedArrayList() {
        size = 0;
        elementNumber = 0;
    }

    /**
     * Keeps a head of the list.
     */
    private Node <E> head = null;
    /**
     * Keeps a tail of the list.
     */
    private Node <E> tail = null;
    /**
     * Keeps a size of the list.
     */
    private int size;

    /**
     * Number of elements in list.
     */
    private int elementNumber;

    /**
     * Getter method of elementNumber.
     * @return elementNumber.
     */
    public int getElementNumber() {
        return elementNumber;
    }

    /**
     * Overriding get method.
     * @param index shows the node that is returned.
     * @return a choose node.
     */
    @Override
    public E get(int index) {
        return head.arr[index];
    }

    /**
     * Overriding size method.
     * @return size of the list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * This is my double node class.
     * @param <E> is generic class.
     */
    @SuppressWarnings("unchecked")
    private static class Node<E>
    {
        /**
         * This is array of nodes for keeping the data.
         */
        private E[] arr = (E[]) new Object [5] ;

        /**
         * Keeps size of the array.
         */
        private int arrSize = 0;
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
         * @param next next node.
         * @param prev previous node.
         */
        private Node(Node <E> next, Node <E> prev)
        {
            this.next = next;
            this.prev = prev;
        }

        /**
         * Getter method of arrSize.
         * @return arrSize.
         */
        public int getArrSize() {
            return arrSize;
        }
    }

    /**
     * This is my ListIterator class.
     */
    private class MyListIterator
    {
        /**
         * It is the next node of my list.
         */
        private Node <E> nextNode;
        /**
         * It is the previous node of my list.
         */
        private Node <E> prevNode;


        /**
         * Constructor of MyListIterator.
         */
        public MyListIterator()
        {
            nextNode = head;
            prevNode = tail;
        }

        /**
         * This method checks if there is a next node.
         * @return true if there is a next node, otherwise return false.
         */
        public boolean hasNext(){
            return nextNode != null;
        }

        /**
         *This method returns next node and forward it.
         * @return next node.
         */
        public Node <E> next(){
            if(!hasNext())
                System.out.println("There is no next");
            Node <E> tmp = nextNode.next;
            nextNode = nextNode.next;

            return tmp;
        }

        /**
         * This method checks if there is a previous node.
         * @return true if there is a previous node, otherwise return false.
         */
        public boolean hasPrevious(){
            return prevNode != null;
        }

        /**
         * This method returns previous node and backward it.
         * @return previous node.
         */
        public Node <E> previous(){
            if(!hasPrevious())
                System.out.println("There is no previous");
            Node <E> tmp = prevNode.prev;
            prevNode = prevNode.prev;

            return tmp;
        }
    }

    /**
     * This add method using for the adding in the end of the list.
     * @param e is the element that is added.
     * @return true if adding successfully.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean add(E e) {
        if(head == null){ //If there is no node in the list, create a new node and add element in the first index.
            Node <E> temp = new Node(null, null);
            head = temp;
            tail = temp;
            head.arr[0] = e;
            head.arrSize++;
            size++;
            elementNumber++;
        }
        else{ //If there is a node and add the end of the list.
            Node <E> temp2 = head;
            while (temp2.next != null)
                temp2 = temp2.next;
            for(int i = 0; i < 5; i++){
                if(temp2.arr[i] == null){
                    temp2.arr[i] = e;
                    temp2.arrSize++;
                    elementNumber++;
                    break;
                }
                if(i == 4 && temp2.arr[i] != null)
                {
                    Node <E> newNode = new Node(null, temp2);
                    temp2.next = newNode;
                    temp2.next.prev = temp2;
                    tail = temp2.next;
                    temp2.next.arr[0] = e;
                    temp2.next.arrSize++;
                    elementNumber++;
                    size++;
                }
            }
        }
        return true;
    }

    /**
     * This method add an element in the array that is choose by parameter index.
     * @param index this parameter using for the finding corresponding array to be added.
     * @param element is the element that is added.
     * @throws InvalidParameterException if user wants to add first element in other index than index zero.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void add(int index, E element) throws InvalidParameterException {

        MyListIterator myIter = new MyListIterator();

        if(head == null ){
            if(index != 0){
                throw new InvalidParameterException("You can not add in this index.");
            }
            else{
                Node <E> temp = new Node(null, null);
                head = temp;
                tail = temp;
                size++;
                head.arr[index] = element;
                head.arrSize++;
                elementNumber++;
            }
        }
        else{
            Node <E> tmp = head;
            if(index < 5){
                if(tmp.arr[index] == null && tmp.arr[index-1] != null){
                    tmp.arr[index] = element;
                    tmp.arrSize++;
                    elementNumber++;
                }
                else if(tmp.arr[index-1] == null)
                    System.out.println("You are not in this index.");
                else if(tmp.arr[index] != null){
                    if(isFullArr(tmp.arr)){
                        Node <E> newNode = new Node(tmp.next, tmp);
                        newNode.arr[0] = tmp.arr[4];
                        newNode.arrSize++;
                        tmp.next = newNode;
                        tmp.next.prev = tmp;
                        tail = tmp.next;
                        size++;
                        for(int i = 3; i >= index; i-- )
                            tmp.arr[i+1] = tmp.arr[i];
                        tmp.arr[index] = element;
                        elementNumber++;
                    }
                    else{
                        for(int i = 3; i >= index; i-- )
                            tmp.arr[i+1] = tmp.arr[i];
                        tmp.arr[index] = element;
                        elementNumber++;
                    }
                }
            }
            else{
                if(size < (index / 5) + 1)
                {
                    for(int i = 0; i < size - 1; i++){
                        tmp = tmp.next;
                    }
                    if(isFullArr(tmp.arr)){
                        Node <E> newNode = new Node(null, tmp);
                        tmp.next = newNode;
                        tmp.next.prev = tmp;
                        tail = tmp.next;
                        size++;
                        tmp.next.arr[0] = element;
                        elementNumber++;
                        tmp.next.arrSize++;
                    }
                    else
                        System.out.println("You are not add in this element.");
                }
                else{

                    if(tmp.next == null)
                    {
                        if(index - elementNumber != 0)
                            System.out.println("You can not add this index.");
                        else{
                            Node <E> newNode = new Node(null, tmp);
                            tmp.next = newNode;
                            tmp.next.prev = tmp;
                            tail = tmp.next;
                            size++;
                            tmp.next.arr[0] = element;
                            elementNumber++;
                            tmp.next.arrSize++;
                        }
                    }
                    else{
                        for(int i=0; i < (index/5); i++)
                            tmp = tmp.next;
                        if(tmp.arr[index % 5] == null){
                            tmp.arr[index % 5] = element;
                            tmp.arrSize++;
                            elementNumber++;
                        }
                        else{
                            if(isFullArr(tmp.arr)){
                                Node <E> newNode = new Node(tmp.next, tmp);
                                newNode.arr[0] = tmp.arr[4];
                                newNode.arrSize++;
                                tmp.next = newNode;
                                tmp.next.prev = tmp;
                                tail = tmp.next;
                                size++;
                                for(int j=3; j>= index%5; j--)
                                    tmp.arr[j+1] = tmp.arr[j];
                                tmp.arr[index % 5] = element;
                                tmp.arrSize++;
                                elementNumber++;
                            }
                            else{
                                for(int j = 3; j >= index % 5; j--)
                                    tmp.arr[j+1] = tmp.arr[j];
                                tmp.arr[index % 5] = element;
                                tmp.arrSize++;
                                elementNumber++;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This method removes an element that is choose by parameter index.
     * @param index is used for finding corresponding array for removing element.
     * @return this method returns element that is removed.
     */
    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {

        Node tmp = head;
        int tmpIndex = 0;

        MyListIterator myIter = new MyListIterator();

        if(index > elementNumber)
            System.out.println("There is no element in this index.");
        else{
            if(head == null){
                System.out.println("There is no element in the list.");
                return null;
            }
            if(index < 5)
            {
                int tempIndex = 0;
                int nullNumber = 0;
                for(int j = 0; j < 5; j++){
                    if(head.arr[j] != null){
                        tempIndex++;
                        if(tempIndex == index+1){
                            for(int i=index+nullNumber; i < 4; i++){
                                head.arr[i] = head.arr[i+1];
                            }
                            head.arr[4] = null;
                        }
                    }
                    else
                        nullNumber++;
                }
                if(isEmptyArr((E[]) head.arr)){ //If array is empty, removes empty node.
                    removeEmptyNode(head);
                }
                elementNumber--;
            }
            else{
                int used = 0;
                while(tmpIndex < index+1){
                    used = 0;
                    for(int k=0; k < 5; k++ ){
                        if(tmp.arr[k] != null && tmpIndex != index + 1){
                            tmpIndex++;
                            used++;
                        }
                    }
                    if(tmpIndex != index+1){
                        if(tmp.next != null)
                            tmp = tmp.next;
                    }
                    else{
                        for(int i = used-1; i < 4; i++ ){
                            tmp.arr[i] = tmp.arr[i+1];
                        }
                        tmp.arr[4] = null;
                        elementNumber--;
                    }
                }
                if(isEmptyArr((E[]) tmp.arr)){ //If array is empty, removes empty node.
                    removeEmptyNode(tmp);
                }
            }
        }
        return (E) tmp.arr[index % 5];
    }

    /**
     * This method prints a list with arrays in the nodes using myListIterator.
     */
    public void printList(){

        int indexCounter = 0;
        MyListIterator myIter = new MyListIterator();

        System.out.println("Elements of list.");

        while(myIter.hasNext()){
            for(int i=0; i < 5; i++){
                if(myIter.nextNode.arr[i] != null){
                    System.out.println("Index "+indexCounter+ ": "+ myIter.nextNode.arr[i]);
                    indexCounter++;
                }
            }
            myIter.next();
        }
    }

    /**
     * This method prints list backward using myListIterator.
     */
    public void printListBack()
    {
        MyListIterator myIter2 = new MyListIterator();

        while(myIter2.hasPrevious()){
            for(int i=4; i >= 0; i--)
                System.out.println("Index "+myIter2.prevNode.arr[i]+": "+myIter2.prevNode.arr[i]);
            myIter2.previous();
        }
    }

    /**
     * This method checks if array is empty for removing an empty node.
     * @param arr is array that is checked.
     * @return true if array is empty, otherwise return false.
     */
    public boolean isEmptyArr(E [] arr)
    {
        for(int i = 0; i < 5; i++)
        {
            if(arr[i] != null)
                return false;
        }
        return true;
    }

    /**
     * This method checks if array is full for creating a new node.
     * @param arr is array that is checked.
     * @return true if array is full, otherwise return false.
     */
    public boolean isFullArr(E [] arr)
    {
        for(int i= 0 ; i < 5; i++)
        {
            if(arr[i] == null)
                return false;
        }
        return true;
    }

    /**
     * This method remove empty node when this nodes' array is fully empty.
     * @param node is node that is removed.
     */
    void removeEmptyNode(Node<E> node)
    {
        if(head.next  == null) //If there is 1 node.
        {
            head = null;
            tail = null;
        }
        else if(node == head) //This is for first node.
        {
            head = node.next;
            head.prev = null;
        }
        else if(node.next ==  null) //This is for last node
        {
            node = node.prev;
            node.next = null;
            tail = node;
        }
        else //Other conditions.
        {
            Node <E> current = head;
            while(current != node)
                current = current.next;

            current.prev.next= current.next;
            current.next.prev = current.prev;

            current = null;
        }
        size--;
    }
}
