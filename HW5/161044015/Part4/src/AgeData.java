/**
 * AgeData class which implements Comparable.
 */
public class AgeData implements Comparable<AgeData> {

    /**
     * Keeps age.
     */
    protected int age;
    /**
     * Keeps number of people for each age.
     */
    protected int numberOfPeople = 0;

    /**
     * AgeData constructor.
     * @param age initialize age.
     */
    public AgeData(int age){
        this.age = age;
    }

    /**
     * Overriding compareTo method.
     * @param o value to be compared.
     * @return if ages equals return 0,if the age is less than the other age return -1, otherwise return 1.
     */
    @Override
    public int compareTo(AgeData o) {
        if(o.age == age)
            return 0;
        else if(o.age > age)
            return -1;
        else
            return 1;

    }

    /**
     * Return age and number of people as a string.
     * @return age and number of people as a string.
     */
    public String toString(){

        String str = "";

        str += this.age + "-" + this.numberOfPeople + "\n";

        return str;
    }
}