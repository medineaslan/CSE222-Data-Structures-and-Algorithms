/**
 *The SearchTree Interface
 * @param <E> type E.
 */
public interface SearchTree <E> {

    /**
     * Inserts item where it belongs in  the tree.
     * @param item inserted item
     * @return  Returns true if item is inserted; false if it isn’t
     */
    boolean add(E item);

    /**
     * Returns true if target is  found in the tree
     * @param target searched value.
     * @return Returns true if target is  found in the tree
     */
    boolean contains(E target);

    /**
     * Returns a reference to the data in  the node that is equal to target. If no such node is found, returns null
     * @param target searched value.
     * @return Returns a reference to the data in  the node that is equal to target. If no such node is found, returns null
     */
    E find(E target);

    /**
     * Removes target (if found) from tree and returns it; otherwise, returns null
     * @param target deleted value.
     * @return Removes target (if found) from tree and returns it; otherwise, returns null
     */
    E delete(E target);

    /**
     * Removes target (if found) from tree and returns true; otherwise, returns false
     * @param target removed value.
     * @return Removes target (if found) from tree and returns true; otherwise, returns false
     */
    boolean remove(E target);

}
