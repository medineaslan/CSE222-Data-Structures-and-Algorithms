import java.util.ArrayList;

/**
 * This abstract class extend the Administrators and BranchEmployee class.
 * This two class has a add and remove methods so I did this methods abstract using this UserAbstract class.
 * @author Medine ASLAN
 */
public abstract class UserAbstract implements CargoCompanyInterface
{
    /**
     * Keep administrators and branch employees name and surname.
     */
    private String nameSurname;

    /**
     * This array list keeps branches.
     */
    private static ArrayList<Branches> branches = new ArrayList<>();

    /**
     * Getter method of branches array list.
     * @return branches array.
     */
    public static ArrayList<Branches> getBranches()
    {
        return branches;
    }

    /**
     * Constructor of UserAbstract class.
     * @param nameSurname is init nameSurname.
     */
    public UserAbstract(String nameSurname)
    {
        this.setNameOrId(nameSurname);
    }

    /**
     * Overriding getter method of nameSurname.
     * @return nameSurname.
     */
    @Override
    public String getNameOrId()
    {
        return nameSurname;
    }

    /**
     * Overriding setter method of nameSurname.
     * @param newNameOrId keeps the new name or id.
     */
    @Override
    public void setNameOrId(String newNameOrId)
    {
        nameSurname = newNameOrId;
    }

    /**
     * I used this method to see branches array list contents.
     * @return branches array list contents.
     */
    @Override
    public String toString()
    {
        String result = "";

        for(int i = 0; i < branches.size(); ++i)
        {
            result += String.valueOf(i+1) + ")" + branches.get(i).getNameOrId() + "\n";
        }

        return result;
    }

    /**
     * I used this method to control if the branch is exist or not exist.
     * @param branchName keeps the branches name.
     * @return true if branch is exist, else return false.
     */
    public boolean branchIsExist(String branchName)
    {
        for(int i = 0; i < getBranches().size(); i++)
        {
            if(branchName == getBranches().get(i).getNameOrId())
            {
                return true;
            }
        }
        return false;
    }

    /**
     * This method used for add objects to branches.
     * @param branchName keeps the name of the branch to be added to the object.
     * @param objToAdd object to be added.
     */
    public abstract void addToBranch(String branchName, CargoCompanyInterface objToAdd);

    /**
     * This method used for remove objects from the branches.
     * @param branchName keeps the name of the branch to be removed to the object.
     * @param objToRemove object to be removed.
     */
    public abstract void removeFromBranch(String branchName, CargoCompanyInterface objToRemove);

    /**
     * This method add elements to cargo company automation system.
     * @param objToAdd object to be added.
     */
    public abstract void addToAutomationSystem(CargoCompanyInterface objToAdd);

    /**
     * This method remove elements from cargo company automation system.
     * @param objToRemove object to be removed.
     */
    public abstract void removeFromAutomationSystem(CargoCompanyInterface objToRemove);
}
