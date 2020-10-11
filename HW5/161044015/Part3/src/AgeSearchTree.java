/**
 *  AgeSearchTree class.
 * @param <E> type E.
 */
public class AgeSearchTree <E extends Comparable<AgeData>> extends BinarySearchTree<AgeData>{

    /**
     * Represent root of the tree.
     */
    private Node<AgeData> root;

    /**
     * Control removing succesfull or not.
     */
    private boolean isRemoved;

    /**
     * Overriding add method.
     * @param item inserted item
     * @return true if add succesfully otherwise false.
     */
    @Override
    public boolean add(AgeData item){
        root = add(root, item);

        return addReturn;
    }

    /**
     * Recursive helper method of add method.
     * This method add ages in tree recursively
     * Check if a node with that age exists. If it exists, number of people of AgeData object will be increased 1.
     * Otherwise a new node with the AgeData object will be inserted.
     * @param localRoot represent root node.
     * @param item item to be added.
     * @return true if add succesfully otherwise false.
     */
    private Node<AgeData> add(Node<AgeData> localRoot, AgeData item) {

        if (localRoot == null) {
            addReturn = true;
            item.numberOfPeople++;
            return new Node<>(item);
        }else if (item.compareTo(localRoot.data) == 0) {
            localRoot.data.numberOfPeople++;
            addReturn = false;
            return localRoot;
        }else if (item.compareTo(localRoot.data) < 0) {
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        }else{
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }

    /**
     * Overriding add method.
     * @param target removed value.
     * @return true if remove succesfully otherwise false.
     */
    @Override
    public boolean remove(AgeData target) {
        root = remove(root, target);
        return isRemoved;
    }

    /**
     * Recursive helper method of remove method.
     * Check if a node with that age exists.
     * If it exists, number of people of AgeData object is greater than 1, it will decrease the number of people field 1.
     * If the number of people field is 1, it will remove the node.
     * @param localRoot represent root node.
     * @param item item to be removed.
     * @return true if remove succesfully otherwise false.
     */
    private Node<AgeData> remove(Node<AgeData> localRoot, AgeData item) {

        if (localRoot == null) {
            isRemoved = false;
            return localRoot;
        }

        int compResult = item.compareTo(localRoot.data);
        if (compResult < 0) {
            localRoot.left = remove(localRoot.left, item);
            return localRoot;
        }else if (compResult > 0) {
            localRoot.right = remove(localRoot.right, item);
            return localRoot;
        }else {
            isRemoved = true;

            if(localRoot.data.numberOfPeople > 1){
                localRoot.data.numberOfPeople--;
                return localRoot;
            }
            else{
                if (localRoot.left == null) {
                    return localRoot.right;
                } else if (localRoot.right == null) {
                    return localRoot.left;
                } else {
                    if (localRoot.left.right == null) {
                        localRoot.data = localRoot.left.data;
                        localRoot.left = localRoot.left.left;
                        return localRoot;
                    } else {
                        localRoot.data = findLargestChild(localRoot.left);
                        return localRoot;
                    }
                }
            }
        }
    }

    /**
     * This method using for remove method.
     * @param parent represents parent node.
     * @return largest child.
     */
    private AgeData findLargestChild(Node<AgeData> parent) {
        if (parent.right.right == null) {
            AgeData returnValue = parent.right.data;
            parent.right = parent.right.left;
            return returnValue;
        }else{
            return findLargestChild(parent.right);
        }
    }

    /**
     * Prints tree as a string.
     * @return string which represents tree.
     */
    public String toString(){
        String str = "";
        String returnStr;

        returnStr = toString(root, str);

        return returnStr;
    }

    /**
     * Recursive helper method of toString method.
     * Prints tree as a string.
     * @param root represents root node.
     * @param str which keeps tree.
     * @return string which represents tree.
     */
    private String toString(Node<AgeData> root, String str)
    {
        if (root == null){
            str += "null\n";
            return str;
        }

        str += root.data.age + "-" + root.data.numberOfPeople + "\n";

        str = toString(root.left, str);

        return str = toString(root.right, str);

    }

    /**
     * Get an AgeData object of any age and find the AgeData object with the same age and return it.
     * @param target searched value.
     * @return Finding ageData object.
     */
    @Override
    public AgeData find(AgeData target) {
        return find(root, target);
    }

    /**
     * Recursive helper method of find method.
     * Get an AgeData object of any age and find the AgeData object with the same age and return it.
     * @param localRoot represents root node.
     * @param target searched value.
     * @return Finding ageData object.
     */
    private AgeData find(Node<AgeData> localRoot, AgeData target) {

        if (localRoot == null)
            return null;

        int compResult = target.compareTo(localRoot.data);

        if (compResult == 0)
            return localRoot.data;
        else if (compResult < 0)
            return find(localRoot.left, target);
        else
            return find(localRoot.right, target);
    }

    /**
     * This method returns the number of people younger than an age.
     * @param item represents age.
     * @return the number of people younger than an age.
     */
    public int youngerThan(int item){

        int num = 0;
        num = youngerThan(root, item);
        return num;
    }

    /**
     * Recursive helper method of youngerThan method.
     * This method returns the number of people younger than an age.
     * @param localRoot represents root node.
     * @param item represents age.
     * @return the number of people younger than an age.
     */
    private int youngerThan(Node<AgeData> localRoot, int item){

        if(localRoot.left == null && localRoot.right == null){
            if(localRoot.data.age < item)
                return localRoot.data.numberOfPeople;
            else
                return 0;
        }
        int leftSum= 0;
        int rightSum = 0;
        int totalSum = 0;

        if(localRoot.left != null ){
            leftSum += youngerThan(localRoot.left, item);
        }
        if(localRoot.right != null && localRoot.data.age < item){
            rightSum += youngerThan(localRoot.right, item);
        }

        totalSum = leftSum + rightSum;

        if(localRoot.data.age < item)
            totalSum += localRoot.data.numberOfPeople;

        return totalSum;
    }

    /**
     * This method returns the number of people younger than an age.
     * @param item represents age.
     * @return the number of people older than an age.
     */
    public int olderThan(int item){

        int num = 0;
        num = olderThan (root, item);
        return num;
    }

    /**
     * Recursive helper method of olderThan method.
     * This method returns the number of people older than an age.
     * @param localRoot represents root node.
     * @param item represents age.
     * @return the number of people older than an age.
     */
    private int olderThan(Node<AgeData> localRoot, int item){

        if(localRoot.left == null && localRoot.right == null){
            if(localRoot.data.age > item)
                return localRoot.data.numberOfPeople;
            else
                return 0;
        }
        int leftSum= 0;
        int rightSum = 0;
        int totalSum = 0;

        if(localRoot.right != null ){
            rightSum += olderThan(localRoot.right, item);
        }
        if(localRoot.left != null && localRoot.data.age > item){
            leftSum += olderThan(localRoot.left, item);
        }

        totalSum = leftSum + rightSum;

        if(localRoot.data.age > item)
            totalSum += localRoot.data.numberOfPeople;

        return totalSum;
    }

}
