/**
 * Software class which keeps software's name, quantity and price.
 * @author Medine Aslan
 */
public class Software implements Comparable<Software> {

    /**
     * Keeps name of software.
     */
    private String name;

    /**
     * Keeps quantity of software.
     */
    private int quantity;

    /**
     * Keeps price of software.
     */
    private int price;

    /**
     * Constructor of software.
     * @param name initialize name.
     * @param quantity initialize quantitiy.
     * @param price initialize price.
     */
    public Software(String name, int quantity, int price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * This is my toString method which I printed software contents.
     * @return software contents as a String.
     */
    public String toString() {

        String result = "";

        result += this.name;
        result += " ";
        result += this.quantity;
        result += " ";
        result += this.price;

        return result;
    }

    /**
     * Overriding compareTo method.
     * I compared name of softwares.
     * @param o software object to be compare.
     * @return 0 if objects are equal.
     */
    @Override
    public int compareTo(Software o) {
        if(this.name.compareTo(o.name) == 0)
            return 0;
        else if(this.name.compareTo(o.name) < 0)
            return -1;
        else
            return 1;
    }

    /**
     * Getter method of quantity.
     * @return quantity of software.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method of quantity.
     * @param quantity is new quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Setter method of name.
     * @param name is new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method of price.
     * @param price is new price.
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
